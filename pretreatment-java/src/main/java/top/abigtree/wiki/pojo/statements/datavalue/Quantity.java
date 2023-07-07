package top.abigtree.wiki.pojo.statements.datavalue;

import java.math.BigDecimal;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class Quantity implements AbstractValue{
    BigDecimal amount;

    BigDecimal upperBound;

    BigDecimal lowerBound;

    String unit;
}
