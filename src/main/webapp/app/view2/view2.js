'use strict';

angular.module('myApp.view2', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/view2', {
              templateUrl: 'app/view2/view2.html',
              controller: 'LogInCtrl'
            });
          }])

     .controller('LogInCtrl', ["$window","$rootScope","$location","$http","$scope","$timeout",function($window,$rootScope,$location,$http,$scope,$timeout) {
   $scope.login = function () {
            $http.post('api/login', $scope.user)
                    .success(function (data) {
                      $window.sessionStorage.id_token = data.token;
                    $rootScope.$broadcast("loginEvent",{token:data.token, status:true});
                      $timeout(function(){
                          
                      $location.path("#/view1");
                      },100);
                    })
                    .error(function (data) {
                      delete $window.sessionStorage.id_token;
               $rootScope.$broadcast("loginEvent",{token:null, status:false});
//                      clearUserDetails($scope);
                    });
          };
}]);