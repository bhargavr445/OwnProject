var services = angular.module('myApp.services',['ngResource']);

services.factory('myService', function($resource) {
	return $resource('rest/Student/:action',{},
			{
		login:{
			method: 'POST', isArray: false,
			params: {'action' : 'login'}
		},
		saveData:{
			method: 'POST', isArray: false,
			params: {'action' : 'saveStudent'},
		}
			});

});

