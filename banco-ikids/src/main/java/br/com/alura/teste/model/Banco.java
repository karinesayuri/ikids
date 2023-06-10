package br.com.alura.teste.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(1);
		empresa1.setNome("Julio");
		
		Empresa empresa2 = new Empresa();
		empresa1.setId(2);
		empresa1.setNome("Fernando");
		
		lista.add(empresa1);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresa() {
		return Banco.lista;

	}
	
}
