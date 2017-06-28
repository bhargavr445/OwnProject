app.controller('barcodeController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
			
	$scope.contact = {};
	$scope.department = {};
	
	$scope.tabs = [
					{ title:"Search", page:"view/payroll/barcodeSearch.html", active: true },
					{ title:"View", page:"view/payroll/view.html" },
					{ title:"Scan", page:"view/payroll/scan.html" },
					{ title:"FMS", page:"view/payroll/barcodeSearch.html" },
					{ title:"SCAN w/o QA", page:"view/payroll/barcodeSearch.html"}
	               
	               ];
	
	if($rootScope.index != undefined && $rootScope.index != null){
		$scope.tabs[$rootScope.index].active = true;
		if($rootScope.index == 2){
			
			$scope.selectedDept = $rootScope.deptName;
			//$scope.getSelectedData($scope.selectedDept);
			BarcodeService.getSelectedData($.param({deptName : $scope.selectedDept}), function(data){
				$scope.studentScanResult = data;
			})
		}
	}
	
	
	BarcodeService.getDepartments(function(data){
		$scope.departmentsList = data;
	});
	
	$scope.goToScan = function(){
		$location.path('/barcode');
	};
		
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
		$rootScope.deptName = selectedData;
		BarcodeService.getSelectedData($.param({deptName : selectedData}), function(data){
			$scope.studentScanResult = data;
		})
	}
	
	$scope.getSal = function(empName){
		BarcodeService.getSalInfo($.param({name : empName}),function(data){
			$scope.salDetails = data;
		})
	}

	$scope.goToview = function(student){
		$scope.tabs[1].active=true;
		$
		BarcodeService.getListByJobTitle(student,function(data){
			$scope.empListWithJobTitle = data;
		});
		
	};
	
	$scope.editStudent = function(student){
			$rootScope.student = student;
			$location.path('/editStudent');
		}

});

app.controller('barcodeEditController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
	
	$scope.student = $rootScope.student;
	
	$scope.originalStudent = angular.copy($scope.student);
	
	$scope.reset = function(){
		$scope.student = angular.copy($scope.originalStudent);
	};
	
	
	
	$scope.editStudent = function(student){
		BarcodeService.editStudent(student, function(data){
			$scope.msg = data;
			$location.path('/barcode');
		});
	};
	
	$scope.goToScan = function(){
		$location.path('/barcode');
	};
});

