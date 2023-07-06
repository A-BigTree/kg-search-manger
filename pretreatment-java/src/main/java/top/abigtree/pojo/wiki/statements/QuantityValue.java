package top.abigtree.pojo.wiki.statements;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuantityValue extends AbstractValue{
    BigDecimal amount;

    BigDecimal upperBound;

    BigDecimal lowerBound;

    String unit;
}
