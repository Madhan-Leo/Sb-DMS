package com.dms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dms.bean.Doctor;


	@Repository
	public class DoctorDAO {
		 static List<Doctor> list;
		
		public static boolean insert(Doctor bean)
		{
			list=new ArrayList<Doctor>();
			
			return list.add(bean);
			
		}
		
		public static  boolean view()
		{
			return true;
		}

}
