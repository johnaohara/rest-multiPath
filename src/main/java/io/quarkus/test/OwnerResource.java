package io.quarkus.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/owners")
public class OwnerResource {

    @GetMapping(value = "/{ownerId}")
    public Integer findOwner(@PathVariable("ownerId") int ownerId) {
        return ownerId;
    }


}