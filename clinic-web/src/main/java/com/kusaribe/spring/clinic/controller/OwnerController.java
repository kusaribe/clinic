package com.kusaribe.spring.clinic.controller;


import com.kusaribe.spring.clinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class OwnerController {

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    private final OwnerService ownerService;

    @RequestMapping({"/owners"})
    public String ListOwners(Model model){

        model.addAttribute("owners",ownerService.findAll() );
        return "owners/index";
    }
}
