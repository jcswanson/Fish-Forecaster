package com.jcs.f4c.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tide {

    private String time;

    @JsonProperty("sg")
    private String tideHeightInFt;

    @Override
    public String toString() {
        return "Tide{" +
                "time='" + time + '\'' +
                ", tideHeightInFt='" + tideHeightInFt + '\'' +
                '}';
    }
}
