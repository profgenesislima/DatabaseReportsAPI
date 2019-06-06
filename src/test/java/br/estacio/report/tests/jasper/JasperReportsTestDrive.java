package br.estacio.report.tests.jasper;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import br.databasereports.db.connection.PostgresConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class JasperReportsTestDrive {

	public static void main(String[] args) throws JRException {

		String report = "departamento_has_professor";
		
		JasperReport rep = JasperCompileManager.compileReport(report+".jrxml");
		
		System.out.println("JASPER REPORT "+rep.getName());
	 
	    Map<String, Object> params = new HashMap<String, Object>();

	    PostgresConnection con  = (PostgresConnection) PostgresConnection.getInstance();
		
	    //JasperFillManager.fillReportToFile(report+".jasper", params);

		JasperPrint jasperPrint = JasperFillManager.fillReport(rep,
				params, con.connect());
		
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				report+".pdf");

	}

}
