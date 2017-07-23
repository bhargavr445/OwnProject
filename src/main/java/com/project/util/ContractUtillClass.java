package com.project.util;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Contract;

@Service
public class ContractUtillClass {

	public List<Contract> taxCalc(List<Contract> empList) {
		for (Contract contract : empList) {
			float tax = 0;
			String val = contract.getAnnualSalary().substring(1, contract.getAnnualSalary().length()).trim();
			float sal = Float.parseFloat(val);
			if( sal <= 250000.00){
				tax = ((sal*10)/100);
				contract.setTax(tax);
				
			}else if(sal <= 500000.00){
				tax = ((sal*20)/100);
				contract.setTax(tax);
			}else {
				tax =  ((sal*30)/100);
				contract.setTax(tax);
			}
		}
		return empList;
	}
	

}
