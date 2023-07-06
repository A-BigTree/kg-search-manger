package top.abigtree.pojo.wiki.statements;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GlobeValue extends AbstractValue{
    Double latitude;

    Double longitude;

    @Deprecated
    Object altitude;

    Double precision;

    String globe;
}
