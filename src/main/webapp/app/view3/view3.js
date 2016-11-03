'use strict';

angular.module('myApp.view3', ['ngRoute','ngResource'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'app/view3/view3.html',
    controller: 'View3Ctrl'
  });
}])

.controller('View3Ctrl', ['$scope','$http','$resource',function($http,$scope,$resource) {
  $scope.shop ={name:'',email:'',phone:'',adressAsString:'',description:'',website:'',category:'',updated:''};
 $scope.shop.updated = new Date();
 var address = $scope.shop.adressAsString.split(" ",2);
 $scope.shop.adress = {street: address[0], additionalInfo: address[1]};
// $http.post('api/shop')
//            .success(function (data, status, headers, config) {
//              $scope.shop = data;
//            })
//            .error(function (data, status, headers, config) {
//              
//             });
 $scope.saveShop=function(){
   var shop = $resource('/api/shop');  
   shop.create($scope.shop,function(response){
       $scope.message = response.message;
   });
 };
}]);