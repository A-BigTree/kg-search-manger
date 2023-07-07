package top.abigtree.wiki.enums;

import java.util.HashMap;

/**
 * @author Shuxin-Wang <wangshuxin662@gmail.com>
 * Created on 2023/7/6
 */
public enum TimeUnitEnum {
    GIGA_YEAR_1("1 Giga Year", 0),

    MEGA_YEARS_100("100 Mega Years", 1),

    MEGA_YEARS_10("10 Mega Years", 2),

    MEGA_YEAR_1("1 Mega Year", 3),

    KILO_YEARS_100("100 Kilo Years", 4),

    KILO_YEARS_10("10 Kilo Years", 5),

    MILLENNIUM("millennium", 6),

    CENTURY("1 Century", 7),

    YEARS_10("10 Years", 8),

    YEARS("Years", 9),

    MONTHS("Months", 10),

    DAYS("Days", 11),

    HOURS("Hours", 12),

    MINUTES("Minutes", 13),

    SECONDS("Seconds", 14)
    ;

    final static HashMap<Integer, TimeUnitEnum> mapper = new HashMap<>();

    static {
        for(TimeUnitEnum timeUnit:TimeUnitEnum.values()){
            mapper.put(timeUnit.getIndex(), timeUnit);
        }
    }



    final String unit;
    final Integer index;

    TimeUnitEnum(String unit, Integer index){
        this.unit = unit;
        this.index = index;
    }

    public Integer getIndex(){
        return index;
    }

    public String getUnit() {
        return unit;
    }

    public static TimeUnitEnum getTimeUnit(Integer index){
        return mapper.getOrDefault(index, null);
    }
}
