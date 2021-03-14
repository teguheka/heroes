/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.service.charactercode;

import id.evos.heroes.dto.CharacterCodeDTO;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterCode.java, v 0.1 2021‐03‐14 21.36 Teguh Eka Putra Exp $$
 */
public interface CharacterCodeService {
    CharacterCodeDTO findOne(String id);
}
