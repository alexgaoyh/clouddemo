package com.alexgaoyh;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lenovo on 2017/9/28.
 */
@RestController
public class DiscoveryService {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getServiceMethod")
    @ApiOperation(value="demo-helloworld", notes="motes注解部分")
    public String getServiceMethod(){
        return  this.restTemplate.getForObject("http://APP-SERVICE/helloworld" , String.class);
    }

}
