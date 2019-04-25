package br.databasereports.db.connection;

public enum DatabaseSystem {

	POSTGRES("Postgres"), MYSQL("MySQL"), H2("H2");
 
	private final String databaseName;
	
	DatabaseSystem(String databaseName) {

      this.databaseName = databaseName;
	}

	public String getDatabaseName() {
		return databaseName;
	}
	
	
}


