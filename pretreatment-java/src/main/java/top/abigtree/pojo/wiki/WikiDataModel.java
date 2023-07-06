package top.abigtree.pojo.wiki;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.pojo.wiki.enums.EntityTypeEnum;
import top.abigtree.pojo.wiki.statements.WikiStatement;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiDataModel {
    String id;

    EntityTypeEnum type;

    @JsonProperty("datatype")
    String dataType;

    String title;

    @JsonProperty("pageid")
    Integer pageId;

    Integer ns;

    Long lastrevid;

    String modified;

    Map<String, WikiLangValue> labels;

    Map<String, WikiLangValue> descriptions;

    Map<String, List<WikiLangValue>> aliases;

    Map<String, List<WikiStatement>> claims;

    public void setType(String type) {
        this.type = EntityTypeEnum.getEntityType(type);
    }
}
