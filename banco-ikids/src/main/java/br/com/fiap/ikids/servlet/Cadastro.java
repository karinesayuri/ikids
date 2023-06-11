package br.com.fiap.ikids.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ikids.dao.ClienteDAO;
import br.com.fiap.ikids.dao.ContaDAO;
import br.com.fiap.ikids.dao.LoginDAO;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Conta;
import br.com.fiap.ikids.model.Login;

@WebServlet("/Cadastro")
public class Cadastro extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ClienteDAO clienteDao;
	private LoginDAO loginDao;
	private ContaDAO contaDao;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
    public void init() throws ServletException {
        clienteDao = new ClienteDAO();
        loginDao = new LoginDAO();
        contaDao = new ContaDAO();
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
		
		String mensagem;
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
			login.setLogin(usuario);
			login.setUsuario(String.valueOf(randomNumber));
			login.setSenha(senha);
			loginDao.insert(login, cli);
			
			Conta conta = new Conta();
			conta.setDataAbertura(new Date());
			conta.setIdConta(String.valueOf(randomNumber));
			conta.setNumeroAgencia(String.valueOf(randomNumber));
			conta.setNumeroConta(String.valueOf(randomNumber));
			conta.setValorSaldo(0.0);
			
			contaDao.insert(conta, cli);
			
			
		} catch (SQLException | ParseException e) {
			mensagem = "Erro ao realizar cadastro!";
			request.setAttribute("mensagem", mensagem);
		}
		
		mensagem = "Cadastrado com sucesso!";
        request.setAttribute("mensagem", mensagem);
        RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.jsp");
        dispatcher.forward(request, response);
	}

}
