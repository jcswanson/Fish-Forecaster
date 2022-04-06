package com.jcs.f4c.service;

import com.jcs.f4c.response.StormGlassResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StormGlassApiService {

    private static final String SG_API_KEY = "dfef7f20-c7ea-11eb-862d-0242ac130002-dfef7fa2-c7ea-11eb-862d-0242ac130002";

    private final RestTemplate restTemplate = new RestTemplate();


    public StormGlassResponse getWaterConditions(Double latitude, Double longitude){

        // I need to use TimeFormatter to get the hour out of 24 that the current time is in
        String baseStormGlassConditionsUrl = "https://api.stormglass.io/v2/weather/point?lat="+latitude+"&lng="+longitude+
                "&params=waterTemperature,swellHeight,swellPeriod,swellDirection&start=2022-02-24 00:30&end=2022-02-24 00:30&source=sg";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "dfef7f20-c7ea-11eb-862d-0242ac130002-dfef7fa2-c7ea-11eb-862d-0242ac130002");
        HttpEntity<String> httpEntity = new HttpEntity<>("some body", headers);
        ResponseEntity<StormGlassResponse> response = restTemplate.exchange(baseStormGlassConditionsUrl, HttpMethod.GET, httpEntity, StormGlassResponse.class);
        System.out.println(response.getBody()+"\n"+response.getHeaders());
        return response.getBody();
    }

    public StormGlassResponse getTide(Double latitude, Double longitude){
        // Make a usable Time format the user can interact with
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        +now.format(DateTimeFormatter.ISO_INSTANT)
        String dateAndTime = "2022-02-24 00:30";
        System.out.println(dateAndTime);
        String baseStormGlassTideUrl = "https://api.stormglass.io/v2/tide/sea-level/point?lat="+
                latitude+"&lng="+longitude+"&start="+dateAndTime+"&end="+dateAndTime;

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "dfef7f20-c7ea-11eb-862d-0242ac130002-dfef7fa2-c7ea-11eb-862d-0242ac130002");
        HttpEntity<String> httpEntity = new HttpEntity<>("some body", headers);
        ResponseEntity<StormGlassResponse> response = restTemplate.exchange(baseStormGlassTideUrl, HttpMethod.GET, httpEntity, StormGlassResponse.class);
        System.out.println(response.getBody()+"\n"+response.getHeaders());
        return response.getBody();
//        ResponseEntity<StormGlassResponse> response = restTemplate.getForEntity(baseStormGlassTideUrl, StormGlassResponse.class);
//        MediaType contentType = response.getHeaders().getContentType();
//        HttpStatus statusCode = response.getStatusCode();
//        return null;
    }


}
