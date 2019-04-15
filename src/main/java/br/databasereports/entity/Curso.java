package br.databasereports.entity;

import lombok.Data;

@Data
public class Curso {
	
	private int codigo;
	
	private String nome;
	
	private Departamento departamento;

}
