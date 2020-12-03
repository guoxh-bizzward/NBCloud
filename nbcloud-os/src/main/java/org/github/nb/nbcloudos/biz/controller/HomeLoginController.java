package org.github.nb.nbcloudos.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeLoginController {
    @Autowired
    @Qualifier("messageSource")
    private MessageSource messageSource;

    @PostMapping("/login")
    public Object login(){
        return "SUCCESS";
    }

}
