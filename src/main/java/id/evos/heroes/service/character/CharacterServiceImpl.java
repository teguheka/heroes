/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.character;

import java.util.ArrayList;
import java.util.List;

import id.evos.heroes.dto.ListCharacterDTO;
import id.evos.heroes.dto.UpdateCharacterDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.evos.heroes.entity.Character;
import id.evos.heroes.enums.ClassArchetypeEnum;
import id.evos.heroes.factory.ClassArchetypeFactory;
import id.evos.heroes.repository.CharacterRepository;
import id.evos.heroes.service.classarchetype.ClassArchetypeService;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterServiceImpl.java, v 0.1 2021‐03‐14 21.09 Teguh Eka Putra Exp $$
 */
@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository   characterRepository;

    @Autowired
    private ClassArchetypeFactory classArchetypeFactory;

    public List<ListCharacterDTO> findAll() {
        List<ListCharacterDTO> characterDTOList = new ArrayList<>();

        List<Character> characters = characterRepository.findAll();

        if (!characters.isEmpty()) {
            characters.forEach(character -> {
                ListCharacterDTO dto = new ListCharacterDTO();
                dto.setId(character.getId());
                dto.setCharacterCode(character.getCharacterCode().getCode());
                dto.setName(character.getName());
                dto.setPower(character.getPower());
                dto.setValue(
                    getCharacterValue(character.getCharacterCode().getName(), dto.getPower()));
                characterDTOList.add(dto);
            });
        }

        return characterDTOList;
    }

    @Override
    public void updateCharacter(UpdateCharacterDTO dto) {
        Character character = characterRepository.findById(dto.getId()).orElse(null);
        if (character != null) {
            character.setName(StringUtils.defaultIfBlank(dto.getName(), character.getName()));
            character.setPower(dto.getPower() != null ? dto.getPower() : character.getPower());
            characterRepository.save(character);
        }
    }

    private Long getCharacterValue(String characterCodeName, Long power) {
        ClassArchetypeEnum classArchetypeEnum = ClassArchetypeEnum.getEnumByName(characterCodeName);
        ClassArchetypeService characterCodeService = classArchetypeFactory
            .classifyClassArchetype(classArchetypeEnum);
        return characterCodeService.doCalculateValue(power);
    }
}
