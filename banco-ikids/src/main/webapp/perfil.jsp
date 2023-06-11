<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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

      .btn-custom {
        background-color: #000000;
        border-color: #000000;
        color: #FFFFFF;
      }

      .btn-custom:hover,
      .btn-custom:focus {
        background-color: #222222;
        border-color: #222222;
      }

      .row-space {
        margin-top: 7px;
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
              <a class="nav-link">Olá, ${loginEncontrado.cliente.nomeCliente }, <span onclick="sair()" >sair</span> <br>Saldo R$ ${loginEncontrado.conta.valorSaldo}</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container">
      <div class="row mt-5">
        <div class="col-md-12">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Dados Cadastrais</h5>
              <div class="row">
                <div class="col-md-12">
                  <p class="card-text">Nome: ${loginEncontrado.cliente.nomeCliente }</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-2">
                  <p class="card-text">Gênero: ${loginEncontrado.cliente.genero }</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">CPF: ${loginEncontrado.cliente.numeroCpf }</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">RG: ${loginEncontrado.cliente.numeroRg }</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">Nascimento: ${loginEncontrado.cliente.dataNacimentoFormatada }</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">Telefone: ${loginEncontrado.cliente.telefone }</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="row mt-5">
        <div class="col-md-12">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Investimentos</h5>
              <c:if test="${fn:length(loginEncontrado.investimento) > 0}">
	              <table class="table">
	                <thead>
	                  <tr>
	                    <th>Investimento</th>
	                    <th>Taxa</th>
	                  </tr>
	                </thead>
	                <tbody>
	                  <c:forEach var="investimento" items="${loginEncontrado.investimento}">
					    <tr>
					        <td>${investimento.tipoInvestimento}</td>
					        <td>${investimento.taxaInvestimentoFormatada}</td>
					    </tr>
					</c:forEach>
	                </tbody>
	              </table>              
              </c:if>
              <c:if test="${fn:length(loginEncontrado.investimento) == 0}">
              	<tr>
			        <td colspan="3">Não há investimentos</td>
			    </tr>
              </c:if>
              <div class="row">
              	  <div class="col-md-1">
		              <button class="btn btn-custom" onclick="cadastrarInvestimento()">Cadastrar</button>                        	  	
              	  </div>		
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script>
		function cadastrarInvestimento(){
	    	window.location.href = 'http://localhost:8080/banco-ikids/investimento.jsp?idCliente=${loginEncontrado.cliente.cliente}&nome=${loginEncontrado.cliente.nomeCliente}&saldo=${loginEncontrado.conta.valorSaldo}';
	    }
		
		function sair(){
			window.location.href = 'http://localhost:8080/banco-ikids/index.jsp';
		}
	</script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
