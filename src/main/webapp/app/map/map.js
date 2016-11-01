'use strict';

angular.module('myApp.map', ['ngRoute'])

.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/map', {
            templateUrl: 'app/map/map.html',
            controller: 'MapCtrl',
            controllerAs: 'ctrl'
        });
    }])

.controller('MapCtrl', ["MapFactory", function (MapFactory) {
        this.msgFromMapFactory = MapFactory.getTestMsg();

    }])

.factory('MapFactory', function () {

    var map = {};
    map.getTestMsg = function () {
        return "test map map test";
    };
    return map;

});