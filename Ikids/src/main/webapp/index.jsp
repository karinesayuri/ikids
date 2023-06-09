<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exemplo de Página JSP com JSTL</title>
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
      margin-right: auto; 
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
      background-image: url("${pageContext.request.contextPath}/img/imagem1.avif");
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
      padding: 30px;
      background-color: #ffffff;
      border-radius: 5px;
      margin-top: 30px;
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

    .cta {
      text-align: center;
      margin-top: 30px;
    }

    .navbar-text-left {
      margin-right: auto;
      margin-left: 0;
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
      background-image: url("${pageContext.request.contextPath}/img/imagem1.avif");
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
      <a class="navbar-brand navbar-text-left" href="#">Meu Banco Digital</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="#">Sobre</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Serviços</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contato</a>
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
        <a class="btn btn-primary btn-lg" href="#" role="button">Abrir Conta</a>
    </div>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-md-12 features">
        <h2 class="text-center">Pensado especialmente para crianças e seus pais</h2>
        <p class="text-center">O Meu Banco Digital é uma plataforma segura e educacional projetada para ajudar crianças a aprenderem sobre gestão financeira desde cedo, com o apoio e acompanhamento dos pais. Nossos recursos incluem:</p>
        <ul>
          <li>Contas bancárias personalizadas para crianças</li>
          <li>Ferramentas interativas para ensinar conceitos financeiros</li>
          <li>Acompanhamento dos gastos e economias</li>
          <li>Orçamento e metas financeiras</li>
          <li>Transações controladas pelos pais</li>
        </ul>
        <p class="text-center">Abra uma conta hoje mesmo e comece a ensinar seu filho sobre finanças de forma divertida e responsável!</p>
      </div>
    </div>
  </div>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
