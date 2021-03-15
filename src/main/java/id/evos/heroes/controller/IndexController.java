/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Teguh Eka Putra
 * @version $Id: IndexController.java, v 0.1 2021‐03‐15 00.46 Teguh Eka Putra Exp $$
 */
@RestController
public class IndexController {

    @GetMapping("")
    public Map home(HttpServletRequest request) {
        String baseUrl = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();

        Map<String, String> map = new HashMap<>();
        map.put("documentation", baseUrl + "/swagger-ui.html");
        return map;
    }
}
