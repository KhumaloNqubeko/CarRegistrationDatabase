/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentapp.studentApplication.controllers;

import com.studentapp.studentApplication.repository.VisitorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentapp.studentApplication.entities.Visitor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ABSSAGR
 */
@RestController
@RequestMapping(value = "/visitor")
public class VisitorController {
    
    @Autowired
    private VisitorRepository visitorRepository;
    
    @RequestMapping(value = "/get-all-visitors")
    public List<Visitor> getAllVisitors(){
        return visitorRepository.findAll();
    }
    
    @RequestMapping(value = "/add-visitor", method = RequestMethod.POST)
    public Visitor addVisitor(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }
    
    @RequestMapping(value = "/delete-visitor", method = RequestMethod.DELETE)
    public void deleteVisitor(@RequestBody Visitor visitor) {
        visitorRepository.delete(visitor);
    }
}
