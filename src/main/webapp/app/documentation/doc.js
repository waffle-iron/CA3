'use strict';

angular.module('myApp.documentation', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider
  .when('/doc', {
    templateUrl: 'app/documentation/documentation.html'
  })
            .when("/desc", {
                templateUrl: "app/documentation/descDoc.html"
            })
            .when("/test", {
                templateUrl: "app/documentation/testDoc.html"
            })
            .when("/sys", {
                templateUrl: "app/documentation/sysDoc.html"
            })
            .when("/task", {
                templateUrl: "app/documentation/taskDoc.html"
            })
            .otherwise({
                templateUrl: '/doc'});
}]);

