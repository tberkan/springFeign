package com.endava.springHomeworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping(value = "/phones")
    public List<Phone> findAll() {
        return phoneService.findAll();
    }
}
