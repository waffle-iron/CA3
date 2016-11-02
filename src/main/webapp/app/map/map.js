'use strict';

angular.module('myApp.map', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/map', {
                    templateUrl: 'app/map/map.html',
                    controller: 'ShopCtrl',
                    controllerAs: 'ctrl'
                });
            }])

//        .controller('MapCtrl', ["$scope", "MapFactory", function ($scope, MapFactory) {
//
//
//            }])
//        .factory('MapFactory', function () {
//
//            var map = {};
//            map.getTestMsg = function () {
//                return "test map map test";
//            };
//            return map;
//
//        })

        .controller('ShopCtrl', ["$scope", "ShopService", function ($scope, ShopService) {
                $scope.shops = ShopService.getShops();

                $scope.showAdvanced = function (ev) {
                    $mdDialog.show({
                        controller: DialogController,
                        templateUrl: 'shop.html',
                        parent: angular.element(document.body),
                        targetEvent: ev,
                        clickOutsideToClose: true,
                        fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
                    })
                            .then(function (answer) {
                                $scope.status = 'You said the information was "' + answer + '".';
                            }, function () {
                                $scope.status = 'You cancelled the dialog.';
                            });
                };
            }])
        .service('ShopService', ['$http', function ($http) {
                var shop = {};
                shop.getShops = function () {
                    return $http.get(''); //<--<-- rest API
                };
                return shop;

            }]);

  