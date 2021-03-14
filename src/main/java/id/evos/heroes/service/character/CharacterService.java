/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.character;

import java.util.List;

import id.evos.heroes.dto.CharacterDTO;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterService.java, v 0.1 2021‐03‐14 20.33 Teguh Eka Putra Exp $$
 */
public interface CharacterService {
    List<CharacterDTO> findAll();
}
