package br.databasereports.db.connection;

import java.sql.Connection;

public interface DatabaseConnection {

	Connection connect();
	void open();
	void close();
	
}
