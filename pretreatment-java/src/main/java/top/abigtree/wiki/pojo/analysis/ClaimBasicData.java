package top.abigtree.wiki.pojo.analysis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.abigtree.wiki.enums.DataTypeEnum;
import top.abigtree.wiki.enums.ValueTypeEnum;
import top.abigtree.wiki.pojo.statements.EntityValue;
import top.abigtree.wiki.pojo.statements.GlobeValue;
import top.abigtree.wiki.pojo.statements.MonTextValue;
import top.abigtree.wiki.pojo.statements.QuantityValue;
import top.abigtree.wiki.pojo.statements.StringValue;
import top.abigtree.wiki.pojo.statements.TimeValue;
import top.abigtree.wiki.pojo.statements.WikiDataValue;
import top.abigtree.wiki.pojo.statements.WikiStatement;
import top.abigtree.wiki.pojo.statements.datavalue.AbstractValue;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/14
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ClaimBasicData {
    private String pId;

    private DataTypeEnum dataType;

    private AbstractValue value;

    public ClaimBasicData(WikiStatement statement){
        this.pId = statement.getId();
        this.dataType = statement.getMainSnak().dataTypeEnum();
        this.value = initValue(statement);
    }


    public static AbstractValue initValue(WikiStatement statement){
        WikiDataValue dataValue = statement.getMainSnak().getDataValue();
        return buildValue(dataValue, statement.getMainSnak().dataTypeEnum().getValueType());
    }

    public static AbstractValue buildValue(WikiDataValue dataValue, ValueTypeEnum valueType){
        switch (valueType) {
            case STRING:
                return (StringValue) dataValue;
            case TIME:
                assert dataValue instanceof TimeValue;
                return ((TimeValue) dataValue).getValue();
            case WIKI_BASE_ENTITY_ID:
                assert dataValue instanceof EntityValue;
                return ((EntityValue) dataValue).getValue();
            case GLOBE_COORDINATE:
                assert dataValue instanceof GlobeValue;
                return ((GlobeValue) dataValue).getValue();
            case QUANTITY:
                assert dataValue instanceof QuantityValue;
                return ((QuantityValue) dataValue).getValue();
            case MONOLINGUAL_TEXT:
                assert dataValue instanceof MonTextValue;
                return ((MonTextValue) dataValue).getValue();
            default:
                return new StringValue();
        }
    }
}
