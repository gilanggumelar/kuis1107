/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kui1107.kuis1107.repo;
import com.kui1107.kuis1107.entity.Nilai_1107;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC35
 */
public interface Nilai_1107Repo extends CrudRepository<Nilai_1107, Long> {
    @Query("select p from Nilai_1107 p")
    public List<Nilai_1107> findAllNilai_1107();
    
    @Query("select p from Nilai_1107 p where p.Nilai_1107.id= :id")
    public List<Nilai_1107> findByCv_1107(@Param("id") Long id);
    
    @Query("select p from Nilai_1107 p where LOWER(p.name) LIKE LOWER(:name)")
    public List<Nilai_1107> findByName(@Param("name") String name);
    
}
