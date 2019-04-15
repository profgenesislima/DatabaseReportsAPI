package br.databasereports.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class PostgresConnection implements DatabaseConnection {
	private Connection con ;
	@Override
	@Bean
	public Connection connect() {
		try {
			if(con == null || !con.isClosed()) {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432"
					+ "/uni_estacio", "postgres", "postgres");
			}
			} catch (ClassNotFoundException | SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
