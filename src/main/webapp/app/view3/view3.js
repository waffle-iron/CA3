'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'app/view3/view3.html',
    controller: 'addShopCtrl'
  });
}])

.controller('addShopCtrl', ["$window","$rootScope","$location","$http","$scope","$timeout",function($window,$rootScope,$location,$http,$scope,$timeout){

 $scope.saveShop = function () {
            $http.post('api/shop',$scope.shop)
                    .success(function (data) {
//                      $window.sessionStorage.id_token = data.token;
//                    $rootScope.$broadcast("shopEvent",{token:data.token, status:true});
                       console.log("SUCCESS"); 
                      $timeout(function(){
                          
                      $location.path("#/view1");
                      },100);
                    })
                    .error(function (data) {
//                      delete $window.sessionStorage.id_token;
                            console.log("ERROR"); 
                    });
//               $rootScope.$broadcast("shopEvent",{token:null, status:false});
          };

}]);