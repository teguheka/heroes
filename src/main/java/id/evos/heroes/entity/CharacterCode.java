/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterCode.java, v 0.1 2021‐03‐14 20.10 Teguh Eka Putra Exp $$
 */
@Document(collection = "character_code")
public class CharacterCode implements Serializable {
    private static final long serialVersionUID = 3067661101579943339L;

    @Id
    private String            id;
    private Long              code;
    private String            name;
    private String            description;

    public CharacterCode() {
    }

    public CharacterCode(Long code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    /**
     * Getter method for property id.
     *
     * @return property value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter method for property code.
     *
     * @return property value of code
     */
    public Long getCode() {
        return code;
    }

    /**
     * Setter method for property code.
     *
     * @param code value to be assigned to property code
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * Getter method for property name.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property description.
     *
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
