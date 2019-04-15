package br.databasereports.entity;

import lombok.Data;

@Data
public class Faculdade {

	private int codigo;
	
	private String nome;
	
	private Universidade universidade;
}
