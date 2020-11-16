package br.com.arkson.springjpaenvers.controllers;

import br.com.arkson.springjpaenvers.model.Owner;
import br.com.arkson.springjpaenvers.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author arkson
 * @date 16/11/2020
 */
@RestController
@RequestMapping("owners")
@AllArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @PostMapping
    public ResponseEntity<Owner> save(@RequestBody Owner owner) {
        return ResponseEntity.ok(ownerService.save(owner));
    }

    @GetMapping("{ownerId}")
    public ResponseEntity<Owner> findById(@PathVariable Long ownerId) {
        Optional<Owner> owner = ownerService.findById(ownerId);

        if (owner.isPresent()) {
            return ResponseEntity.ok(ownerService.findById(ownerId).get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Owner>> findAll() {
        return ResponseEntity.ok(ownerService.findAll());
    }

    @DeleteMapping("{ownerId}")
    public ResponseEntity delete(@PathVariable Long ownweId) {
        ownerService.deleteById(ownweId);
        return ResponseEntity.ok().build();
    }
}
