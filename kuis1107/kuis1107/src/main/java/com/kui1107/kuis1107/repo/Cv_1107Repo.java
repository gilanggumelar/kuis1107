/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.repo;
import com.kui1107.kuis1107.entity.Cv_1107;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC35
 */
public interface Cv_1107Repo extends CrudRepository<Cv_1107, Long> {

        @Query("select c from Cv_1107 c")
    public List<Cv_1107> findAllCv_1107();
}
