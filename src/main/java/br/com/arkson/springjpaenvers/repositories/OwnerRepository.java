package br.com.arkson.springjpaenvers.repositories;

import br.com.arkson.springjpaenvers.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author arkson
 * @date 16/11/2020
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
