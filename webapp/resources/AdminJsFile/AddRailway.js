/**
 * 
 */

 $(document).ready(function() {
			// Load header.jsp
			$('#headerContainer').load('header', function() {
					$('#footerContainer').load('footer');
				});
			});