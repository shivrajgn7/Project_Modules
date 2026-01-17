<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="text-align:left;backgroundcolor:gray">
<jsp:include page="navbar.jsp" />

<div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #fffff">
    <div style="width: 30vw; margin: 100px 0 10px 0; box-shadow: 0px 0px 20px 0px">
<h1></h1>
<h1></h1>
<h1 class="text-center mb-3">Sign In</h1>
        <form style="padding:50px" action="signIn" method="post">
    <div class="row g-2 mt-0">
      <div class="col">
        <input type="email" name="email" class="form-control mt-1" placeholder="email" aria-label="Email">
      </div>

        <input type="text" name="password" class="form-control mt-3" placeholder="password" aria-label="Password">
    </div>
<div class="d-grid gap-2 col-6 mx-auto mt-4">
  <input class="btn btn-primary" type="submit"></button>
</div>
</form>

</div>
</div>


</html>