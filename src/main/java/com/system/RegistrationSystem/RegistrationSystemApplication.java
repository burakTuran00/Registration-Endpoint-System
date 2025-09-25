package com.system.RegistrationSystem;

import com.system.RegistrationSystem.config.WebSecurityConfig;
import com.system.RegistrationSystem.repository.AppUserRepository;
import com.system.RegistrationSystem.service.AppUserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RegistrationSystemApplication {
	private final AppUserService appUserService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public RegistrationSystemApplication(AppUserService appUserService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.appUserService = appUserService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public static void main(String[] args) {
		SpringApplication.run(RegistrationSystemApplication.class, args);
	}

	@Bean
	public WebSecurityConfig webSecurityConfigurerAdapter(){
		return new WebSecurityConfig(appUserService,bCryptPasswordEncoder);
	}
}
