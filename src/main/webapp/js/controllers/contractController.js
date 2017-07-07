app.controller('contractController', function($scope,$rootScope,$http,$log,$location,contractService) {

	$scope.contract = {};	
	
	$scope.tabs = [
						{ title:"Contract", page:"view/contract/contractClass.html", active: true },
						{ title:"Contract Class", page:"view/contract/contract.html" },
						{ title:"Image", page:"view/contract/image.html" }
	              ];
	
	
	
	if($rootScope.index!=undefined && $rootScope.index!=null){
		$scope.tabs[$rootScope.index].active = true;
		if($rootScope.index == 0){
			$scope.contract = $rootScope.contract;
			contractService.getStudent($scope.contract,function(data){
			$scope.contractList = data;
				
		});
			
	}else if($rootScope.index == 1){
		contractService.searchByJobTitle($rootScope.searchData,function(data){
			$scope.empList = data; 
		});
	}
		
	}else{
		$rootScope.index = 0;
	}
	contractService.getStudentInImage(function(data){
		$scope.empListInImageTab = data;
	});
	$scope.searchContract = function(contract){
		$rootScope.contract = contract;
		contractService.getStudent(contract,function(data){
			$scope.contractList = data;
			$scope.empListInImageTab = data;
		});
		
		
	};
	
	$scope.selectedIndex = function(index){
		$log.info(index);
		$rootScope.index = index;
		
		if($rootScope.index == 0){
			$scope.contract = $rootScope.contract;
			contractService.getStudent($scope.contract,function(data){
			$scope.contractList = data;
				
		});
			
	}else if($rootScope.index == 1){
		contractService.searchByJobTitle($rootScope.searchData,function(data){
			$scope.empList = data; 
		});
	}
	};
	
	
	contractService.getDeptList(function(data){
		$scope.deptList = data;
		$scope.deptList.splice(0,0,"ALL")
	});
	
	$scope.editContract = function(contract){
		$rootScope.contract=contract;
		$location.path('/editStudentContract');
	}
	
	$scope.editContract2 = function(student){
		$rootScope.contract2 = student;
		$location.path('/editContract');
	};
	
	$scope.searchByJobTitle = function(student){
		$scope.tabs[1].active=true;
		$rootScope.index = 1;
		$rootScope.searchData = student;
		contractService.searchByJobTitle(student,function(data){
			$scope.empList = data; 
			$scope.contractList = data;
		});
	};
	contractService.getJobTitle(function(data){
		$scope.jobTitleList = data;
	});
	
	//Getting data by passiing name as String to DB
	$scope.searchByNameString = function(name){
		contractService.searchByNameString($.param({name : name}), function(data){
			$scope.contractList = data;
		});
	};
	
//	$scope.searchByNameString = function(name){
//		$scope.contract = {};
//		$scope.contract.name = name;
//		contractService.searchByNameString($scope.contract, function(data){
//			$scope.contractList = data;
//		});
//	};
	
});

app.controller('editContractController', function($scope,$rootScope,$location,contractService){
	
	$scope.contract = $rootScope.contract;
	
	$scope.originalContractStudent = angular.copy($scope.contract);
	
	$scope.back = function(){
		$location.path('/contract');
	};
	
	$scope.editReset = function(){
		$scope.contract = $scope.originalContractStudent;
	};
	
});

app.controller('editContractController2', function($scope,$rootScope,$location,contractService){
	
	$scope.contract2 = $rootScope.contract2;
	
	$scope.originalContractStudent = angular.copy($scope.contract2);
	
	$scope.goToContract = function(){
		$location.path('/contract');
	};
	
	$scope.resrtContract = function(){
		$scope.contract2 = $scope.originalContractStudent;
	};
	
	$scope.editContractStudent = function(){
		contractService.editContractStudent($scope.contract2, function(data){
			//$scope.msg = data;
			$location.path('/contract');
			
		});
	};
	
});

