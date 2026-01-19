<html>
<head>

</head>
<body class="bg-light" style="font-family: 'Segoe UI', sans-serif;">

<jsp:include page="navbar.jsp" />

<div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
  <div class="card shadow-lg border-0" style="max-width: 600px; width: 100%;">

    <div class="card-body text-center p-5">
      <h1 class="text-danger fw-bold mb-3">
        Oops! Something Went Wrong
      </h1>

      <p class="text-muted mb-4">
        An unexpected error occurred while processing your request.
      </p>

      <div class="alert alert-danger fw-semibold">
        ${Error}
      </div>

      <a href="index.jsp" class="btn btn-primary mt-3">
        Go Back to Home
      </a>
    </div>

  </div>
</div>

</body>



</html>