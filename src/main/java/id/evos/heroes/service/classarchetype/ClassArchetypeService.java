/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.classarchetype;

import id.evos.heroes.enums.ClassArchetypeEnum;

/**
 * @author Teguh Eka Putra
 * @version $Id: ClassArchetypeService.java, v 0.1 2021‐03‐14 20.58 Teguh Eka Putra Exp $$
 */
public interface ClassArchetypeService {
    Long doCalculateValue(Long power);
    ClassArchetypeEnum getCharacterCodeStrategy();
}
