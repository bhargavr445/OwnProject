app.controller('barcodeController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
			
	$scope.contact = {};
	
	$scope.tabs = [
					{ title:"Search", page:"view/payroll/barcodeSearch.html", active: true },
					{ title:"View", page:"view/payroll/view.html" },
					{ title:"Scan", page:"view/payroll/scan.html" },
					{ title:"FMS", page:"view/payroll/barcodeSearch.html" },
					{ title:"SCAN w/o QA", page:"view/payroll/barcodeSearch.html"}
	               
	               ];
	
	if($rootScope.index != undefined && $rootScope.index != null){
		$scope.tabs[$rootScope.index].active = true;
	}
	
	
	BarcodeService.getDepartments(function(data){
		$scope.departmentsList = data;
		
		
	});
	
	$scope.goToScan = function(){
		$location.path('/barcode');
	};
	
//	$scope.getSal = function(student){
//		$scope.student = {};
//		$scope.student.name = student.annualSalary;
//		BarcodeService.getSalInfo($scope.student,function(data){
//			$scope.salDetails = data;
//		});
//	};
	

	
	
	$scope.selectedIndex = function(index){
		$rootScope.index = index;
		
	};
	
	$scope.addNewStudent= function(){
		BarcodeService.addNewStudent($scope.student,function(data){
			$scope.msg = data;
			$location.path('/barcode');
		})
	};
	
	$scope.deleteStudent = function(student){
		BarcodeService.deleteStudent(student, function(result){
			if(result == "1"){
				$log.info("StudentSuccesfully Deleted");
			}
			else{
				$log.info("Operation UnSuccesfull");
			}
		})
	};
	
	$scope.scanSubmit = function(){
		BarcodeService.submitStudent($scope.contact, function(data){
			$scope.studentScanResult = data;
			$scope.studentFmsResult = data;
		})
	};
	BarcodeService.getRegionIdlist(function(data){
		$scope.regionList = data;
		$scope.regionList.splice(0,0,"ALL");
	});
	$scope.getAllData = function(){
		BarcodeService.getAllData(function(data){
			$scope.studentScanResult = data;
		})
	}
	
	$scope.getSelectedData = function(selectedData){
	//	var obj = {};
	//	obj.department = selectedData;
		BarcodeService.getSelectedData($.param({deptName : selectedData}), function(data){
			$scope.studentScanResult = data;
		})
	}
	
	$scope.getSal = function(empName){
		BarcodeService.getSalInfo($.param({name : empName}),function(data){
			$scope.salDetails = data;
		})
	}
//	$scope.getSal = function(student){
//		$scope.barcode = {};
//		$scope.barcode.name = student.name;
//		BarcodeService.getSalInfo(barcode,function(data){
//			$scope.salDetails = data;
//		});
//	};
	$scope.goToview = function(student){
		$scope.tabs[1].active=true;
//		$scope.student = {};
//		$scope.student.jobTitle = student.jobtitle;
		BarcodeService.getListByJobTitle(student,function(data){
			$scope.empListWithJobTitle = data;
		});
		
	};
	
	$scope.editStudent = function(student){
		//	localStorage.setitem("student",JSON.stringify(student));
			$rootScope.student = student;
			$location.path('/editStudent');
		}

});

app.controller('barcodeEditController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
	
	$scope.student = $rootScope.student;
	
	$scope.editStudent = function(student){
		BarcodeService.editStudent(student, function(data){
			$scope.msg = data;
			$location.path('/barcode');
//			if(msg =='1'){
//				$log($scope.msg);
//			}
//			else{
//				$log($scope.msg);
//			}
		});
	};
});

