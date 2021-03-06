var app = angular.module('myOwnApp', ['ngRoute','myApp.services']);
app.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider,$locationProvider,$httpProvider){
  $routeProvider
  .when('/home', {
    templateUrl:'view/home.html',
    controller:'myCtrl'
  })
.when('/table',{
  templateUrl:'view/table1.html',
  controller:'myCtrl'
})
.when('/student',{
  templateUrl:'view/studentLogin.html',
  controller:'myCtrl'
})
.when('/parent',{
  templateUrl:'view/parentLogin.html',
  controller:'myCtrl'
}).otherwise({
  redirectTo:'/home'
});
 $locationProvider.hashPrefix('');
}]);
/*app.directive('myDir',function(randomDetails){
  retutn{
    restrict:'E',
    scope:{
      myDetails:'='
    }
templateUrl:'view/resource',
controller.function($scope){
}
  };
});*/
