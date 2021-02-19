package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfiguration {
	public static void main(String[] args) {

		ResourceBundle props = ResourceBundle.getBundle("database");
		
		Enumeration<String> keys = props.getKeys();
		while( keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key);
			String valeur = props.getString(key);
			System.out.println(valeur);
		}

	}
}
