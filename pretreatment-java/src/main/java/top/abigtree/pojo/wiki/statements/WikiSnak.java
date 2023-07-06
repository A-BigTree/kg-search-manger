package top.abigtree.pojo.wiki.statements;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.pojo.wiki.enums.DataTypeEnum;
import top.abigtree.pojo.wiki.enums.SnakTypeEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiSnak {
    @JsonProperty("snaktype")
    SnakTypeEnum snakType;

    String hash;

    String property;

    @JsonProperty("datatype")
    DataTypeEnum dataType;

    @JsonProperty("datavalue")
    WikiDataValue dataValue;

    public void setSnakType(String snakType) {
        this.snakType = SnakTypeEnum.getSnakType(snakType);
    }

    public void setDataType(String dataType) {
        this.dataType = DataTypeEnum.getDataType(dataType);
    }

    public String getSnakType() {
        return snakType.getType();
    }

    public String getDataType(){
        return dataType.getType();
    }
}
