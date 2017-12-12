/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.service;
import com.kui1107.kuis1107.entity.Cv_1107;
import com.kui1107.kuis1107.repo.Cv_1107Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC35
 */
@Service("cv_1107Service")
@Transactional
public class Cv_1107Service {
    @Autowired
    private Cv_1107Repo repo;

    public Cv_1107 insert(Cv_1107 cv_1107) {
        return repo.save(cv_1107);
    }
    
    public Cv_1107 update(Cv_1107 cv_1107) {
        return repo.save(cv_1107);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Cv_1107 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Cv_1107> getAll(){
        return repo.findAllCv_1107();
    }
}
