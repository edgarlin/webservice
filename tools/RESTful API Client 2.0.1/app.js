/**
 * 
 */
var extApp = angular.module('myExtApp', [ 'ngRoute', 'ngResource' ]);


extApp.controller( 'posterController', function ($scope, $http, $location) {
	$scope.outputRadioButtonValue = 'text';
	$scope.requestType = 'GET';

	$scope.isError = false;
    $scope.errorMessage = 'abc';
    $scope.jsonResponse = '';
	$scope.currentTab = 'request';
	$scope.contentType = 'application/json';
	$scope.httpStatusCode = '';
	
	
    $scope.tabClick = function(tabName){
    	$scope.currentTab = tabName;
    	console.log('tabName = ' + $scope.currentTab);
    }
    
	$scope.apiCallButtonClicked = function(){

		$scope.isError = false;
	    $scope.errorMessage = ' ';
	    $scope.jsonResponse = ' ';

	    if($scope.userID!='' && $scope.passWord != ''){
	    	$scope.currentUser = { username: $scope.userID, authdata: $scope.passWord } ;
	    }
	    if ($scope.currentUser){
	    	$http.defaults.headers.common['Authorization'] = 'Basic ' +$scope.currentUser; 
	    }
	    
	    $http({
	        method : $scope.requestType,
	        url : $scope.passedInURL,
	        cache: false,
	        headers: {
	            "Content-Type": $scope.contentType
	        }	        	
	    }).then(function mySucces(response) {
	        $scope.jsonResponse = response.data;
	        $scope.httpStatusCode = response.status;
	        console.log("Status Code " + $scope.httpStatusCode);
	    }, function myError(response) {
	        $scope.isError = true;
	        $scope.httpStatusCode = response.status;
	        $scope.errorMessage = "Failed to make request: " + response.statusText +", " + response.status + ", for details view console.";
	    });
	    if ($scope.currentTab == 'request'){
	    	$scope.currentTab = 'response';
	    }
			
	};
});


/**
 * Xml filter
 * Not My code : GitHub Copied, used as-is
 */
extApp.filter('xml', function() {
	  // In the return function, we must pass in a single parameter which will be the data we will work on.
	  // We have the ability to support multiple other parameters that can be passed into the filter optionally
	  return function(xml) {
			try
			{
			    var formatted = '';
			    var reg = /(>)(<)(\/*)/g;
			    xml = xml.replace(reg, '$1\r\n$2$3');
			    var pad = 0;
			    jQuery.each(xml.split('\r\n'), function(index, node) {
			        var indent = 0;
			        if (node.match( /.+<\/\w[^>]*>$/ )) {
			            indent = 0;
			        } else if (node.match( /^<\/\w/ )) {
			            if (pad != 0) {
			                pad -= 1;
			            }
			        } else if (node.match( /^<\w[^>]*[^\/]>.*$/ )) {
			            indent = 1;
			        } else {
			            indent = 0;
			        }
		
			        var padding = '';
			        for (var i = 0; i < pad; i++) {
			            padding += '  ';
			        }
		
			        formatted += padding + node + '\r\n';
			        pad += indent;
			    });
			    return  formatted;
			}
			catch (err)
			{
				console.log("not xml!");
			    return xml;
			}
	  }
	});


function openWebStore()
{
	window.open('https://chrome.google.com/webstore/detail/poster-application/bkljbpcinjfaphhbaohfdklndjblahmo/reviews?hl=en-US&gl=US','_blank');
}
/**
		var xhr = new XMLHttpRequest();
		xhr.open("GET", $scope.passedInURL, false);
		xhr.onreadystatechange = function() {
		  if (xhr.readyState == 4) {
			  $scope.jsonResponse =  xhr.responseText;
		  }
		}
		xhr.send();
		
		setTimeout(function () {
	        $scope.$apply(function () {
	        	console.log('$scope.jsonResponse  = ' + $scope.jsonResponse );
	        });
	    }, 200);
**/

/**
window.open(url,'_blank');
**/