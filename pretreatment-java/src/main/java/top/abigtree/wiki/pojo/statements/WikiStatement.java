package top.abigtree.wiki.pojo.statements;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.wiki.enums.StatementsRankEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@Data
public class WikiStatement {
    String id;

    String type;

    StatementsRankEnum rank;

    Map<String, List<WikiSnak>> qualifiers;

    @JsonProperty("qualifiers-order")
    List<String> qualifiersOrder;

    @JsonProperty("mainsnak")
    WikiSnak mainSnak;

    List<WikiReference> references;

    public void setRank(String rank){
        this.rank = StatementsRankEnum.getRank(rank);
    }

    public String getRank() {
        return rank.getName();
    }

    public StatementsRankEnum rankEnum(){
        return rank;
    }
}
