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
    private String time;

    @JsonProperty("timezone")
    private Integer timeZone;

    private Integer before;

    private Integer after;

    @JsonProperty("calendarmodel")
    private String calendarModel;

    private TimeUnitEnum precision;

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
