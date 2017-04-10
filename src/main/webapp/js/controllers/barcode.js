app.controller('barcodeController', function($scope,$http,$log,myService) {
			
	$scope.contact = {};
	
	$scope.tabs = [
					{ title:"Search", page:"view/payroll/barcodeSearch.html", active: true },
					{ title:"View", page:"view/payroll/view.html" },
					{ title:"Scan", page:"view/payroll/scan.html" },
					{ title:"FMS", page:"view/payroll/barcodeSearch.html" },
					{ title:"SCAN w/o QA", page:"view/payroll/barcodeSearch.html"}
	               
	               
	               ];
	
	$scope.SearchSubmit = function(fromSource){
		  myService.searchData($scope.contact,function(result){
			  $scope.searchResults = result;
			  
		  });
		 }
	
	$scope.scanSubmit = function(){
		  myService.searchData($scope.contact,function(result){
			  $scope.scanResults = result;
			  
		  });
		 }
	
	$scope.tabSelected = function(index){
		if(index  == 2){
		if($scope.contact.stuName != null && $scope.contact.stuName != ""){
			 myService.searchData($scope.contact,function(result){
				  $scope.scanResults = result;
				  
			  });
		}
		}
		
	}
	
	$scope.delete = function(student){
		student.action = "delete";
		myService.deleteStudent(student,function(result){
			  $scope.scanResults = result;
			  myService.searchData($scope.contact,function(result){
				  $scope.searchResults = result;
				  
			  });
			  
		  });
	}
		 
});