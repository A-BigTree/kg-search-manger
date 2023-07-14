package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum ValueTypeEnum {
    UN_KNOW("un-know"),
    STRING("string"),
    WIKI_BASE_ENTITY_ID("wikibase-entityid"),
    GLOBE_COORDINATE("globecoordinate"),
    MONOLINGUAL_TEXT("monolingualtext"),
    QUANTITY("quantity"),
    TIME("time")
    ;

    final static HashMap<String, ValueTypeEnum> mapper = new HashMap<>();

    static {
        for(ValueTypeEnum valueType:ValueTypeEnum.values()){
            mapper.put(valueType.getType(), valueType);
        }
    }


    final String type;

    ValueTypeEnum(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public static ValueTypeEnum getValueType(String type){
        return mapper.getOrDefault(type, UN_KNOW);
    }

    public String toString(){
        return this.name() + ":" + this.getType();
    }
}
