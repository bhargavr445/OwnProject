var services = angular.module('contractService',['ngResource']);

services.factory('contractService', function($resource) {
	return $resource('rest/Contract/:action',{},
			{
		getStudent : {
			method : 'POST', isArray: true,
			params: {'action':'getEmpByName'}
		}
	});
});