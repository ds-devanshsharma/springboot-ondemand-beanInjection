package com.coditas.socket.socket_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	public static void main(String[] args) throws JSONException {
//		URI uri = URI.create("https://example.com");
//		IO.Options options = IO.Options.builder()
//				// IO factory options
//				.setForceNew(false)
//				.setMultiplex(true)
//
//				// low-level engine options
//				.setTransports(new String[] { Polling.NAME, WebSocket.NAME })
//				.setUpgrade(true)
//				.setRememberUpgrade(false)
//				.setPath("/socket.io/")
//				.setQuery(null)
//				.setExtraHeaders(null)
//
//				// Manager options
//				.setReconnection(true)
//				.setReconnectionAttempts(Integer.MAX_VALUE)
//				.setReconnectionDelay(1_000)
//				.setReconnectionDelayMax(5_000)
//				.setRandomizationFactor(0.5)
//				.setTimeout(20_000)
//
//				// Socket options
//				.setAuth(null)
//				.build();
//		Socket socket = IO.socket(uri , options);
//
//
//		socket.emit("EVENT-I", 1, "devansh-coditas");
//
//
//		socket.on("EVENT-I", objects -> System.out.println(objects));
//
//
//	}

}
