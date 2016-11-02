'use strict';

angular.module('myApp.view1', ['ngRoute', ])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view1', {
                    templateUrl: 'app/view1/view1.html',
                    controller: 'ShopCtrl',
                    controllerAs: 'ctrl'
                });
            }])

        .controller('ShopCtrl', ["$scope", "ShopService", function ($scope, ShopService) {
                $scope.shops = [];
                ShopService.getShops().then(
                        function (response) {
                            $scope.shops = response.data;
                        },
                        function (response) {
                            console.log(response.data.toString());
                        });

                
                $scope.showDialog = function () {
                    //click to open dialog
                };

            }])
        .service('ShopService', ['$http', function ($http) {
                var shop = {};
                shop.getShops = function () {
                    return $http.get('api/shop/all'); //<--<-- rest API
                };
                return shop;

            }]);
