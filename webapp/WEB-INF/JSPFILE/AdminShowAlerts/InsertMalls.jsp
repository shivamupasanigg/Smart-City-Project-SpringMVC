<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/sweetalert2@10/dist/sweetalert2.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@10/dist/sweetalert2.min.js"></script>
<style>
.swal2-popup {
	background-color: #333;
	color: #fff;
}

.swal2-title {
	color: #fff;
}

.swal2-content {
	color: #ddd;
}

.swal2-actions button {
	background-color: #555;
	color: #fff;
}
</style>
</head>
<body>
<script>
		// Display SweetAlert for successful login
		Swal.fire({
			icon : 'success',
			title : 'Inserted Successful',
			text : 'Redirecting to Mall...',
			timer : 4000,
			showConfirmButton : false,
			
			customClass: {
		        popup: 'dark-mode-popup',
		        title: 'dark-mode-title',
		        content: 'dark-mode-content',
		        actions: 'dark-mode-actions',
		    }
		}).then(function() {
			// Redirect to the success page
			window.location.href = 'AddMalls';
		});
	</script>
</body>
</html>