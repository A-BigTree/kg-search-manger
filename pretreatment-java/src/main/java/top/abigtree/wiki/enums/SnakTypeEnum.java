package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum SnakTypeEnum {
    VALUE("value"),

    SOME_VALUE("somevalue"),

    NO_VALUE("novalue");

    final static HashMap<String, SnakTypeEnum> mapper = new HashMap<>();

    static {
        for(SnakTypeEnum snakType:SnakTypeEnum.values()){
            mapper.put(snakType.getType(), snakType);
        }
    }

    final String type;


    SnakTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public static SnakTypeEnum getSnakType(String type){
        return mapper.getOrDefault(type, null);
    }

    public String toString(){
        return this.name() + ":" + this.getType();
    }
}
