/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import id.evos.heroes.entity.Character;
import id.evos.heroes.entity.CharacterCode;
import id.evos.heroes.repository.CharacterRepository;

/**
 * @author Teguh Eka Putra
 * @version $Id: InitDataHeroesApplication.java, v 0.1 2021‐03‐14 22.11 Teguh Eka Putra Exp $$
 */
@Component
public class InitDataHeroesApplication implements CommandLineRunner {
    private static final Logger LOGGER = LogManager.getLogger(InitDataHeroesApplication.class);

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("InitDataHeroesApplication run method Started !!");

        List<Character> characters = new ArrayList<>();

        Character character1 = new Character();
        character1.setName("Gandalf");
        character1.setPower(100L);
        character1.setCharacterCode(new CharacterCode(1L, "WIZARD", "magician"));
        characters.add(character1);

        Character character2 = new Character();
        character2.setName("Legolas");
        character2.setPower(60L);
        character2.setCharacterCode(new CharacterCode(2L, "ELF", "elf"));
        characters.add(character2);

        Character character3 = new Character();
        character3.setName("Frodo");
        character3.setPower(10L);
        character3.setCharacterCode(new CharacterCode(3L, "HOBBIT", "hobbit"));
        characters.add(character3);

        characterRepository.saveAll(characters);
    }
}
