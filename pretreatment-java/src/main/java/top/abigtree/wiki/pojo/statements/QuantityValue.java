package top.abigtree.wiki.pojo.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.wiki.pojo.statements.datavalue.Quantity;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuantityValue extends WikiDataValue{
    Quantity value;

    public final static String TYPE = "quantity";

    public QuantityValue(){
        setType(TYPE);
    }
}
