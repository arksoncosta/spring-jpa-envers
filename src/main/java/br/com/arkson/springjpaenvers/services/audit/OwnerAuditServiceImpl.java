package br.com.arkson.springjpaenvers.services.audit;

import br.com.arkson.springjpaenvers.model.Owner;
import lombok.AllArgsConstructor;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author arkson
 * @date 16/11/2020
 */
@Service
@AllArgsConstructor
public class OwnerAuditServiceImpl implements OwnerAuditService {

    private final EntityManager entityManager;

    @Override
    public List<Owner> findRevisions(Long ownerId) {
        AuditReader auditReader = AuditReaderFactory.get(entityManager);
        List<Owner> ownerRevision = auditReader.createQuery()
                .forRevisionsOfEntity(Owner.class, true, true)
                .add(AuditEntity.id().eq(ownerId))
                .addOrder(AuditEntity.property("updatedDate").desc())
                .getResultList();

        return ownerRevision;
    }
}
