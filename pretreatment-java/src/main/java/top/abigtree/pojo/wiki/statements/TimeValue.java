package top.abigtree.pojo.wiki.statements;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.abigtree.pojo.wiki.enums.TimeUnitEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class TimeValue extends AbstractValue {
    String time;

    @JsonProperty("timezone")
    int timeZone;

    int before;

    int after;

    @JsonProperty("calendarmodel")
    String calendarModel;

    TimeUnitEnum precision;

    public void setPrecision(Integer precision) {
        this.precision = TimeUnitEnum.getTimeUnit(precision);
    }

    public Integer getPrecision() {
        return precision.getIndex();
    }
}
