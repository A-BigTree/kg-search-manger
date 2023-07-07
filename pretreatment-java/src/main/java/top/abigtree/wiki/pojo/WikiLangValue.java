package top.abigtree.wiki.pojo;

import lombok.Data;
import top.abigtree.wiki.enums.LanguageEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiLangValue {
    LanguageEnum language;

    String value;

    public void setLanguage(String language) {
        this.language = LanguageEnum.getLanguage(language);
    }

    public String getLanguage() {
        return language.getName();
    }

    public LanguageEnum languageEnum(){
        return language;
    }
}
