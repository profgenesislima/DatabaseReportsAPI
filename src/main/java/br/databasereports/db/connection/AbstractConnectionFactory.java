package br.databasereports.db.connection;

public abstract class AbstractConnectionFactory {

	abstract DatabaseConnection getConnection(DatabaseSystem databaseSystem);
	
}
