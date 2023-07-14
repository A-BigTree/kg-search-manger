package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum DataTypeEnum {
    DEFAULT("default", ValueTypeEnum.UN_KNOW),
    TIME("time", ValueTypeEnum.TIME),
    COMMONS_MEDIA("commonsMedia", ValueTypeEnum.STRING),
    GLOBE_COORDINATE("globe-coordinate", ValueTypeEnum.GLOBE_COORDINATE),
    WIKI_BASE_ITEM("wikibase-item", ValueTypeEnum.WIKI_BASE_ENTITY_ID),
    WIKI_BASE_PROPERTY("wikibase-property", ValueTypeEnum.WIKI_BASE_ENTITY_ID),
    STRING("string", ValueTypeEnum.STRING),
    MONOLINGUAL_TEXT("monolingualtext", ValueTypeEnum.MONOLINGUAL_TEXT),
    EXTERNAL_ID("external-id", ValueTypeEnum.STRING),
    QUANTITY("quantity", ValueTypeEnum.QUANTITY),
    URL("url", ValueTypeEnum.STRING),
    MATH("math", ValueTypeEnum.STRING),
    GEOGRAPHIC_SHAPE("geo-shape", ValueTypeEnum.STRING),
    MUSICAL_NOTATION("musical-notation", ValueTypeEnum.STRING),
    TABULAR_DATA("tabular-data", ValueTypeEnum.STRING),
    WIKI_BASE_LEXEME("wikibase-lexeme", ValueTypeEnum.WIKI_BASE_ENTITY_ID),
    WIKI_BASE_FORM("wikibase-form", ValueTypeEnum.WIKI_BASE_ENTITY_ID),
    WIKI_BASE_SENSE("wikibase-sense", ValueTypeEnum.WIKI_BASE_ENTITY_ID)
    ;

    final static HashMap<String, DataTypeEnum> mapper = new HashMap<>();

    static {
        for (DataTypeEnum dataType:DataTypeEnum.values()){
            mapper.put(dataType.getType(), dataType);
        }
    }


    final String type;

    final ValueTypeEnum valueType;

    DataTypeEnum(String type, ValueTypeEnum valueType){
        this.type = type;
        this.valueType = valueType;
    }

    public String getType(){
        return type;
    }

    public ValueTypeEnum getValueType(){
        return valueType;
    }

    public static DataTypeEnum getDataType(String type){
        return mapper.getOrDefault(type, null);
    }

    public String toString(){
        return this.name() + ":" + this.getType();
    }
}
