package br.com.alura.teste.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ikids.dao.ClienteDAO;
import br.com.fiap.ikids.dao.LoginDAO;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Login;

@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ClienteDAO clienteDao;
	private LoginDAO loginDao;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
    public void init() throws ServletException {
        clienteDao = new ClienteDAO();
        loginDao = new LoginDAO();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String nascimento = request.getParameter("data-nascimento");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String telefone = request.getParameter("telefone");
		String usuario = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		try {
			Random random = new Random();
	        int randomNumber = random.nextInt(10000) + 1;
			Cliente cli = new Cliente();
			cli.setCliente(String.valueOf(randomNumber));
			cli.setNomeCliente(nome);
			cli.setDataNascimento(new java.sql.Date(dateFormat.parse(nascimento).getTime()));
			cli.setNumeroRg(rg);
			cli.setNumeroCpf(cpf);
			cli.setGenero(sexo);
			cli.setTelefone(Integer.parseInt(telefone));
			clienteDao.insert(cli);
			
			Login login = new Login();
			login.setLogin(String.valueOf(randomNumber));
			login.setUsuario(usuario);
			login.setSenha(senha);
			
			loginDao.insert(login, cli);
		} catch (SQLException | ParseException e) {
			String mensagem = "Erro ao realizar cadastro!";
	        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	        response.getWriter().write(mensagem);
		}
		
		String mensagem = "Cadastrado com sucesso!";
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write(mensagem);
	}

}
