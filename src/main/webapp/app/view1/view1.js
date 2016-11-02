'use strict';

angular.module('myApp.view1', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
                $routeProvider.when('/view1', {
                    templateUrl: 'app/view1/view1.html',
                    controller: 'ShopCtrl',
                    controllerAs: 'ctrl'
                });
            }])

        .filter('phoneFilter', function () {

            return function (rawPhoneNumber) {

                var phoneNumber = rawPhoneNumber;
                phoneNumber = phoneNumber.replace(/ /g, '');
                if(phoneNumber[0]!='+'){
                    phoneNumber = '+45'+ phoneNumber;
                }
                phoneNumber = phoneNumber.substr(0,3) + ' '
                        +phoneNumber.substr(3,2) + ' '
                        +phoneNumber.substr(5,2) + ' '
                        +phoneNumber.substr(7,2) + ' '
                        +phoneNumber.substring(9,phoneNumber.length);


                return phoneNumber;
            }

        })
        
        .filter('hrefFilter', function () {

            return function (rawLink) {

                var link = rawLink;
                if(!link.match(/http/)){
                    link = 'http://' + link;
                }
                return link;
            }

        })
        
        .filter('linkTxtFilter', function () {

            return function (rawLink) {

                var link = rawLink;
                link = link.replace(/https?:\/\//,'');
                return link;
            }

        })

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
