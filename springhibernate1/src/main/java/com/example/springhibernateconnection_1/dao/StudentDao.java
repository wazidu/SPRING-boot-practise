package com.example.springhibernateconnection_1.dao;

//import javax.persistence.Entity;

import com.example.springhibernateconnection_1.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Wazid Ullah Murad on 11/2/2019.
 */
@Transactional
public interface StudentDao extends CrudRepository<Student, Integer> {


//    @Modifying
//    @Query(value = "delete from student where id=?1",nativeQuery = true)
//    public void deleteStu(Integer id);
}
