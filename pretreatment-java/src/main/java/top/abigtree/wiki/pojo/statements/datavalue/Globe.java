package top.abigtree.wiki.pojo.statements.datavalue;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class Globe implements AbstractValue{
    Double latitude;

    Double longitude;

    @Deprecated
    Object altitude;

    Double precision;

    String globe;
}
