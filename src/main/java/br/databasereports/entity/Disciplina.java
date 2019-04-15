package br.databasereports.entity;

import lombok.Data;

@Data
public class Disciplina {

	private int codigo;
	
	private String nome;
	
	private String descricao;
	
	private int cargaHoraria;
	
	private Departamento departamento;
}
