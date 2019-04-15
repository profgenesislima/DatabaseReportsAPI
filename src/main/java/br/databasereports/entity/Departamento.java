package br.databasereports.entity;

import lombok.Data;

@Data
public class Departamento {
	
	
	private int codigo;
	
	private String nome;
	
	private Faculdade faculdade;
	


}
