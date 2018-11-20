package com.endava.springHomeworkFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "phoneClient", url = "http://localhost:8081/phones")
public interface PhoneService {

    @GetMapping
    List<Phone> phoneData();
}
