'use strict';

angular.module('myApp.documentation', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/doc', {
    templateUrl: 'app/documentation/documentation.html'
  });
}]);

