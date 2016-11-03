'use strict';

angular.module('myApp.view1', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view1', {
                    templateUrl: 'app/view1/view1.html',
                    controller: 'ShopCtrl',
                    controllerAs: 'ctrl'
                });
            }])

        .controller('ShopCtrl', function ($scope, $uibModal, ShopService) {
            $scope.shops = [];
            $scope.selectedShop = {};
            ShopService.getShops().then(
                    function (response) {
                        $scope.shops = response.data;
                    },
                    function (response) {
                        console.log(response.data.toString());
                    });


            $scope.showDialog = function (shop) {
                $scope.selectedShop = shop;
                $uibModal.open({
                    templateUrl: 'app/view1/shop/shop.html',
                    scope: $scope
                            //controller: 'ShopCtrl'
                })
            };

        })
        .service('ShopService', function ($http) {
            var shop = {};
            shop.getShops = function () {
                return $http.get('api/shop/all'); //<--<-- rest API
            };
            return shop;

        });
