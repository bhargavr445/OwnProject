app.controller('myCtrl', function($scope,$rootScope,$http,$log,$location,myService) {
	$scope.removeRow=function(index){
		
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
  
  
  $scope.updateStudent = function(student){
	  $rootScope.student = student;
	  $location.path('/editStudentHome');
  };
  
  
  
  $scope.save = function(){
    $log.info($scope.myDetails);
  }

  
  $http.get('http://api.openweathermap.org/data/2.5/weather?id=2172797&appid=d436c04d23a5a44329eb8255190a84be').then(function(sample){
    $scope.myDetails=sample.data;
    $log.info($scope.myDetails);
  });


  myService.getCounty(function(data){
	$scope.countyList = data;  
  })

  
  $scope.searchSubmit = function(){
	  myService.searchData($scope.search,function(result){
		  $scope.students = result;
		  $log.info($scope.students);
	  });
  };
  
});


app.controller('StudentEditController', function($scope,$rootScope,$http,$log,$location,myService) {
	$scope.editStudent = $rootScope.student;
	$scope.originalStudent = angular.copy($scope.student);
		
		$scope.reset = function(){
			$scope.editStudent = $scope.originalStudent;
		}
	 $scope.updateSubmit = function(){
		  
		 $scope.updateStudent = {};
		 $scope.updateStudent = $scope.editStudent;
		 $scope.updateStudent.address = $scope.student.address;
		 myService.updateStudent($scope.updateStudent.address,function(data){
			 $scope.result = data;
		 });
		 
	 };
	
	
	
	
	
	
	
	
	
	

	
	
});