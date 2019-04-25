package br.estacio.report;





import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.databasereports.db.connection.AbstractConnectionFactory;
import br.databasereports.db.connection.DatabaseSystem;
import br.databasereports.db.connection.PostgresConnection;
import br.databasereports.db.connection.RelationalDatabaseFactory;



public class DatabaseTests {

	
	@Test
	public void testPostgreSQLConnection() {
		PostgresConnection con = (PostgresConnection) PostgresConnection.getInstance();
		assertNotNull(con);
	}
	
	public void testPostgresDatabaseAbstractFactory() {
		RelationalDatabaseFactory rdf = new RelationalDatabaseFactory();
		  
		  assertNotNull(rdf);
		  assertNotNull(rdf.getConnection(DatabaseSystem.POSTGRES));
		
	}
}
