package br.databasereports.application.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.databasereports.db.connection.PostgresConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Controller
public class HomeController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String index() {	
		System.out.println("INDEX ON CONTROLLER");

	   return "index";
	}
	
	
	 @RequestMapping(value = "/report/{nome_relatorio}", method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_PDF_VALUE)
	    public ResponseEntity<InputStreamResource> generateAndDeliverReport() throws IOException, JRException {

	        

		  String report = "departamento_has_professor";
			
			JasperReport rep = JasperCompileManager.compileReport(report+".jrxml");
			
			System.out.println("JASPER REPORT "+rep.getName());
		 
		    Map<String, Object> params = new HashMap<String, Object>();

		    PostgresConnection con  = new PostgresConnection();
			
		    

			JasperPrint jasperPrint = JasperFillManager.fillReport(rep,
					params, con.connect());
			
			JasperExportManager.exportReportToPdfFile(jasperPrint,
					report+".pdf");

			

	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Disposition", "inline; filename="+report+".pdf");

	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(new InputStreamResource(new FileInputStream(report+".pdf")));
	    }
}
