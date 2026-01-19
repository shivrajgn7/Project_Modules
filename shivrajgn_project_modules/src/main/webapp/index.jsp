<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>X-Workz — Home</title>

  <!-- Bootstrap 5 CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { background: #f8fafc; color: #0f1724; font-family: system-ui, -apple-system, "Segoe UI", Roboto, "Helvetica Neue", Arial; }
    .hero { background: linear-gradient(180deg,#ffffff 0%, #f1f5f9 100%); border-radius: 12px; padding: 48px 24px; box-shadow: 0 6px 20px rgba(15,23,36,0.06); }
    .feature-icon { font-size: 28px; color: #0d6efd; }
    .cta-primary { background-color: #0d6efd; border-color: #0d6efd; color: #fff; }
    footer { padding: 28px 0; color: #6b7280; }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
  <div class="container">
    <a class="navbar-brand d-flex align-items-center" href="<%=request.getContextPath()%>/">
      <img src="https://x-workz.com/Logo.png" alt="Logo" width="36" height="30" class="me-2">
      <span class="fw-bold">X-Workz</span>
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mainNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse justify-content-end" id="mainNavbar">
      <ul class="navbar-nav me-3 mb-2 mb-lg-0">
        <li class="nav-item"><a class="nav-link" href="#features">Programs</a></li>
        <li class="nav-item"><a class="nav-link" href="#pricing">Courses</a></li>
        <li class="nav-item"><a class="nav-link" href="#contact">Placements</a></li>
      </ul>
      <div class="d-flex gap-2">
        <a href="<%=request.getContextPath()%>/Signin.jsp" class="btn btn-outline-primary">Sign In</a>
        <a href="<%=request.getContextPath()%>/Signup.jsp" class="btn cta-primary">Get Started</a>
      </div>
    </div>
  </div>
</nav>

<main class="container py-5">
  <div class="row align-items-center">
    <div class="col-lg-7 mb-4 mb-lg-0">
      <div class="hero">
        <h1 class="display-6 mb-3">
          Industry-Focused Training with Placement Assistance
        </h1>

        <p class="lead mb-4">
          X-Workz provides hands-on technical training in Java and Full Stack technologies,
          helping students build real-time project skills and become job-ready professionals.
        </p>

        <div class="d-flex gap-2">
          <a class="btn cta-primary btn-lg" href="<%=request.getContextPath()%>/Signup.jsp">Enroll Now</a>
          <a class="btn btn-outline-secondary btn-lg" href="<%=request.getContextPath()%>/Signin.jsp">Student Login</a>
        </div>
      </div>
    </div>

    <div class="col-lg-5 text-center">
      <img src="https://cdn.elearningindustry.com/wp-content/uploads/2023/10/How-Is-AI-Changing-The-Face-Of-Corporate-Training.jpg" alt="Training preview" class="img-fluid rounded shadow-sm">
    </div>
  </div>

  <section id="features" class="mt-5">
    <div class="row g-4">
      <div class="col-md-4">
        <div class="card h-100 border-0 shadow-sm">
          <div class="card-body">
            <div class="mb-3 feature-icon">🎓</div>
            <h5 class="card-title">Expert-Led Training</h5>
            <p class="card-text text-muted">
              Learn from industry professionals with structured courses, practical sessions,
              and real-time project exposure.
            </p>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card h-100 border-0 shadow-sm">
          <div class="card-body">
            <div class="mb-3 feature-icon">💻</div>
            <h5 class="card-title">Real-Time Projects</h5>
            <p class="card-text text-muted">
              Gain hands-on experience by working on live projects using Java,
              Spring, databases, and web technologies.
            </p>
          </div>
        </div>
      </div>

      <div class="col-md-4">
        <div class="card h-100 border-0 shadow-sm">
          <div class="card-body">
            <div class="mb-3 feature-icon">🚀</div>
            <h5 class="card-title">Placement Support</h5>
            <p class="card-text text-muted">
              Resume building, mock interviews, and placement assistance to help
              students confidently step into the IT industry.
            </p>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section id="cta" class="mt-5">
    <div class="p-4 bg-white rounded shadow-sm d-flex flex-column flex-md-row align-items-center justify-content-between">
      <div>
        <h5 class="mb-1">Start Your IT Career with X-Workz</h5>
        <p class="mb-0 text-muted">
          Enroll today and gain industry-ready skills with expert guidance and placement support.
        </p>
      </div>
      <div class="mt-3 mt-md-0">
        <a class="btn cta-primary" href="<%=request.getContextPath()%>/Signup.jsp">Join Now</a>
      </div>
    </div>
  </section>
</main>

<footer class="bg-white mt-5">
  <div class="container">
    <div class="row align-items-center py-4">
      <div class="col-md-6">
        <strong>X-Workz</strong>
        <div class="small text-muted">
          Industry-oriented training and placement assistance for aspiring software professionals.
        </div>
      </div>
      <div class="col-md-6 text-md-end small text-muted">
        <a href="#" class="text-decoration-none me-3">Privacy</a>
        <a href="#" class="text-decoration-none">Terms</a>
      </div>
    </div>
  </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
