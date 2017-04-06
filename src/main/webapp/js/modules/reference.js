var reference = angular.module('reference', ['ngRoute','ref.services']);
reference.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider,$locationProvider,$httpProvider){
  $routeProvider
  .when('/parent', {
    templateUrl:'view/parent.html',
    controller:'parentCtrl'
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
