package com.dao;

import org.apache.ibatis.annotations.Param;

import com.po.Student;

public interface StudentDao {
      public Student findStudentById(@Param("idCard")int idCard);
} 
