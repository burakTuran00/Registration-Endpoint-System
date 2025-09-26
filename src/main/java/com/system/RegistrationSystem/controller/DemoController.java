package com.system.RegistrationSystem.controller;

import com.system.RegistrationSystem.entity.AppUser;
import com.system.RegistrationSystem.repository.AppUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class DemoController {
    private AppUserRepository appUserRepository;

    @GetMapping("/")
    public List<AppUser> getUsers(){
        return appUserRepository.findAll();
    }
}
