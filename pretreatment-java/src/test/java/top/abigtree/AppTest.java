package top.abigtree;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import top.abigtree.wiki.pojo.WikiDataModel;
import top.abigtree.wiki.enums.LanguageEnum;
import top.abigtree.wiki.util.AnalysisUtil;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Slf4j
public class AppTest {
    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testLang(){
        log.info(LanguageEnum.getLanguage("en").toString());
    }

    @Test
    public void json2Object1() throws JsonProcessingException {
        String json = "{\"pageid\":186,\"ns\":0,\"title\":\"Q60\",\"lastrevid\":1928151088,\"modified\":\"2023-07-03T07:45:27Z\",\"type\":\"item\",\"id\":\"Q60\",\"label\":{\"en\":{\"language\":\"en\",\"value\":\"New York City\"}},\"descriptions\":{\"en\":{\"language\":\"en\",\"value\":\"most populous city in the United States of America\"}},\"aliases\":{\"en\":[{\"language\":\"en\",\"value\":\"NYC\"},{\"language\":\"en\",\"value\":\"the five boroughs\"},{\"language\":\"en\",\"value\":\"Big Apple\"},{\"language\":\"en\",\"value\":\"City of New York\"},{\"language\":\"en\",\"value\":\"NY City\"},{\"language\":\"en\",\"value\":\"New York, New York\"},{\"language\":\"en\",\"value\":\"New York City, New York\"},{\"language\":\"en\",\"value\":\"New York, NY\"},{\"language\":\"en\",\"value\":\"New York City, NY\"},{\"language\":\"en\",\"value\":\"Caput Mundi\"},{\"language\":\"en\",\"value\":\"The City So Nice They Named It Twice\"},{\"language\":\"en\",\"value\":\"Capital of the World\"},{\"language\":\"en\",\"value\":\"New York\"},{\"language\":\"en\",\"value\":\"New York City (NYC)\"},{\"language\":\"en\",\"value\":\"New York (city)\"},{\"language\":\"en\",\"value\":\"city of New York\"},{\"language\":\"en\",\"value\":\"Center of the Universe\"}]}}";

        WikiDataModel wikiDataModel = mapper.readValue(json, WikiDataModel.class);
        log.info(wikiDataModel.toString());

    }

    @Test
    public void json2Object2() throws IOException {
        URL url = this.getClass().getClassLoader().getResource("test.json");
        WikiDataModel wikiDataModel = mapper.readValue(url, WikiDataModel.class);

        String json2 = mapper.writeValueAsString(wikiDataModel);
        log.info(mapper.readValue(json2, WikiDataModel.class).toString());
    }

    @Test
    public void testBasicData() throws IOException {
        URL url = this.getClass().getClassLoader().getResource("test.json");
        WikiDataModel wikiDataModel = (WikiDataModel) AnalysisUtil.convertToObject(url, WikiDataModel.class);
        log.info(AnalysisUtil.getBasicDataByLangEnum(wikiDataModel, LanguageEnum.UN_CONFIG).toString());
    }
}
