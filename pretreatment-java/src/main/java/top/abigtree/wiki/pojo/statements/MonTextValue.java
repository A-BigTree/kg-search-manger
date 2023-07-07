package top.abigtree.wiki.pojo.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.wiki.pojo.statements.datavalue.MonText;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MonTextValue extends WikiDataValue{
    MonText value;

    final static String TYPE = "monolingualtext";

    public MonTextValue(){
        setType(TYPE);
    }
}
