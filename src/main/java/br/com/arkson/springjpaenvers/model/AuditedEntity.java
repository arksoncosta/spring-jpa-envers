package br.com.arkson.springjpaenvers.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author arkson
 * @date 16/11/2020
 */
@ToString
@Setter
@Getter
@MappedSuperclass
@Audited
@EntityListeners(AuditingEntityListener.class)
public class AuditedEntity implements Serializable {

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @LastModifiedBy
    private String modifiedBy;
}
