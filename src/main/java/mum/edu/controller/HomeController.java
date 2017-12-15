package mum.edu.controller;
/*
 * Created on Nov 15, 2017
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.service.TMReportService;


@Controller
public class HomeController {

    @Autowired
    TMReportService service;

    @RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
    public String index(Model model) {       
        return "home";
    }
 
}
