package Thread;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientThread {
	private static ExecutorService pool = Executors.newFixedThreadPool(4);

	public ClientThread(Socket sOCKS) {
	Thread t1 = new Thread(() -> {
		try {
			ClientThreadHandler clientThreadHandler = new ClientThreadHandler(sOCKS);
			pool.execute((Runnable) clientThreadHandler);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
			try { Thread.sleep(1000); } catch(Exception e){}
	});
	
	t1.start();
	try { Thread. sleep(10); } catch(Exception e) {}
	}

}
