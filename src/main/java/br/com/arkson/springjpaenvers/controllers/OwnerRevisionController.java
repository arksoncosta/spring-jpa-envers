package br.com.arkson.springjpaenvers.controllers;

import br.com.arkson.springjpaenvers.model.Owner;
import br.com.arkson.springjpaenvers.services.audit.OwnerAuditService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author arkson
 * @date 16/11/2020
 */
@RestController
@RequestMapping("owners/revisions")
@AllArgsConstructor
public class OwnerRevisionController {

    private final OwnerAuditService ownerAuditService;

    @GetMapping("{ownerId}")
    public ResponseEntity<List<Owner>> findRevisions(@PathVariable Long ownerId) {
        return ResponseEntity.ok(ownerAuditService.findRevisions(ownerId));
    }

}
