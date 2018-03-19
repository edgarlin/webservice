/**
 * 
 */
chrome.browserAction.onClicked.addListener(function(activeTab){
  var newURL = "Poster.html";
  chrome.tabs.create({ url: newURL });
});