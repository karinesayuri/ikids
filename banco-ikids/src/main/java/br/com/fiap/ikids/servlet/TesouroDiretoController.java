package br.com.fiap.ikids.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.ikids.dao.InvestimentoDAO;
import br.com.fiap.ikids.model.Cliente;
import br.com.fiap.ikids.model.Investimento;

@WebServlet("/TesouroDireto")
public class TesouroDiretoController extends HttpServlet {
	
	private InvestimentoDAO dao;
	
	private static final long serialVersionUID = 1L;
	
	@Override
    public void init() throws ServletException {
        dao = new InvestimentoDAO();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valorInvestimento = request.getParameter("vl_invest");
		String idCliente = request.getParameter("idCliente");
		String mensagem;
		
		Random random = new Random();
        int randomNumber = random.nextInt(10000) + 1;
		
		Investimento investimento = new Investimento();
		investimento.setIdInvestimento(String.valueOf(randomNumber));
		investimento.setTipoInvestimento("Tesouro Direto");
		investimento.setTaxaInvestimento(new BigDecimal(2.5));
		investimento.setCliente(new Cliente());
		investimento.getCliente().setCliente(idCliente);
		
		try {
			dao.insert(investimento);
		} catch (SQLException e) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("investimento.jsp");
	        dispatcher.forward(request, response);
	        mensagem = "Erro ao realizar cadastro";
	        request.setAttribute("mensagem", mensagem);
		}
		
		mensagem = "Cadastrado com sucesso!";
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("investimento.jsp");
        dispatcher.forward(request, response);
	}

}
