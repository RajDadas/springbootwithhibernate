package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class ApplicationController {

    @GetMapping ("/savedata")
    public String saveData(){

        return " Data Saved Sucessfully";
    }
    @GetMapping("/getdata")
   public String getData(){
        return " Getting Data";
    }

    @GetMapping("/setdata")
    public String setData(){

        return "  Data";
    }



}
