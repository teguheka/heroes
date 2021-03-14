/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Teguh Eka Putra
 * @version $Id: IndexController.java, v 0.1 2021‐03‐15 00.46 Teguh Eka Putra Exp $$
 */
@RestController
public class IndexController {

    @GetMapping("")
    public Map home() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        return map;
    }
}
