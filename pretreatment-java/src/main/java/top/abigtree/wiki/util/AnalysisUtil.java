package top.abigtree.wiki.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import top.abigtree.wiki.enums.LanguageEnum;
import top.abigtree.wiki.pojo.WikiDataModel;
import top.abigtree.wiki.pojo.WikiLangValue;
import top.abigtree.wiki.pojo.analysis.EntityBasicData;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Slf4j
public class AnalysisUtil {
    public final static ObjectMapper INSTANCE = new ObjectMapper();

    public static Object convertToObject(String json, Class<?> clazz) {
        Object res;
        try {
            res = INSTANCE.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            log.error("Json String:{} convert error", json);
            throw new RuntimeException(e);
        }
        return res;
    }

    public static String covertToString(Object target) {
        String res;
        try {
            res = INSTANCE.writeValueAsString(target);
        } catch (JsonProcessingException e) {
            log.error("Object:{} convert error", target);
            throw new RuntimeException(e);
        }
        return res;
    }

    public static Object convertToObject(URL url, Class<?> clazz) {
        Object res;
        try {
            res = INSTANCE.readValue(url, clazz);
        } catch (JsonProcessingException e) {
            log.error("URL Path:{} convert error", url);
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public static Object convertToObject(File file, Class<?> clazz) {
        Object res;
        try {
            res = INSTANCE.readValue(file, clazz);
        } catch (JsonProcessingException e) {
            log.error("File:{} convert error", file);
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public static EntityBasicData getBasicDataByLangEnum(@NonNull WikiDataModel data, LanguageEnum languageEnum) {
        LanguageEnum lang = Optional.ofNullable(languageEnum)
                .map(language -> {
                    if (language == LanguageEnum.UN_CONFIG) {
                        log.warn("Parameter language is not config, using default lang:en");
                        return LanguageEnum.EN;
                    } else {
                        return language;
                    }
                })
                .orElseGet(() -> {
                    log.warn("Parameter language is Null, using default lang:en");
                    return LanguageEnum.EN;
                });
        return getBasicDataByLangName(data, lang.getName());
    }

    public static EntityBasicData getBasicDataByLangName(@NonNull WikiDataModel data, @NonNull String lang) {
        Map<String, WikiLangValue> labels = data.getLabels();
        Map<String, WikiLangValue> descriptions = data.getDescriptions();
        Map<String, List<WikiLangValue>> aliases = data.getAliases();
        return covertBasicData(lang, data, labels, descriptions, aliases);
    }

    private static EntityBasicData covertBasicData(
            String lang,
            WikiDataModel data,
            Map<String, WikiLangValue> labels,
            Map<String, WikiLangValue> descriptions,
            Map<String, List<WikiLangValue>> aliases) {
        EntityBasicData entity = new EntityBasicData();
        entity.setId(Integer.parseInt(data.getId().substring(1)));
        entity.setLang(lang);
        entity.setLanguage(LanguageEnum.getLanguage(lang));
        if (labels.containsKey(lang)) {
            entity.setLabel(labels.get(lang).getValue());
        }
        if (descriptions.containsKey(lang)) {
            entity.setDescription(descriptions.get(lang).getValue());
        }
        List<String> ali = new ArrayList<>();
        if (aliases.containsKey(lang)) {
            for (WikiLangValue value : aliases.get(lang)) {
                ali.add(value.getValue());
            }
        }
        entity.setAliases(ali);

        return entity;
    }


}
