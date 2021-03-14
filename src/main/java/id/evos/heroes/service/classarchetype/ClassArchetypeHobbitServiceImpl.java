/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.classarchetype;

import org.springframework.stereotype.Component;

import id.evos.heroes.enums.ClassArchetypeEnum;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterCodeWizardService.java, v 0.1 2021‐03‐14 21.06 Teguh Eka Putra Exp $$
 */
@Component
public class ClassArchetypeHobbitServiceImpl implements ClassArchetypeService {

    @Override
    public Long doCalculateValue(Long power) {
        Long value;

        if (power < 20) {
            value = (power * 200) / 100;
        } else {
            value = (power * 300) / 100;
        }

        return value;
    }

    @Override
    public ClassArchetypeEnum getCharacterCodeStrategy() {
        return ClassArchetypeEnum.HOBBIT;
    }
}
