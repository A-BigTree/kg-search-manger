package top.abigtree.wiki.pojo.statements;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value= EntityValue.class, name = EntityValue.TYPE),
        @JsonSubTypes.Type(value = GlobeValue.class, name = GlobeValue.TYPE),
        @JsonSubTypes.Type(value = MonTextValue.class, name = MonTextValue.TYPE),
        @JsonSubTypes.Type(value = QuantityValue.class, name = QuantityValue.TYPE),
        @JsonSubTypes.Type(value = StringValue.class, name = StringValue.TYPE),
        @JsonSubTypes.Type(value = TimeValue.class, name = TimeValue.TYPE)
})
@Data
public class WikiDataValue {
    String type;
}
