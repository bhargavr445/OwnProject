var services = angular.module('contractService',['ngResource']);

services.factory('contractService', function($resource) {
	return $resource('rest/Contract/:action',{},
			{
		getStudent : {
			method : 'POST', isArray: true,
			params: {'action':'getEmpByName'}
		},
		getDeptList :{
			method: 'GET',isArray:true,
			params:{'action':'getDeptList'}
		},
		searchByJobTitle : {
			method: 'POST', isArray:true,
			params: {'action':'searchByJobTitle'}
		},
		editContractStudent : {
			method : 'POST',isArray : false,
			params : {'action':'editContractStudent'}
		},
		getStudentInImage : {
			method : 'POST',isArray : true,
			params : {'action':'getStudentInImage'}
		}
	});
});