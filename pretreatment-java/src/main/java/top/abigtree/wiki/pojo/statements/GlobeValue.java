package top.abigtree.wiki.pojo.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.wiki.pojo.statements.datavalue.Globe;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GlobeValue extends WikiDataValue{
    Globe value;

    public final static String TYPE = "globecoordinate";

    public GlobeValue(){
        setType(TYPE);
    }
}
