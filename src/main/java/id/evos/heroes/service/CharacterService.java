/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.evos.heroes.dto.CharacterDTO;
import id.evos.heroes.entity.Character;
import id.evos.heroes.repository.CharacterRepository;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterService.java, v 0.1 2021‐03‐14 20.33 Teguh Eka Putra Exp $$
 */
@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<CharacterDTO> findAll() {
        List<CharacterDTO> characterDTOList = new ArrayList<>();

        List<Character> characters = characterRepository.findAll();

        if (!characters.isEmpty()) {
            characters.forEach(character -> {
                CharacterDTO dto = new CharacterDTO();
                dto.setId(character.getId());
                dto.setCharacterCode(character.getCharacterCode().getCode());
                dto.setName(character.getName());
                dto.setPower(character.getPower());

                //TODO set service to calculate
                dto.setValue(1L);
                characterDTOList.add(dto);
            });
        }

        return characterDTOList;
    }
}
