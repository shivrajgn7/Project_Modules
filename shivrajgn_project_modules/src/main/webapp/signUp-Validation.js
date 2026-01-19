function validateSignUpForm() {

  const name = document.querySelector('input[name="name"]').value.trim();
  const email = document.querySelector('input[name="email"]').value.trim();
  const phone = document.querySelector('input[name="phoneNumber"]').value.trim();
  const age = document.querySelector('input[name="age"]').value.trim();
  const gender = document.querySelector('select[name="gender"]').value;
  const password = document.querySelector('input[name="password"]').value;
  const cpassword = document.querySelector('input[name="cpassword"]').value;

  // Name validation
  if (name.length < 3) {
    alert("Name must be at least 3 characters");
    return false;
  }

  // Email validation
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailPattern.test(email)) {
    alert("Please enter a valid email address");
    return false;
  }

  // Phone validation
  if (phone.length !== 10) {
    alert("Phone number must be 10 digits");
    return false;
  }

  // Age validation
  if (age < 18 || age > 60) {
    alert("Age must be between 18 and 60");
    return false;
  }

  // Gender validation
  if (gender === "Gender...") {
    alert("Please select gender");
    return false;
  }

  // Password validation
  if (password.length < 6) {
    alert("Password must be at least 6 characters");
    return false;
  }

  // Confirm password
  if (password !== cpassword) {
    alert("Passwords do not match");
    return false;
  }

  return true; // form will submit
}
