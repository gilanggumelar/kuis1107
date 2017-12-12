/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.service;
import com.kui1107.kuis1107.entity.Nilai_1107;
import com.kui1107.kuis1107.repo.Nilai_1107Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC35
 */
public class Nilai_1107Service {
    
    @Autowired
    private Nilai_1107Repo repo;

    public Nilai_1107 insertOrUpdate(Nilai_1107 nilai_1107) {
        return repo.save(nilai_1107);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Nilai_1107> findAll() {
        return repo.findAllNilai_1107();
    }

    public List<Nilai_1107> findByCv_1107(Long cv_1107Id) {
        return repo.findByCv_1107(cv_1107Id);
    }

    public List<Nilai_1107> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
