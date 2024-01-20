$(document).ready(function(){
    // Load user header
    $('#UserHeaderContainer').load('UserHeader', function(){
        // Load user footer after user header is loaded
        $('#UserFooterContainer').load('UserFooter');
    });
});