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
            $http.post('api/shop', $scope.user)
                    .success(function (data) {
                      $window.sessionStorage.id_token = data.token;
                    $rootScope.$broadcast("shopEvent",{token:data.token, status:true});
                      $timeout(function(){
                          
                      $location.path("#/view1");
                      },100);
                    })
                    .error(function (data) {
                      delete $window.sessionStorage.id_token;
               $rootScope.$broadcast("shopEvent",{token:null, status:false});
                    });
          };

}]);