package org.example.quarkus_reactive_demo.service;

import io.smallrye.mutiny.Multi;
import org.example.quarkus_reactive_demo.entity.MyEntity;
import org.example.quarkus_reactive_demo.repository.MyRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MyServiceImpl implements MyService {

    @Inject
    MyRepository myRepository;

    @Override
    public Multi<MyEntity> getAll() {
        return myRepository.streamAll();
    }
}
