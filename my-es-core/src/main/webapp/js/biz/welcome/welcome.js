/**
 * Created by Dell on 2016/12/12.
 */
'use strict';
var app=angular.module('app',[]);
app.controller('indexCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.initPage = function () {
        tool.post($http, '/logs/test', null, function (content) {
            
        })
    }
}]);