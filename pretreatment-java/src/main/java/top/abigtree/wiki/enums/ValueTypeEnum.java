package top.abigtree.wiki.enums;

import java.util.HashMap;

import lombok.Getter;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Getter
public enum ValueTypeEnum {
    UN_KNOW(0, "un-know"),
    STRING(1, "string"),
    WIKI_BASE_ENTITY_ID(2, "wikibase-entityid"),
    GLOBE_COORDINATE(3, "globecoordinate"),
    MONOLINGUAL_TEXT(4, "monolingualtext"),
    QUANTITY(5, "quantity"),
    TIME(6, "time")
    ;

    final static HashMap<String, ValueTypeEnum> mapper = new HashMap<>();
    final static HashMap<Integer, ValueTypeEnum> idMapper = new HashMap<>();

    static {
        for(ValueTypeEnum valueType:ValueTypeEnum.values()){
            mapper.put(valueType.getType(), valueType);
            idMapper.put(valueType.getTypeId(), valueType);
        }
    }


    final Integer typeId;

    final String type;

    ValueTypeEnum(Integer id, String type){
        this.typeId = id;
        this.type = type;
    }

    public static ValueTypeEnum getValueType(String type){
        return mapper.getOrDefault(type, UN_KNOW);
    }

    public String toString(){
        return this.name() + ":" + this.getType();
    }
}
