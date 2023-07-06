package top.abigtree.pojo.wiki.statements;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiSnak {
    @JsonProperty("snaktype")
    String snakType;

    String property;

    @JsonProperty("datatype")
    String dataType;

    @JsonProperty("datavalue")
    WikiDataValue dataValue;
}
