package br.com.solutionsprint.solution.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("login-teste")
    public String teste() {
        return "Login OK!";
    }
}
