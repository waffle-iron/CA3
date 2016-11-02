'use strict';

angular.module('myApp.view2', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/view2', {
              templateUrl: 'app/view2/view2.html',
              controller: 'AppLoginCtrl'
            });
          }])

     .controller('View2Ctrl', ["InfoFactory","InfoService",function(InfoFactory,InfoService) {
  this.msgFromFactory = InfoFactory.getInfo();
  this.msgFromService = InfoService.getInfo();
}]);