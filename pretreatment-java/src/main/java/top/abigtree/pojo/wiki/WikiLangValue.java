package top.abigtree.pojo.wiki;

import lombok.Data;
import top.abigtree.pojo.wiki.enums.LanguageEnum;

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
}
