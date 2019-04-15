package br.estacio.report.tests.entity;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import br.databasereports.entity.Aluno;

public class AlunoTests {

	
	@Test
	public void testAlunoEntityClass() {
	    Aluno aluno = new Aluno();
	    
	    Aluno.AlunoEndereco ae = aluno.new AlunoEndereco();
	    
	    Aluno.AlunoEndereco ae1 = aluno.new AlunoEndereco();

	    
	    Aluno.AlunoEndereco ae2 = aluno.new AlunoEndereco();

	    Aluno.AlunoTelefone at1 = aluno.new AlunoTelefone();
	    
	    Aluno.AlunoTelefone at2 = aluno.new AlunoTelefone();
	    
	    try {
			at1.setDdd("081");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    assertEquals("081", at1.getDdd());
	    

	    aluno.setEnderecos(Arrays.asList(ae,ae1,ae2));
	    
	    assertTrue(aluno.getEnderecos().size()>0);
	    
	    aluno.setTelefones(Arrays.asList(at1,at2));
	    
	    assertTrue(aluno.getTelefones().size()>0);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
		
	}
}
