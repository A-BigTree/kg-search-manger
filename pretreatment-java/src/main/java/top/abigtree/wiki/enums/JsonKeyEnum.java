package top.abigtree.wiki.enums;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
public enum JsonKeyEnum {
    ID("id"),

    LANGUAGE("language"),

    TYPE("type"),

    LABELS("label"),

    DESCRIPTION("description"),

    ALIASES("aliases"),

    CLAIMS("claims"),
    ;


    final String key;

    JsonKeyEnum(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }
}
