app.controller('employeeController', function($scope, employeeService,$rootScope,$http,$log,$location) {
			
	
	$scope.searchById = function(){
		employeeService.searchEmployeeById($scope.emp, function(data){
			$scope.empList = data;
		});
	};
	
	
	employeeService.getAllId(function(data){
		$scope.idList = data;
	});
	
	
	
	
	
	
	
	
	

});



