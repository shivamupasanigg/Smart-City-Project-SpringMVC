<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>FeedBack Alert</title>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/sweetalert2@10/dist/sweetalert2.min.css">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10/dist/sweetalert2.min.js"></script>
    
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
Swal.fire({
    title: 'FeedBack',
    text: '${FeedBack}',
    icon: 'info',
    confirmButtonColor: "#3085d6",
    confirmButtonText: 'OK'
   
}).then(function () {
    // Redirect to the success page
    window.location.href = 'AdminViewFeedBack';
});
</script>
</body>
</html>