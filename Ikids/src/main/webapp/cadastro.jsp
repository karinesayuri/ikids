<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ikids</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <style>
 	    body {
      background-color: #8A05BE;
    }

    .container {
      max-width: 500px;
      margin: 0 auto;
      margin-top: 50px;
      padding: 20px;
      background-color: #FFFFFF;
      border-radius: 5px;
    }

    h2 {
      color: #000000;
      text-align: center;
      margin-bottom: 20px;
    }

    .form-group label {
      color: #000000;
      text-align: left;
    }

    .form-group input,
    .form-group select {
      width: 100%;
      color: #000000;
      background-color: #FFFFFF;
      border-color: #000000;
    }

    .btn-primary {
      background-color: #000000;
      border-color: #000000;
      color: #FFFFFF;
    }

    .btn-primary:hover,
    .btn-primary:focus {
      background-color: #222222;
      border-color: #222222;
    }
    </style>
 </head>
  
  <body>
    <div class="container">
    <h2>Cadastro de Cliente</h2>
    <form action="processa-cadastro.php" method="POST">
      <div class="form-group">
        <label for="nome">Nome do cliente:</label>
        <input type="text" class="form-control" id="nome" name="nome" required>
      </div>
      <div class="form-group">
        <label for="data-nascimento">Data de nascimento:</label>
        <input type="date" class="form-control" id="data-nascimento" name="data-nascimento" required>
      </div>
      <div class="form-group">
        <label for="rg">Número do RG:</label>
        <input type="text" class="form-control" id="rg" name="rg" required>
      </div>
      <div class="form-group">
        <label for="cpf">Número do CPF:</label>
        <input type="text" class="form-control" id="cpf" name="cpf" required>
      </div>
      <div class="form-group">
        <label for="sexo">Sexo:</label>
        <select class="form-control" id="sexo" name="sexo" required>
          <option value="masculino">Masculino</option>
          <option value="feminino">Feminino</option>
        </select>
      </div>
      <div class="form-group">
        <label for="telefone">Telefone:</label>
        <input type="text" class="form-control" id="telefone" name="telefone" required>
      </div>
      <div class="form-group">
        <label for="login">Login:</label>
        <input type="text" class="form-control" id="login" name="login" required>
      </div>
      <div class="form-group">
        <label for="senha">Senha:</label>
        <input type="password" class="form-control" id="senha" name="senha" required>
      </div>
      <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>
  </div

    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
