import java.io.IOException;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



import org.springframework.boot.SpringApplication;

import Thread.ChatServer;

public class jdbc {
	public static void main(String[] args) {
		SpringApplication.run(jdbc.class, args);
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3307/chatserver";
		String username = "root";
		String password = "root";

		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "Insert into user(username) values('aryan')";
			Statement statement = connection.createStatement();
			statement.execute(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("DATABASE CONNECTED");
		ChatServer start = new ChatServer();

	}

}

