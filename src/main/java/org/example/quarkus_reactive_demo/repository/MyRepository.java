package org.example.quarkus_reactive_demo.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import org.example.quarkus_reactive_demo.entity.MyEntity;

public interface MyRepository extends PanacheRepository<MyEntity> {}
