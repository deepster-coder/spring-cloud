package com.deepster.springcloud.controller;

import com.deepster.springcloud.config.model.AppProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private final AppProperties.DisplayConfig displayConfig;

    public DemoRestController(AppProperties appProperties) {
        this.displayConfig = appProperties.getDisplayConfig();
    }

    @GetMapping("/demo")
    public ResponseEntity<String> helloWorld(@RequestParam(value="name", defaultValue = "World") String name) {
        return ResponseEntity.ok(String.format(displayConfig.getWelcomeMessage(),name));
    }
}
