package org.example.quarkus_reactive_demo.service;

import io.smallrye.mutiny.Multi;
import org.example.quarkus_reactive_demo.entity.MyEntity;

public interface MyService {
    Multi<MyEntity> getAll();
}
