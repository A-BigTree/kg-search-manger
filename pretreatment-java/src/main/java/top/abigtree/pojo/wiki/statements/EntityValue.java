package top.abigtree.pojo.wiki.statements;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.pojo.wiki.enums.EntityTypeEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EntityValue extends WikiDataValue{
    @JsonProperty("entity-type")
    EntityTypeEnum entityType;

    String id;

    @JsonProperty("numeric-id")
    Integer numericId;

    public void setEntityType(String entityType) {
        this.entityType = EntityTypeEnum.getEntityType(entityType);
    }

    public String getEntityType() {
        return entityType.getType();
    }
}
