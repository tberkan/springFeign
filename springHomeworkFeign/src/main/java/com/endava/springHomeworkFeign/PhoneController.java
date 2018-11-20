package com.endava.springHomeworkFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "/data")
    public List<Phone> PhoneData() {
        return phoneService.phoneData();
    }

}
