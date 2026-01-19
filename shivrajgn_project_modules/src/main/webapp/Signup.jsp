<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body style="text-align:left;backgroundcolor:gray">
<jsp:include page="navbar.jsp" />
<div style="display: flex; align-items: center; justify-content: center; width: 100vw; background-color: #fffff">
    <div style="width: 50vw; margin: 10px 0 10px 0; box-shadow: 0px 0px 20px 0px">
    <h1></h1>
        <h1 class="text-center fw-bold mb-0">Sign Up to Continue</h1>
        <form style="padding:50px" action="signUp" method="post" onsubmit="return validateSignUpForm()">
<div class="row g-3">
  <div class="col">
    <input type="text" name="name" class="form-control mt-3" placeholder="First name" aria-label="First name">
  </div>
  <div class="col">
    <input type="email" name="email" class="form-control mt-3" placeholder="email" aria-label="Last name">
  </div>
</div>
<div class="row g-3">
   <div class="col">
      <input type="number" name="phoneNumber" class="form-control mt-3" placeholder="Phone Number" aria-label="First name">
    </div>
    <div class="col">
      <input type="number" name="age" class="form-control mt-3" placeholder="Age" aria-label="Last name">
    </div>
</div>

<div class="row g-3">
    <label for="inputCity" class="form-label"></label>
    <input type="text" name="address" placeholder="Address" class="form-control mt-2" id="inputCity">
  </div>

  <div class="col-md-4">
    <label for="inputState" class="form-label mt-2"></label>
    <select id="inputState"  name="gender" class="form-select">
      <option selected>Gender...</option>
      <option value="male">Male</option>
      <option value="female">Female</option>
      <option value="others">Others</option>
    </select>
</div>
 <div class="row g-3">
    <div class="col">
       <input type="number" name="zipcode" class="form-control mt-3" placeholder="Zip Code" aria-label="First name">
     </div>
     </div>

  <div class="row g-3">
    <div class="col">
      <input type="text" name="password" class="form-control mt-3" placeholder="Password" >
    </div>
    <div class="col">
      <input type="text" name="cpassword" class="form-control mt-3" placeholder="Confirm Password" >
    </div>
  </div>
  <h1> </h1>
<div class="d-grid gap-2 col-6 mx-auto">
  <input class="btn btn-primary" type="submit"></button>
    </div>

    </div>
</form>

</div>
</div>
<script src="signUp-Validation.js"></script

</body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js">
</html>

