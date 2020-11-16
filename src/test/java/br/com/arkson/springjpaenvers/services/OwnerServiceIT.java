package br.com.arkson.springjpaenvers.services;

import br.com.arkson.springjpaenvers.model.Owner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class OwnerServiceIT {

    @Autowired
    OwnerService ownerService;

    @Test
    void testSaveOwner() {
        Owner owner = Owner.newOwner("Chuck", "Norris", "Address", "City", "+554558555256");
        Owner savedOwner = ownerService.save(owner);

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void testFindAll() {
        List<Owner> owners = ownerService.findAll();
        assertNotNull(owners);
        assertFalse(owners.isEmpty());
    }
}