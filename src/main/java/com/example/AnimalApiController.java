package com.example;

import com.example.api.MyCustomApi;
import com.example.model.AnimalRequest;
import com.example.model.AnimalResponse;
import com.example.model.CatResponse;
import com.example.model.DogResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller
public class AnimalApiController implements MyCustomApi {

    private static final Logger log = LoggerFactory.getLogger(AnimalApiController.class);

    @Override
    public List<@Valid AnimalResponse> findAnimals() {
        return List.of(
                new CatResponse().name("Kitty").catProperty("cat-property-0"),
                new DogResponse().name("Dog").dogProperty("dog-property-0"));
    }

    @Override
    public void saveAnimal(AnimalRequest animalRequest) {
        log.info("Saving animal {}", animalRequest);
    }
}
