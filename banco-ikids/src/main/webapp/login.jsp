<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ikids</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<style>
    body {
      display: flex;
      align-items: center;
      justify-content: center;
      height: 100vh;
      background-color: #8A05BE;
      color: black;
    }

    .login-form {
      max-width: 400px; /* Aumentamos a largura máxima para 400px */
      background-color: #8A05BE;
      padding: 30px; /* Aumentamos o espaçamento interno para 30px */
      border-radius: 5px;
    }

    .login-form h2 {
      text-align: center;
      margin-bottom: 20px;
      font-weight: bold;
      color: black;
      font-size: 28px;
    }

    .login-form .form-group label {
      color: white;
    }

    .login-form .form-control {
      color: black;
    }

    .login-form .btn-primary {
      background-color: black;
      border-color: black;
    }
  </style>
</head>
<body>
    <div class="login-form">
    <h2 style="font-size: 75px;">Ikids</h2>
    <form action="processa-login.php" method="POST">
      <div class="form-group">
        <label for="usuario">Usuário:</label>
        <input type="text" class="form-control form-control-lg" id="usuario" name="usuario" required>
      </div>

      <div class="form-group">
        <label for="senha">Senha:</label>
        <input type="password" class="form-control form-control-lg" id="senha" name="senha" required>
      </div>

      <button type="submit" class="btn btn-primary btn-block" style="margin-top:10px">Entrar</button>
    </form>
  </div>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
