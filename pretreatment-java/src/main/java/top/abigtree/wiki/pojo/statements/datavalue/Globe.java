package top.abigtree.wiki.pojo.statements.datavalue;

import lombok.Data;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class Globe implements AbstractValue{
    private Double latitude;

    private Double longitude;

    @Deprecated
    private Object altitude;

    private Double precision;

    private String globe;
}
