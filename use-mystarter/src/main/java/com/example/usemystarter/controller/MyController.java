package com.example.usemystarter.controller;

import com.example.MystartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkpk1234 on 2017/6/12.
 */
@RestController
public class MyController {

    private final MystartService mystartService;

    @Autowired
    public MyController(MystartService mystartService) {
        this.mystartService = mystartService;
    }

    @GetMapping("/mystarter")
    public ResponseEntity<String> mystarter() {
        String str = mystartService.sayHello();
        return ResponseEntity.ok(str);
    }
}
