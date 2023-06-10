package br.com.fiap.ikids.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ikids.dao.ClienteDAO;
import br.com.fiap.ikids.dao.LoginDAO;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Login;

@WebServlet("/novoCliente")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClienteDAO clienteDao;
	private LoginDAO loginDao;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String nome = request.getParameter("nome");
		String nascimento = request.getParameter("data-nascimento");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String telefone = request.getParameter("telefone");
		String usuario = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Cliente cli = new Cliente();
		cli.setCliente(nome);
		//cli.setDataNascimento(nascimento);
		cli.setNumeroRg(rg);
		cli.setNumeroCpf(cpf);
		cli.setGenero(sexo);
		cli.setTelefone(Integer.parseInt(telefone));
		
		Login login = new Login(usuario, senha);
		
//		Cliente novoCliente = clienteDao.insert(cli);
//		loginDao.insert(login);
		
    }

}
