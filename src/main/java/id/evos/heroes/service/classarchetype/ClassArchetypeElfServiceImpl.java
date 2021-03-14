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
public class ClassArchetypeElfServiceImpl implements ClassArchetypeService {

    @Override
    public Long doCalculateValue(Long power) {
        return 2 + (power * 110) / 100;
    }

    @Override
    public ClassArchetypeEnum getCharacterCodeStrategy() {
        return ClassArchetypeEnum.ELF;
    }
}
