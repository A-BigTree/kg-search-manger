package top.abigtree.wiki.pojo.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StringValue extends WikiDataValue{
    String value;

    final static String TYPE = "string";

    public StringValue(){
        setType(TYPE);
    }
}
