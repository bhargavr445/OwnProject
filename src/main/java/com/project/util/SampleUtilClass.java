package com.project.util;

import java.util.List;
import org.springframework.stereotype.Service;
import com.project.model.Student;

@Service
public class SampleUtilClass {
	
	public List<Student> modifyData(List<Student> stuList){
		
		System.out.println(stuList);
		int i=0;
		for (Student student : stuList) {
			i++;
			if(student.getStuName() == "Bhargav"){
				stuList.remove(i);
				student.setStuName("");
			}else{
				student.setStuName("");
			}
		}	
		return stuList;
	}
}
