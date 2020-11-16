package br.com.arkson.springjpaenvers.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author arkson
 * @date 16/11/2020
 */
public interface BaseEntity {

    Long getId();

    @JsonIgnore
    default boolean isNew() {
        return getId() == null;
    }

}
