package com.jcs.f4c.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class StormGlassResponse {

    @JsonProperty("hours")
    private List<WaterCondition> waterConditionHours;
    @JsonProperty("data")
    private List<Tide> tideData = new ArrayList<>();
//    private String source = "sg";


    @Override
    public String toString() {
        return "StormGlassResponse{" +
                "waterConditionHours=" + waterConditionHours +
                ", tideData=" + tideData +
                '}';
    }
}
