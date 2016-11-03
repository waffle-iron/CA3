'use strict';
/* Place your global Factory-service in this file */

angular.module('myApp.factories', []).
        factory('InfoFactory', function () {
            var info = "Hello World from a Factory";
            var getInfo = function getInfo() {
                return info;
            };
            return {
                getInfo: getInfo
            };
        })
        .factory('selectedShopFac', function () {
            var selectedShop = {};
            return {
                getSelectedShop: function () {
                    return selectedShop;
                },
                setSelectedShop: function (shop) {
                    selectedShop = shop;
                    return selectedShop;
                }

            };
        })
        .factory('googleFactory', function ($http, selectedShopFac) {
            var shop = selectedShopFac.getSelectedShop();
            console.log(shop);
            var placeId = "ChIJw-01YqpTUkYR-MXn2-P9fLg";//shop.placeId;
            var gObject = {};
            gObject.getOpeningHours = function () {
                return $http.get('https://maps.googleapis.com/maps/api/place/details/json?placeid='+placeId+'&key=AIzaSyCk7blviPaQ3wPLGzDt7Dndzikj4bNeLI0');
            };
            return gObject;
        })
        
     

