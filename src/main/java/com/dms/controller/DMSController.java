package com.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;
@RestController
public class DMSController {


	@Autowired
	DoctorDAO dao;
	
	public void performInsert(Doctor bean)
	{
		dao.insert(bean);
		System.out.println("Inserted");
		boolean list=dao.view();
		System.out.println(list);
	}

}
