package com.project.util;

import java.util.List;
import org.springframework.stereotype.Service;
import com.project.model.Student;

@Service
public class SampleUtilClass {
	
	public List<Student> modifyData(List<Student> stuList){
		
		System.out.println(stuList);
		for (Student student : stuList) {
			if(student.getStuId() == 5){
				student.setStuName("ABC");
			}else{
				student.setStuName("DEF");
			}
		}	
		return stuList;
	}
}
