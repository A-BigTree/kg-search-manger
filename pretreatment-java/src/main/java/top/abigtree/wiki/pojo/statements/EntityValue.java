package top.abigtree.wiki.pojo.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.wiki.pojo.statements.datavalue.Entity;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EntityValue extends WikiDataValue{
    Entity value;

    static final String TYPE = "wikibase-entityid";

    public EntityValue(){
        setType(TYPE);
    }
}
