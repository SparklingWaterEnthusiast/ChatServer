package Thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import entity.entityController;

public class ClientThreadHandler implements Runnable
{
	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	
	public ClientThreadHandler(Socket clientSocket) throws IOException{
		this.client = clientSocket;
		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream());
	}
	public void run() {
		try { 
			String str = null;
			while (true) {
				int request = in.read();
						str = Character.toString((char) request);
					System.out.println(str);
	        }	
		}catch (IOException e) {
			System.err.println("IO exception in client handler");
			System.err.println(e.getStackTrace()); 
		} finally {
			out.close();
			try {
				in.close(); 
			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	}
}


