package br.databasereports.db.connection;

public class RelationalDatabaseFactory extends AbstractConnectionFactory {

	@Override
	public DatabaseConnection getConnection(DatabaseSystem databaseSystem) {
		
		if(databaseSystem.equals(DatabaseSystem.POSTGRES)) {
			return PostgresConnection.getInstance();
		}else if(databaseSystem.equals(DatabaseSystem.MYSQL)) {
			try {
				throw new Exception("Mysql Database Not Supported Yet!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(databaseSystem.equals(DatabaseSystem.H2)) {
			try {
				throw new Exception("H2 Database Not Supported Yet!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}

}
