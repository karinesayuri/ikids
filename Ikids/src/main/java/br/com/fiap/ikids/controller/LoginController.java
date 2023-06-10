package br.com.fiap.ikids.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCliente")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean autenticado = true;
        
        if (autenticado) {
            response.sendRedirect("paginaSucesso.jsp");
        } else {
            response.sendRedirect("paginaErro.jsp");
        }
    }

}
