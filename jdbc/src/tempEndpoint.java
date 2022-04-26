/*import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/hello")
public class tempEndpoint {
	public tempEndpoint() {
		System.out.printf("class loaded " + this.getClass());
	}

	@OnOpen
	public void onOpen(Session session) {
		System.out.printf("Session opened, id: %s%n", session.getId());
		try {
			session.getBasicRemote().sendText("Hi there, we are successfully connected");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@OnMessage
	public void OnMessage(String message, Session session) {
		System.out.printf("Message received. Session id: %s Message: %s%n", session.getId(), message);
		try {
			session.getBasicRemote().sendText(String.format("We received your message: %s%n", message));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
	}

	@OnClose
	public void onClose(Session session) {
		System.out.printf("Session closed with id: %s%n", session.getId());
	}

}*/