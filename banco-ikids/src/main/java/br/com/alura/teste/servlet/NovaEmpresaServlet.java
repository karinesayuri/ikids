package br.com.alura.teste.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.teste.model.Banco;
import br.com.alura.teste.model.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	// poderia ser doPost pra aceitar somente post
//	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//		
//		/*testar essa url http://localhost:8080/teste/novaEmpresa?nome=Julio*/
//		
//		String nomeEmpresa = request.getParameter("nome");
//		
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("Oi "+nomeEmpresa);
//		out.println("</body>");
//		out.println("<html>");
//		out.println("</html>");
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		/*testar essa url http://localhost:8080/teste/novaEmpresa?nome=Julio*/
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setId(null);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, resp);
	}

}
