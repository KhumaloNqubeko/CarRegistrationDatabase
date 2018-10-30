/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentapp.studentApplication.controllers;

import com.studentapp.studentApplication.entities.Visitor;
import com.studentapp.studentApplication.repository.VisitorRepository;
import com.studentapp.studentApplication.utility.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author ABSSAGR
 */
@RestController
@RequestMapping(value = "/visitor")
public class Visitor_Login_Controller {
    
    @Autowired
    private VisitorRepository visitorRepository;
    
    @RequestMapping(value = "/visitor-login", method = RequestMethod.POST)
    public Visitor visitorLogin(@RequestBody Login login){
        Visitor visitor = null;
        
        for(Visitor v : visitorRepository.findAll()){
            if(login.getEmail().equals(v.getEmail()) &&
                    login.getPassword().equals(v.getPassword())){
                visitor = v;
            }
        }
        return visitor;
    }
}
