package com.pluralsight.service;

import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import com.pluralsight.model.Speaker;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value= BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args Constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl Repository Constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We're called after the constructors.");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //@Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl Setter");
        this.repository = repository;
    }
}
