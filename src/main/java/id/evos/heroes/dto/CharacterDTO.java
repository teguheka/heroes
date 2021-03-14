/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.dto;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterDTO.java, v 0.1 2021‐03‐14 20.36 Teguh Eka Putra Exp $$
 */
public class CharacterDTO {
    private String id;
    private String name;
    private Long   characterCode;
    private Long   power;
    private Long   value;

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
    public Long getCharacterCode() {
        return characterCode;
    }

    /**
     * Setter method for property characterCode.
     *
     * @param characterCode value to be assigned to property characterCode
     */
    public void setCharacterCode(Long characterCode) {
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

    /**
     * Getter method for property value.
     *
     * @return property value of value
     */
    public Long getValue() {
        return value;
    }

    /**
     * Setter method for property value.
     *
     * @param value value to be assigned to property value
     */
    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CharacterDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", characterCode=" + characterCode +
                ", power=" + power +
                ", value=" + value +
                '}';
    }
}
