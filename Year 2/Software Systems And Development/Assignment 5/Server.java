package swag;

import java.io.*;
import java.net.*;

class Server {
	ServerSocket main;
	static Helper helper;
	static String name1;

	public static void login(String name) {
		helper.login(name);
	}

	public void send(String name, String message) {
		Helper.send(name, message);
	}

	public void fetch() {
		helper.fetch();
	}

	static class Reply extends Thread {
		DataOutputStream dataOut;
		Helper helper;

		public Reply(DataOutputStream out, Helper helper) {
			this.dataOut = out;
			this.helper = helper;
		}

		public void run() {
			while (true) {
				try {
				} catch (Exception e) {
					break;
				}
			}
		}
	}

	public Server(int port) throws Exception {
		this.main = new ServerSocket(port);
		this.helper = new Helper();
	}

	public void serve() throws Exception {
		while (true) {
			Socket socket = this.main.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			DataInputStream dataIn = new DataInputStream(in);
			DataOutputStream dataOut = new DataOutputStream(out);

			// handle the connection
			System.out.println("Handling connection to client");
			(new Reply(dataOut, this.helper)).start();
		}
	}

	public static void main(String[] args) throws Exception {
		int port = Integer.parseInt(args[0]);
		Server s = new Server(port);
		System.out.println("Serving....");
		s.serve();
	}
}