var app = angular
.module("myModule", [])
.controller("myController", function ($scope)
{
    var schedule = [
        {
            busno : "B-101", pick_upPlace : "Baddi" ,arrivalTime : "7:00 am" , dropPlace :
            "Chitkara University" , dropTime : "9:00 am"
        },
        {
            busno : "B-102", pick_upPlace : "Pinjore" , arrivalTime : "7:50 am" , dropPlace :
            "Chitkara University" , dropTime : "9:00 am"
        },
        {
            busno : "B-103", pick_upPlace : "Panchkula" ,arrivalTime : "7:30 am" , dropPlace :
            "Chitkara University" , dropTime : "9:00 am"
        },
        {
            busno : "B-104", pick_upPlace : "Sector-17" ,arrivalTime : "7:45 am" , dropPlace :
            "Chitkara University" , dropTime : "9:00 am"
        },

    ];
    $scope.schedule = schedule;
    $scope.search = function(item)
    {
        if($scope.searchText == undefined)
        {
            return true;
        }
        else{
            if(item.busno.toLowerCase().indexOf($scope.searchText.toLowerCase()) != -1 ||
            item.pick_upPlace.toLowerCase().indexOf($scope.searchText.toLowerCase()) != -1 ||
            item.dropPlace.toLowerCase().indexOf($scope.searchText.toLowerCase()) != -1 ){
                return true;
            }
        }
        return false;
    }
}
);