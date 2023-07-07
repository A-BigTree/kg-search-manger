package top.abigtree.wiki.pojo.statements;


import lombok.Data;
import lombok.EqualsAndHashCode;

import top.abigtree.wiki.pojo.statements.datavalue.Time;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TimeValue extends WikiDataValue {
    Time value;

    public final static String TYPE = "time";

    public TimeValue(){
        setType(TYPE);
    }
}
