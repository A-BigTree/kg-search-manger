package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum StatementsRankEnum {
    PREFERRED("preferred"),

    NORMAL("normal"),

    DEPRECATED("deprecated");

    private final static HashMap<String, StatementsRankEnum> mapper = new HashMap<>();

    static {
        for (StatementsRankEnum rank:StatementsRankEnum.values()){
            mapper.put(rank.getName(), rank);
        }
    }

    final String rank;

    StatementsRankEnum(String rank){
        this.rank = rank;
    }

    public String getName(){
        return rank;
    }

    public static StatementsRankEnum getRank(String rank){
        return mapper.getOrDefault(rank, null);
    }

    public String toString(){
        return this.name() + ":" + this.getName();
    }
}
