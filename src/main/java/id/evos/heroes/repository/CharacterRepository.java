/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import id.evos.heroes.entity.Character;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterRepository.java, v 0.1 2021‐03‐14 20.29 Teguh Eka Putra Exp $$
 */
public interface CharacterRepository extends MongoRepository<Character, String> {
}
