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
 * @version $Id: Character.java, v 0.1 2021‐03‐14 20.04 Teguh Eka Putra Exp $$
 */
@Document(collection = "character")
public class Character implements Serializable {
    private static final long serialVersionUID = -4444515447316111302L;

    @Id
    private String            id;
    private String            name;
    private CharacterCode     characterCode;
    private Long              power;

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
     * Getter method for property characterCode.
     *
     * @return property value of characterCode
     */
    public CharacterCode getCharacterCode() {
        return characterCode;
    }

    /**
     * Setter method for property characterCode.
     *
     * @param characterCode value to be assigned to property characterCode
     */
    public void setCharacterCode(CharacterCode characterCode) {
        this.characterCode = characterCode;
    }

    /**
     * Getter method for property power.
     *
     * @return property value of power
     */
    public Long getPower() {
        return power;
    }

    /**
     * Setter method for property power.
     *
     * @param power value to be assigned to property power
     */
    public void setPower(Long power) {
        this.power = power;
    }
}
