package com.jcs.f4c.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WaterCondition {

    private SwellDirection swellDirection;
    private SwellHeight swellHeight;
    private WaterTemp waterTemperature;



}
