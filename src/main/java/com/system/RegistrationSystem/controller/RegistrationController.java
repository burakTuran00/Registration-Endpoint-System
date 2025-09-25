package com.system.RegistrationSystem.controller;

import com.system.RegistrationSystem.dto.RegistrationRequest;
import com.system.RegistrationSystem.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PutMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
