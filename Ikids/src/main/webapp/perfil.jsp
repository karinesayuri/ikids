<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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
              <a class="nav-link" onclick="redirecionarPagina()">Olá, [Nome do Usuário] <br>Saldo R$ [Valor do Saldo]</a>
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
                  <p class="card-text">Nome: Julio Cezar Alexandre Santos Lima</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-2">
                  <p class="card-text">Gênero: Macho Alfa</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">CPF: 087.914.345-80</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">RG: 41.568.908-0</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">Nascimento: 27/01/1985</p>
                </div>
              </div>
              <div class="row row-space">
                <div class="col-md-3">
                  <p class="card-text">Telefone: 11 948295712</p>
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
              <table class="table">
                <thead>
                  <tr>
                    <th>Investimento</th>
                    <th>Taxa</th>
                    <th>Valor do Investimento</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>[Investimento 1]</td>
                    <td>[Taxa 1]</td>
                    <td>[Valor do Investimento 1]</td>
                  </tr>
                  <tr>
                    <td>[Investimento 2]</td>
                    <td>[Taxa 2]</td>
                    <td>[Valor do Investimento 2]</td>
                  </tr>
                  <!-- Adicione mais linhas de acordo com seus investimentos -->
                </tbody>
              </table>
              <button class="btn btn-custom">Cadastrar</button>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
