/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.controller;

import java.util.List;

import id.evos.heroes.dto.ListCharacterDTO;
import id.evos.heroes.dto.UpdateCharacterDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import id.evos.heroes.service.character.CharacterService;

/**
 * @author Teguh Eka Putra
 * @version $Id: CharacterController.java, v 0.1 2021‐03‐14 20.50 Teguh Eka Putra Exp $$
 */
@Api(value = "Characters")
@RestController
@RequestMapping("/v1/characters")
public class CharacterController {

    private static final Logger LOGGER = LogManager.getLogger(CharacterController.class);

    @Autowired
    private CharacterService    characterService;

    @ApiOperation(value = "Get all characters")
    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public List<ListCharacterDTO> getAllCharacters() {
        LOGGER.info("Enter to get all characters");
        return characterService.findAll();
    }

    @ApiOperation(value = "Update an existing character")
    @PatchMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCharater(@PathVariable String id, @RequestBody UpdateCharacterDTO updateCharacterDTO) {
        LOGGER.info("Enter to update character");
        updateCharacterDTO.setId(id);
        characterService.updateCharacter(updateCharacterDTO);
    }
}
