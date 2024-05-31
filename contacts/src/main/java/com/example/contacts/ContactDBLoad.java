package com.example.contacts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactDBLoad {

    @Bean
    CommandLineRunner initDatabase(ContactRepository repository) {
        return args -> {
            System.out.println("Preloading " + repository.save(new Contact("John Smith", "111-111-1111")));
            System.out.println("Preloading " + repository.save(new Contact("Davis Jan", "222-222-2222")));
        };
    }

}
