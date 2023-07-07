package top.abigtree.wiki.pojo.statements.datavalue;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class MonText implements AbstractValue{
    String text;

    String language;
}
