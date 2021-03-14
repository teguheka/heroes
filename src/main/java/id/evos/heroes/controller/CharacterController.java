/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import id.evos.heroes.dto.CharacterDTO;
import id.evos.heroes.service.CharacterService;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterController.java, v 0.1 2021‐03‐14 20.50 Teguh Eka Putra Exp $$
 */
@RestController
@RequestMapping("/v1/characters")
public class CharacterController {

    private static final Logger LOGGER = LogManager.getLogger(CharacterController.class);

    @Autowired
    private CharacterService characterService;

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<CharacterDTO> getAllCharacters() {
        LOGGER.info("Enter to get all characters");
        return characterService.findAll();
    }
}
