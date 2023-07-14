package top.abigtree.wiki.pojo.statements;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.wiki.enums.DataTypeEnum;
import top.abigtree.wiki.enums.SnakTypeEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiSnak {
    @JsonProperty("snaktype")
    private SnakTypeEnum snakType;

    private String hash;

    private String property;

    @JsonProperty("datatype")
    private DataTypeEnum dataType;

    @JsonProperty("datavalue")
    private WikiDataValue dataValue;

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

    public DataTypeEnum dataTypeEnum(){
        return dataType;
    }

    public SnakTypeEnum snakTypeEnum(){
        return snakType;
    }
}
