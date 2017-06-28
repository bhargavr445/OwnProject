app.controller('contractController', function($scope,$rootScope,$http,$log,$location,contractService) {

	$scope.contract = {};	
	
	$scope.tabs = [
					{ title:"Contract", page:"view/contract/contractClass.html", active: true },
					{ title:"Contract Class", page:"view/payroll/view.html" },
					{ title:"Image", page:"view/payroll/scan.html" }
	               ];

	$scope.searchContract = function(){
		contractService.getStudent($scope.contract,function(data){
			$scope.contractList = data;
		});
	};
});
