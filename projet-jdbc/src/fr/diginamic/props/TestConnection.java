package fr.diginamic.props;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TestConnection {

	public static void main(String[] args) {

	ResourceBundle fichierConfig = ResourceBundle.getBundle("database");
	String url = fichierConfig.getString("database.url");
	String user = fichierConfig.getString("database.user");
	String password = fichierConfig.getString("database.passeword");
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Impossible de charger le Driver MySQL");
		}
		
		// etape 2 : DriveManager doit me fournir une connexion
		try {
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println(connection.isClosed());
		} catch (SQLException e) {
			System.out.println("Impossible de se connecter à la base de données" + e.getMessage());

		}

	}
}
