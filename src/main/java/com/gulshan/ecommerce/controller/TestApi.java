package com.gulshan.ecommerce.controller;

import com.gulshan.ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/")
    public ApiResponse testApiHandler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Hello");
        return apiResponse;
    }
}