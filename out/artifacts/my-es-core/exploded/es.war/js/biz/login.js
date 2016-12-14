/**
 * Created by Administrator on 04/03/2016.
 */
"use strict";
var user = angular.module('user', []);
user.controller('userCtrl', function($scope, $http) {
    //用户登录
    $scope.login = function() {
        if(!$scope.username || !$scope.password) {
            alert("请填写用户名和密码！");
            return;
        }
        var userData = {
            name:$scope.username,
            password: $scope.password
        };
        tool.post($http, '/login', userData, function (content) {
            if (content){
                window.location="/es/html/welcome.html"
            }else {
             alert("用户名或密码错误");
            }
        });
    };
});
