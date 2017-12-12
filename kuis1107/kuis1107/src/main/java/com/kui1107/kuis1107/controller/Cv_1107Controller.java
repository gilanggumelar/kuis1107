/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.controller;
import com.kui1107.kuis1107.entity.Cv_1107;
import com.kui1107.kuis1107.service.Cv_1107Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC35
 */
@RestController
@RequestMapping("/cv_1107")
public class Cv_1107Controller {
     @Autowired
    private Cv_1107Service cv_1107Service;

    @RequestMapping(method = RequestMethod.POST)
    public Cv_1107 insert(@RequestBody Cv_1107 cv_1107) {
        return cv_1107Service.insert(cv_1107);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cv_1107 update(@RequestBody Cv_1107 cv_1107) {
        return cv_1107Service.update(cv_1107);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1107Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cv_1107 getById(@PathVariable("id") Long id){
        return cv_1107Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Cv_1107> getAll(){
        return cv_1107Service.getAll();
    }

}
