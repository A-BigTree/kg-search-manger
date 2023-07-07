package top.abigtree.wiki.pojo.statements;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiReference {
    String hash;

    Map<String, List<WikiSnak>> snaks;

    @JsonProperty("snaks-order")
    List<String> snaksOrder;

}
