app.controller('myCtrl', function($scope,$http,$log,$location,myService) {
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
$http.get('http://api.openweathermap.org/data/2.5/weather?id=2172797&appid=d436c04d23a5a44329eb8255190a84be').then(function(sample){
    $scope.myDetails=sample.data;
    $log.info($scope.myDetails);
  });


 /* myService.getData(function(data){
    $scope.myDetails=data;
    $log.info(data);
  });*/
  
//  $scope.search = {};
//  $scope.students = [];
//  $scope.searchSubmit = function(){
//	  myService.searchData($scope.search,function(result){
//		  $scope.students = result;
//		  
//  });
//	  
//  }
  
//  myService.loadStudentData(function(data){
//	  $scope.students = data;
//  })
  myService.getCounty(function(data){
	$scope.countyList = data;  
  })
 
//  myService.loadAllNames(function(data){
//	  $scope.namesList = data;
//	  $log.info($scope.namesList);
//  })
  
  
  
  $scope.searchSubmit = function(){
	
	  myService.searchData($scope.search,function(result){
		  $scope.students = result;
	  });
  };
  
});