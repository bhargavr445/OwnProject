app.controller('myCtrl', function($scope,$http,$log,myService) {
	$scope.removeRow=function(index){
		//var rowNo= $scope.myDetails.indexOf(details);
		$scope.myDetails.splice(index,1);
	}
	
	
	$scope.addData=function(){
		$scope.myDetails.push({
			name: $scope.newData.name,
			id: $scope.newData.id,
			sal: $scope.newData.sal,
		});
		$scope.newData.name="";
		$scope.newData.id="";
		$scope.newData.sal="";
	};
  $scope.addnewRow = function(){
    $scope.myDetails.push({
      "name":"",
      "id" : "",
      "sal" : ""
    });
  };
  $scope.save = function(){
    $log.info($scope.myDetails);
  }
/*$http.get('data/mydetails.json').then(function(sample){
    $scope.myDetails=sample.data;
    $log.info($scope.myDetails);
  });*/
 /* myService.getData(function(data){
    $scope.myDetails=data;
    $log.info(data);
  });*/
  
  $scope.search = {};
  $scope.students = [];
  $scope.SearchSubmit = function(){
	  myService.searchData($scope.search,function(result){
		  $scope.students = result;
		  
	  });
  }
  
});