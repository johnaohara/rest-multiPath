package io.quarkus.test;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class PetResourceTest extends AbstractResourceTest {

    @Test
    public void testOwnersResourceEndpoint() {
        validateEndpoint("/owners/1", 200, "1");
    }

    @Test
    public void testPetResourceEndpoint() {
        validateEndpoint("/pets/1", 200, "1");
    }

    @Test
    public void testPetOwnersResourceEndpoint() {
        validateEndpoint("/owners/pets/1", 200, "1");
    }


}