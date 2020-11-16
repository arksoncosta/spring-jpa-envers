package br.com.arkson.springjpaenvers.services;

import br.com.arkson.springjpaenvers.model.Owner;

import java.util.List;
import java.util.Optional;

/**
 * @author Tribus
 * @author arkson
 * @date 16/11/2020
 */
public interface OwnerService {

    Owner save(Owner owner);
    List<Owner> findAll();
    Optional<Owner> findById(Long id);
    void delete(Owner owner);
    void deleteById(Long id);

}
