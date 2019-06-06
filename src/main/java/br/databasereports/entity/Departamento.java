package br.databasereports.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Departamento {
	
	
	private int codigo;
	
	private String nome;
	
	private Faculdade faculdade;
	


}
