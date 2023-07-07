package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum LanguageEnum {
    UN_CONFIG("un-config"),

    EN("en"),

    CN("zh"),

    FR("fr"),

    IT("it");

    private final static HashMap<String, LanguageEnum> mapper = new HashMap<>();

    static {
        for(LanguageEnum lang: LanguageEnum.values()){
            mapper.put(lang.getName(), lang);
        }
    }

    private final String lang;

    LanguageEnum(String lang){
        this.lang = lang;
    }

    public String getName(){
        return lang;
    }

    public static LanguageEnum getLanguage(String langName){
        return mapper.getOrDefault(langName, UN_CONFIG);
    }

    public String toString(){
        return this.name() + ": " + this.getName();
    }
}
