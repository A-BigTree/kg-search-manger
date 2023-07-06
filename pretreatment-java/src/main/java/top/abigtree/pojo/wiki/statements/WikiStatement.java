package top.abigtree.pojo.wiki.statements;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiStatement {
    String id;

    String type;

    String rank;

    Map<String, List<WikiStatement>> qualifiers;

    @JsonProperty("datavalue")
    WikiDataValue dataValue;
}
