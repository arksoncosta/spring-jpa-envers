package br.com.arkson.springjpaenvers.model;

import lombok.Data;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author arkson
 * @date 16/11/2020
 */
@ToString(callSuper = true)
@Data
@MappedSuperclass
@Audited
public class Person extends AuditedEntity implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
}
