package io.quarkus.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetResource {

    @GetMapping("/pets/{petId}")
    public Object findPet(@PathVariable("petId") int petId) {
        return Integer.valueOf(petId);
    }

    @GetMapping("/owners/pets/{petId}")
    public Object findOwnersPet(@PathVariable("petId") int petId) {
        return Integer.valueOf(petId);
    }

}