package br.databasereports.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class PostgresConnection implements DatabaseConnection {
	
	private static DatabaseConnection instance = new PostgresConnection();
	
	
	private Connection con;
	
	
	private PostgresConnection() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Bean
	public synchronized Connection connect() {
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

	
	public static DatabaseConnection getInstance() {
		return instance;
	}

	@Override
	public boolean isClosed() {
		  boolean isClosed = false;
		try {
			   isClosed = con.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isClosed;
	}

}
