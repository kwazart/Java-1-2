package lesson_06;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ConsoleServer {
	public static void main(String[] args) {
		ServerSocket server = null; // наша сторона
		Socket socket = null; // удаленная (remote) сторона

		try {
			server = new ServerSocket(6000);
			System.out.println("Server started");

			socket = server.accept();
			System.out.printf("Client [%s] connected\n", socket.getInetAddress());

			Scanner scanner = new Scanner(socket.getInputStream()); // in
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // out

			while (true) {
				String str = scanner.nextLine();
				if ("/end".equals(str)) {
					break;
				}
				System.out.printf("Client [%s] - %s\n", socket.getInetAddress(), str);

				out.println("echo - " + str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
