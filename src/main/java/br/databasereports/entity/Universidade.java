package br.databasereports.entity;

import java.util.List;

import lombok.Data;

@Data
public class Universidade {

	private int codigo;
	
	private String nome;
	
	private List<Faculdade> faculdades;
	
	
}
