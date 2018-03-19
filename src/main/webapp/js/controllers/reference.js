reference.controller('parentCntlr', function($scope,$http,$log,refServices) {
	
	details:[
		{
			"name":"Bhargav",
			"bill":20
		},
		{
			"name":"Ram",
			"bill":30
		}
	]
	
	
	
	$scope.login = function(){	
				refService.getEmpData(function(data){
				$scope.empData=data;
				
			});
		}

	$scope.getData= function(){
		$scope.customerDetails=details;
	}		
	
	$scope.customerDetails=details;
});