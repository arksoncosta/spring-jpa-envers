package br.com.arkson.springjpaenvers.model;

import lombok.Data;
import lombok.ToString;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author arkson
 * @date 16/11/2020
 */
@ToString(callSuper = true)
@Data
@Entity
@Table(name = "owners")
@Audited
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;

    public static Owner newOwner(String fisrtName, String lastName, String address, String city, String telephone) {
        Owner owner = new Owner();
        owner.setFirstName(fisrtName);
        owner.setLastName(lastName);
        owner.setAddress(address);
        owner.setCity(city);
        owner.setTelephone(telephone);

        return owner;
    }
}
