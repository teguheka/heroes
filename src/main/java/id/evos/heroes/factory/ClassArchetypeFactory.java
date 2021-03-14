/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import id.evos.heroes.enums.ClassArchetypeEnum;
import id.evos.heroes.service.classarchetype.ClassArchetypeService;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterCodeFactory.java, v 0.1 2021‐03‐14 21.13 Teguh Eka Putra Exp $$
 */
@Component
public class ClassArchetypeFactory {

    private Map<ClassArchetypeEnum, ClassArchetypeService> strategies;

    @Autowired
    public ClassArchetypeFactory(Set<ClassArchetypeService> classArchetypeServiceSet) {
        createStrategy(classArchetypeServiceSet);
    }

    public ClassArchetypeService classifyClassArchetype(ClassArchetypeEnum classArchetypeEnum) {
        return strategies.get(classArchetypeEnum);
    }

    private void createStrategy(Set<ClassArchetypeService> classArchetypeServiceSet) {
        strategies = new HashMap<>();
        classArchetypeServiceSet
            .forEach(strategy -> strategies.put(strategy.getCharacterCodeStrategy(), strategy));
    }
}
