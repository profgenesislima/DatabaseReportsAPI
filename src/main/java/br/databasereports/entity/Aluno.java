package br.databasereports.entity;

import java.util.List;
import java.util.regex.Pattern;

import lombok.Data;

@Data
public class Aluno {

	private int codigo;
	
	private String nome;
	
	private Curso curso;
	
	private List<AlunoEndereco> enderecos;
	
	private List<AlunoTelefone> telefones;
	
	
	 public class AlunoEndereco{
		
		private int codigoAluno;
		
		private String logradouro;
		
		private String cidade;
		
		private String cep;
		
		private int numero;
		
		

		public int getCodigoAluno() {
			return codigoAluno;
		}

		public void setCodigoAluno(int codigoAluno) {
			this.codigoAluno = codigoAluno;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		
		private String cepValidator(String value) throws Exception {

			String valid = null;
			
	        //Pattern p = ;
	        //Matcher m2 = p.matcher();

	        if (Pattern.compile("\\d{5}[-]\\d{2}").matcher(valid).find()){
	            valid = value;
	        }else {
	            System.out.println("ERROR: cep inválido! ON Class "+this.toString());
	        	throw new Exception("cep inválido!");
	        }

	        return valid;
		}
		
	}
	
	
	public class AlunoTelefone{
		
		private String ddd;
		
		private String numero;
		
		private String codigoAluno;

		public String getDdd() {			
			return ddd;
		}

		public void setDdd(String ddd) throws Exception {			
			this.ddd = this.filterAttributeSize(ddd, 3);							
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) throws Exception {
			this.numero = this.filterAttributeSize(numero, 12);			
		}

		public String getCodigoAluno() {
			return codigoAluno;
		}

		public void setCodigoAluno(String codigoAluno) {
			this.codigoAluno = codigoAluno;
		}
		
	private String filterAttributeSize(String value, int length) throws Exception {
		
		if(value.length() == length) {
			return value;
		}else {
			throw new Exception("The length of value does not match. Given value "+value+" and length "+length);
		}
		
	}
		
	}
	
	
	
}
