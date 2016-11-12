'use strict';

angular.module('myApp.view1', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view1', {
                    templateUrl: 'app/view1/view1.html',
                    controller: 'ShopCtrl',
                    controllerAs: 'ctrl'
                });
            }])

       .controller('ShopCtrl', function ($scope, $uibModal, ShopService, selectedShopFac, googleFactory) {
            $scope.shops = [];
            $scope.selectedShop = selectedShopFac.setSelectedShop({});
            ShopService.getShops().then(
                    function (response) {
                        $scope.shops = response.data;
                    },
                    function (response) {
                        console.log(response.data.toString());
                    });


            $scope.showDialog = function (shop) {
                $scope.selectedShop = selectedShopFac.setSelectedShop(shop);
//                $scope.selectedShop.rating = googleFactory.getOpeningHours();
                if(!angular.isUndefined($scope.selectedShop.placeId)){
                    googleFactory.getOpeningHours().success(function (data) {
                        $scope.selectedShop.rating = data + " \/ 5";
                    });
                } else{
                    $scope.selectedShop.rating = "no ratings";
                }

                $uibModal.open({
                    templateUrl: 'app/view1/shop/shop.html',
                    scope: $scope
                });
            };
        })
        .service('ShopService', function ($http) {
            var shop = {};
            shop.getShops = function () {
                return $http.get('api/shop/all'); //<--<-- rest API
            };
            return shop;

        })
        .directive('mapDir', function ($window) {
            return {
                restrict: 'A',
                link: function (scope, element) {

                    function onResize() {
                        var mapDiv = element;
                        mapDiv.height(mapDiv.width() * 1.45);
                    }

                    onResize();
                    angular.element($window).on('resize', onResize);

                }
            };

        });

