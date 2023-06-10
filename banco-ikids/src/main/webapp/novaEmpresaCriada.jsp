<%
	String nomeEmpresa = request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<html>
	<body>
		Oi <% out.println(nomeEmpresa); %>
	</body>
</html>