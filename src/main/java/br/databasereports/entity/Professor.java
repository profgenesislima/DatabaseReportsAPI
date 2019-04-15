package br.databasereports.entity;

import lombok.Data;

@Data
public class Professor {

	private int codigo;
	
	private String nome;
	
	private Faculdade faculdade;
	
	
}
