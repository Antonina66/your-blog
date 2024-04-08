package com.example.YourBlog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticlesController {
    @GetMapping("/")

    public String articles(){
    return "articles";
    }
}