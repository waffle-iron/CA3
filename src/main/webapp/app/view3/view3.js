'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'app/view3/view3.html',
    controller: 'addShopCtrl'
  });
}])

.controller('addShopCtrl', ["$location","$http","$scope","$timeout",function($location,$http,$scope,$timeout){
 
 $scope.saveShop = function () {
            $http.post('api/shop',$scope.shop)
                    .success(function (data) {
//                      $location.path("#view4");
                      $timeout(function(){
                      $location.path("#/view4");
                      },100);
                    })
                    .error(function (data) {
                            console.log("ERROR"); 
                    });
          };

}]);