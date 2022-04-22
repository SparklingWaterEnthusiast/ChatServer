package Thread;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;





public class ChatServer {
	ServerSocket serverSocket;
	private static ArrayList<ClientThread> clients = new ArrayList<>();

	public ChatServer() { 
		try {
			serverSocket = new ServerSocket(8080); 
			System.out.println("Waiting for clients..."); 
			while (true) {
				Socket SOCKS = serverSocket.accept(); 
				ClientThread clientThread = new ClientThread(SOCKS);
				clients.add(clientThread);
			}
		}catch(Exception e){
		}
	}
}
