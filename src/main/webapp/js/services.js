var services = angular.module('myApp.services',['ngResource']);

services.factory('myService', function($resource) {
	return $resource('rest/Student/:action',{},
			{
		login:{
			method: 'POST', isArray: false,
			params: {'action' : 'login'}
		},
		saveData:{
			method: 'GET', isArray: false,
			params: {'action' : 'saveStudent'}
		},
		searchData : {
			method: 'POST', isArray: true,
			params: {'action' : 'searchData'}
		},
		loadStudentData : {
			method : 'GET', isArray: true,
			params:{'action' : 'loadStudentData'}
		}
	});

});

