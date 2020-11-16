package br.com.arkson.springjpaenvers.services.audit;

import br.com.arkson.springjpaenvers.model.Owner;

import java.util.List;

/**
 * @author arkson
 * @date 16/11/2020
 */
public interface OwnerAuditService {

    List<Owner> findRevisions(Long ownerId);

}
