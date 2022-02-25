package com.jcs.ff.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WaterCondition {

    private double swellDirection;
    private double swellHeight;
    private double swellPeriod;
    private double waterTemperature;


    @Override
    public String toString() {
        return "WaterCondition{" +
                "swellDirection=" + swellDirection +
                ", swellHeight=" + swellHeight +
                ", swellPeriod=" + swellPeriod +
                ", waterTemperature=" + waterTemperature +
                 + '\'' +
                '}';
    }
}
