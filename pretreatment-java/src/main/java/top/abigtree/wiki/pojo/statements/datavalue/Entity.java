package top.abigtree.wiki.pojo.statements.datavalue;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.wiki.enums.EntityTypeEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class Entity implements AbstractValue{
    @JsonProperty("entity-type")
    private EntityTypeEnum entityType;

    private String id;

    @JsonProperty("numeric-id")
    private Integer numericId;

    public void setEntityType(String entityType) {
        this.entityType = EntityTypeEnum.getEntityType(entityType);
    }

    public String getEntityType() {
        return entityType.getType();
    }

    public EntityTypeEnum entityTypeEnum(){
        return entityType;
    }

}
