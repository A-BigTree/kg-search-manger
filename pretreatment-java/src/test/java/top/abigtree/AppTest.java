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
