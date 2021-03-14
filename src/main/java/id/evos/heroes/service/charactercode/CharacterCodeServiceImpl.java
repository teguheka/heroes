/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.charactercode;

import org.springframework.beans.factory.annotation.Autowired;

import id.evos.heroes.dto.CharacterCodeDTO;
import id.evos.heroes.entity.CharacterCode;
import id.evos.heroes.repository.CharacterCodeRepository;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterCodeImpl.java, v 0.1 2021‐03‐14 21.39 Teguh Eka Putra Exp $$
 */
public class CharacterCodeServiceImpl implements CharacterCodeService {

    @Autowired
    private CharacterCodeRepository characterCodeRepository;

    @Override
    public CharacterCodeDTO findOne(String id) {
        CharacterCodeDTO dto = new CharacterCodeDTO();

        CharacterCode characterCode = characterCodeRepository.findById(id).orElse(null);
        if (characterCode != null) {
            dto.setId(characterCode.getId());
            dto.setCode(characterCode.getCode());
            dto.setName(characterCode.getName());
            dto.setDescription(characterCode.getDescription());
        }

        return dto;
    }
}
