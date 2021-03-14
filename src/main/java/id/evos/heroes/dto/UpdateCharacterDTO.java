/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.dto;

/**
 * @author Teguh Eka Putra
 * @version $Id: UpdateCharacterDTO.java, v 0.1 2021‐03‐14 22.03 Teguh Eka Putra Exp $$
 */
public class UpdateCharacterDTO {
    private String id;
    private String name;
    private Long   power;

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

    @Override
    public String toString() {
        return "UpdateCharacterDTO{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", power="
               + power + '}';
    }
}
