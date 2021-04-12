package org.example.quarkus_reactive_demo.api;

import org.example.quarkus_reactive_demo.entity.MyEntity;

public class MyMapper {

    private MyMapper() {}

    public static MyDTO toDTO(MyEntity entity) {
        return new MyDTO(entity.getId(), entity.getName(), entity.getDescription());
    }

}
