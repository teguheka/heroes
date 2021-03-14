/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.enums;

/**
 * @author Teguh Eka Putra
 * @version $Id: ClassArchetypeEnum.java, v 0.1 2021‐03‐14 21.02 Teguh Eka Putra Exp $$
 */
public enum ClassArchetypeEnum {
                                WIZARD, ELF, HOBBIT;

    public static ClassArchetypeEnum getEnumByName(final String name) {

        for (ClassArchetypeEnum classArchetypeEnum : ClassArchetypeEnum.values()) {
            if (name.equals(classArchetypeEnum.toString())) {
                return classArchetypeEnum;
            }
        }
        return null;
    }
}