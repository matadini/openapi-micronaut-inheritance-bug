package com.example;

import com.example.client.api.MyApiApi;
import com.example.client.api.MyCustomApi;
import com.example.client.model.Animal;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class AnimalApiControllerTest {

    @Inject
    MyCustomApi client;

    @Test
    void animals() {
        List<Animal> houses = client.houses();
        Assertions.assertEquals(2, houses.size());
    }
}