var services = angular.module('BarcodeService',['ngResource']);

services.factory('BarcodeService', function($resource) {
	return $resource('rest/Barcode/:action',{},
			{
		submitStudent:{
			method: 'POST', isArray: true,
			params: {'action' : 'searchStudent'}
		},
		getAllData:{
			method: 'GET', isArray: true,
			params: {'action' : 'getAllData'}
		},
		getDepartments: {
			method: 'GET', isArray: true,
			params: {'action' : 'getDepartmentsList'}		
		},
		getListByJobTitle: {
			method:'POST',isArray: true,
			params: {'action':'getListByJobTitle'}
		},
		addNewStudent: {
			method: 'POST', isArray:false,
			params:{'action':'addNewStudent'}
		},
		deleteStudent: {
			method:'POST', isArray:false,
			params:{'action':'deleteStudent'}
		},
		getSelectedData: {
			method: 'POST', isArray:true,
			params:{'action': 'getSelectedData'}
		},
		getRegionIdlist: {
			method:'GET', isArray:true,
			params:{'action':'getRegionIdlist'}
		}
	
	});

});