package top.abigtree.wiki.pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.wiki.enums.DataTypeEnum;
import top.abigtree.wiki.enums.EntityTypeEnum;
import top.abigtree.wiki.pojo.statements.WikiStatement;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiDataModel {
    private String id;

    private EntityTypeEnum type;

    @JsonProperty("datatype")
    private DataTypeEnum dataType = DataTypeEnum.DEFAULT;

    private String title;

    @JsonProperty("pageid")
    private Integer pageId;

    private Integer ns;

    private Long lastrevid;

    private String modified;

    private Map<String, WikiLangValue> labels;

    private Map<String, WikiLangValue> descriptions;

    private Map<String, List<WikiLangValue>> aliases;

    private Map<String, List<WikiStatement>> claims;

    @JsonProperty("sitelinks")
    private Map<String, WikiSiteLink> siteLinks;

    public void setType(String type) {
        this.type = EntityTypeEnum.getEntityType(type);
    }

    public void setDataType(String dataType){
        this.dataType = DataTypeEnum.getDataType(dataType);
    }

    public String getDataType() {
        return dataType.getType();
    }

    public String getType() {
        return type.getType();
    }

    public DataTypeEnum dataTypeEnum(){
        return dataType;
    }

    public EntityTypeEnum entityTypeEnum(){
        return type;
    }
}
