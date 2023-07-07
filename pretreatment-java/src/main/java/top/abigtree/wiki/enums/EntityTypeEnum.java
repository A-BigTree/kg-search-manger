package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum EntityTypeEnum {
    ITEM("item"),

    PROPERTY("property"),

    LEXEME("lexeme"),

    FORM("form"),

    SENSE("sense"),
    ;

    final static HashMap<String, EntityTypeEnum> mapper = new HashMap<>();

    static {
        for(EntityTypeEnum entityType:EntityTypeEnum.values()){
            mapper.put(entityType.getType(), entityType);
        }
    }

    final String type;

    EntityTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public static EntityTypeEnum getEntityType(String type){
        return mapper.getOrDefault(type, null);
    }

    public String toString(){
        return this.name() + ":" + this.getType();
    }
}
