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
    private String id;

    private String type;

    private StatementsRankEnum rank;

    private Map<String, List<WikiSnak>> qualifiers;

    @JsonProperty("qualifiers-order")
    private List<String> qualifiersOrder;

    @JsonProperty("mainsnak")
    private WikiSnak mainSnak;

    private List<WikiReference> references;

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
