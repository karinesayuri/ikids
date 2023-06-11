<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="UTF-8">
    <title>Ikids</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <style>
    body {
      padding-top: 50px;
      background-color: #2a265f;
      color: #ffffff;
    }

    .navbar {
      background-color: #000000;
      border-bottom: 1px solid #ffffff;
    }

    .navbar-brand {
      margin-left: 10px;
      font-size: 30px;
      padding: 0px;
    }

    .container {
      max-width: 800px;
      margin: 0 auto;
    }

    .jumbotron-fluid {
      padding: 30px;
      border: none;
      border-radius: 0;
      margin-bottom: 0;
      color: #ffffff;
      background-image: url("img/imagem1.avif");
      background-size: cover;
      background-position: center;
      height: 550px; /* Altura personalizada */
      display: flex;
      align-items: center;
      justify-content: center;
      text-align: center;
    }

    .jumbotron-fluid .container {
      max-width: 100%;
      padding: 0;
    }

    .jumbotron-content {
      width: 100%;
    }

    .jumbotron-fluid h1,
    .jumbotron-fluid p,
    .jumbotron-fluid a {
      color: #ffffff;
    }

    .btn-primary {
      background-color: #9a86e5;
      border-color: #9a86e5;
    }

    .btn-primary:hover {
      background-color: #7764c7;
      border-color: #7764c7;
    }

    .features {
      padding: 40px;
      background: #ffffff;
      border-radius: 5px;
      margin-top: 30px;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      color: #4d47a6;
    }

    .features h2 {
      color: #4d47a6;
    }

    .features ul {
      list-style-type: none;
      padding-left: 0;
    }

    .features li {
      margin-bottom: 10px;
      padding-left: 20px;
      position: relative;
    }

    .features li:before {
      content: "\2022";
      color: #9a86e5;
      font-size: 20px;
      position: absolute;
      left: 0;
      top: 0;
    }

    .feature-item {
      font-size: 18px;
    }

    .cta {
      text-align: center;
      margin-top: 30px;
    }

    .banner {
      display: flex;
      align-items: center;
      justify-content: center;
      height: 85vh;
      width: 100%;
      position: relative;
    }

    .banner::before {
      content: "";
      position: absolute;
      inset: 0;
      background-image: url("img/imagem1.avif");
      background-size: cover;
      background-position: bottom;
      z-index: -1;
      opacity: 0.5;
    }
  </style>
</head>
<body>
    <nav class="navbar navbar-expand-md navbar-dark">
  		<div class="container-fluid">
    		<a class="navbar-brand navbar-text-left" href="#">Ikids</a>
		    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse">
		      <span class="navbar-toggler-icon"></span>
		    </button>
	    	<div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link" onclick="redirecionarPagina()">Login</a>
		        </li>
		      </ul>
	    	</div>
  		</div>
	</nav>
  <div class="banner">
    <div>
        <h1 class="display-4">Bem-vindo Banco Digital Ikids</h1>
        <p class="lead">Um banco digital seguro e conveniente para suas necessidades financeiras.</p>
        <hr class="my-4">
        <p>Abra uma conta conosco hoje mesmo e aproveite todos os benefícios que oferecemos.</p>
        <a class="btn btn-primary btn-lg" href="#" role="button" onclick="abrirConta()">Abrir Conta</a>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-md-12 features">
        <h2>Pensado especialmente para crianças e seus pais</h2>
        <p>O Meu Banco Digital é uma plataforma segura e educacional projetada para ajudar crianças a aprenderem sobre gestão financeira desde cedo, com o apoio e acompanhamento dos pais. Nossos recursos incluem:</p>
        <ul>
          <li class="feature-item">Contas bancárias personalizadas para crianças</li>
          <li class="feature-item">Ferramentas interativas para ensinar conceitos financeiros</li>
          <li class="feature-item">Acompanhamento dos gastos e economias</li>
          <li class="feature-item">Orçamento e metas financeiras</li>
          <li class="feature-item">Transações controladas pelos pais</li>
        </ul>
        <p>Abra uma conta hoje mesmo e comece a ensinar seu filho sobre finanças de forma divertida e responsável!</p>
      </div>
    </div>
  </div>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script>
    function redirecionarPagina() {
      window.location.href = 'http://localhost:8080/banco-ikids/login.jsp';
    }
    
    function abrirConta(){
    	window.location.href = 'http://localhost:8080/banco-ikids/cadastro.jsp';
    }
  </script>
</body>
</html>
