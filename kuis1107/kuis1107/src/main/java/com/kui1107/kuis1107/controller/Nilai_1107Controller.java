/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.controller;
import com.kui1107.kuis1107.entity.Nilai_1107;
import com.kui1107.kuis1107.repo.Nilai_1107Repo;
import com.kui1107.kuis1107.service.Nilai_1107Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */
@RestController
@RequestMapping("/Nilai_1107")
public class Nilai_1107Controller {
    @Autowired
    private Nilai_1107Service nilai_1107Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public Nilai_1107 insertOrUpdate(@RequestBody Nilai_1107 nilai_1107){
        return nilai_1107Service.insertOrUpdate(nilai_1107);
    }
}
