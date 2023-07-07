package top.abigtree.wiki.pojo.statements.datavalue;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import top.abigtree.wiki.enums.TimeUnitEnum;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/7
 */
@Data
public class Time implements AbstractValue{
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

    public TimeUnitEnum timeUnitEnum(){
        return precision;
    }
}
