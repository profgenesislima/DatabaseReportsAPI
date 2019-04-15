package br.estacio.report;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import br.databasereports.db.connection.PostgresConnection;

public class DatabaseTests {

	
	@Test
	public void testPostgreSQLConnection() {
		PostgresConnection con = new PostgresConnection();
		assertNotNull(con.connect());
	}
}
