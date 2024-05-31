package com.pluralsight.service;

import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import com.pluralsight.model.Speaker;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
