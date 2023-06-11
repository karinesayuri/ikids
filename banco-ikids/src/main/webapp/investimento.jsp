<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ikids</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <style>
      .navbar {
        background-color: #000000;
        border-bottom: 1px solid #ffffff;
      }

      .navbar-brand {
        margin-left: 10px;
        font-size: 30px;
        padding: 0px;
      } 	
      body {
        background-color: #8A05BE;
        color: #FFFFFF;
        font-family: Arial, sans-serif;
      }

      .card {
        background-color: #FFFFFF;
        color: #000000;
        margin-bottom: 20px;
      }

      .card-title {
        color: #8A05BE;
        font-weight: bold;
      }

      .btn-nubank {
        background-color: #8A05BE;
        border-color: #8A05BE;
        color: #FFFFFF;
      }

      .btn-nubank:hover,
      .btn-nubank:focus {
        background-color: #6B038F;
        border-color: #6B038F;
      }

      .form-control.nubank {
        border-color: #8A05BE;
      }

      .form-control.nubank:focus {
        box-shadow: 0 0 0 0.2rem rgba(138, 5, 190, 0.25);
        border-color: #8A05BE;
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
              <a class="nav-link" onclick="redirecionarPagina()">Olá, ${param.nome}, <span onclick="sair()" >sair</span> <br>Saldo R$ ${param.saldo}</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container" style="margin-top: 20px;">
      <h1 class="text-left">Investimentos</h1>
      <div class="row mt-5">
      <c:if test="${mensagem != null}">
	    	<c:choose>
			    <c:when test="${mensagem != null && mensagem eq 'Cadastrado com sucesso!'}">
			        <div class="alert alert-success">
			            ${mensagem}
			        </div>
			    </c:when>
			    <c:otherwise>
			        <div class="alert alert-danger">
			            ${mensagem}
			        </div>
			    </c:otherwise>
			</c:choose>    		
    	</c:if>
      <form action="/banco-ikids/InvestimentoRendaFixa" method="POST">
        <div class="col-md-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Renda Fixa</h5>
              <p class="card-text">Descrição da Renda Fixa</p>
               <input type="hidden" name="idCliente" value="${param.idCliente}">
              <input type="text" class="form-control mb-2 nubank" placeholder="Valor do investimento" name="vl_invest">
              <button class="btn btn-nubank" type="submit">Investir</button>
            </div>
          </div>
        </div>
       </form> 
      	<form action="/banco-ikids/InvestimentoRendaVariavel" method="POST">	  
        <div class="col-md-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Renda Variável</h5>
              <p class="card-text">Descrição da Renda Variável</p>
              <input type="hidden" name="idCliente" value="${param.idCliente}">
              <input type="text" class="form-control mb-2 nubank" placeholder="Valor do investimento" name="vl_invest">
              <button class="btn btn-nubank" type="submit">Investir</button>
            </div>
          </div>
        </div>
        </form>
        <form action="/banco-ikids/TesouroDireto" method="POST">
        <div class="col-md-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Tesouro Direto</h5>
              <p class="card-text">Descrição do Tesouro Direto</p>
              <input type="hidden" name="idCliente" value="${param.idCliente}">
              <input type="text" class="form-control mb-2 nubank" placeholder="Valor do investimento" name="vl_invest">
              <button class="btn btn-nubank" type="submit">Investir</button>
            </div>
          </div>
        </div>
        </form>
      </div>
    </div>

    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script>
	    function sair(){
			window.location.href = 'http://localhost:8080/banco-ikids/index.jsp';
		}
	</script>
  </body>
</html>
