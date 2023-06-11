package br.com.fiap.ikids.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ikids.dao.ClienteDAO;
import br.com.fiap.ikids.dao.InvestimentoDAO;
import br.com.fiap.ikids.dao.LoginDAO;
import br.com.fiap.ikids.model.Investimento;
import br.com.fiap.ikids.model.Login;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private LoginDAO dao;
	private InvestimentoDAO investimentoDao;
	
	@Override
    public void init() throws ServletException {
        dao = new LoginDAO();
        investimentoDao = new InvestimentoDAO();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginUsuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Login loginEncontrado = dao.logar(loginUsuario, senha);
		
		if(loginEncontrado != null) {

			List<Investimento> investimentos = investimentoDao.listaPorIdCliente(loginEncontrado.getCliente().getCliente());
			loginEncontrado.setInvestimento(investimentos);
			
			request.setAttribute("loginEncontrado", loginEncontrado);
			RequestDispatcher dispatcher = request.getRequestDispatcher("perfil.jsp");
	        dispatcher.forward(request, response);
		}
		else {
			String mensagem = "Usuário ou senha invalido!";
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	        dispatcher.forward(request, response);
		}
	}

}
