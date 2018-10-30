/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentapp.studentApplication.repository;

import com.studentapp.studentApplication.entities.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author ABSSAGR
 */
public interface VisitorRepository extends JpaRepository<Visitor, Long>{
    Visitor findByEmail(String email);
}
