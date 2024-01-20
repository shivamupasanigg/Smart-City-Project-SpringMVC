<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    
    	<script type="text/javascript">
	window.history.forward();
	</script>
</head>
<body>
<script>
console.log("hello");
            Swal.fire({
                title: "Are you sure?",
                text: " Logout Admin Panel?",
                icon: "warning",
                showCancelButton: true,
                confirmButtonColor: "#3085d6",
                cancelButtonColor: "#d33",
                confirmButtonText: "Yes, Logout!"
            }).then((result) => {
                if (result.isConfirmed) {
                    Swal.fire({
                        title: "Logout!",
                        text: "Admin Logout Successfully.",
                        icon: "success"
                    }).then(function () {
                        // Redirect to the success page
                        window.location.href = 'IndexPageLoader';
                    });
                }else if (result.dismiss === Swal.DismissReason.cancel) {
                    // Redirect to another page when Cancel button is clicked
                    window.location.href = 'AdminPanel';
                }
            });

    </script>
</body>
</html>