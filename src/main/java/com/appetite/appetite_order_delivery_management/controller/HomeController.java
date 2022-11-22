package com.appetite.appetite_order_delivery_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.appetite.appetite_order_delivery_management.dao.iClientRepository;
//import com.appetite.appetite_order_delivery_management.dao.iFoodRepository;
import com.appetite.appetite_order_delivery_management.entity.Client;



@Controller
public class HomeController {
    

    @Autowired
    iClientRepository clientRepository;

    // @Autowired
    // iFoodRepository foodRepository;


    @GetMapping("/")
    public String displayHome(Model model) { 
        List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "home/index";
    }


}
