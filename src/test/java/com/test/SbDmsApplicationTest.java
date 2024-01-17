package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;


@SpringBootTest
public class SbDmsApplicationTest {

	   @Autowired
	    static DoctorDAO dao;
	    Doctor bean = new Doctor(101,"Madhan","Cardiologists","heart",10);

//	    @Test
//	    void contextLoads() {
//	        
//	    }
	    
	    @Test
	    public void testperformInsert() {
	        dao = new DoctorDAO();
	        boolean value = dao.insert(bean);
	        assertEquals(value,true);
	    }

}
