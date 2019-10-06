import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])
	{
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server started successfully...");
			System.out.println("Listening to port no 5000");
			Socket socket = serverSocket.accept();
			System.out.println("Client connected successfully...");
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			while(true) {
				String message = (String) inputStream.readUTF();				
				if(message.equalsIgnoreCase("exit")) {
					break;
				}

				System.out.println("Client says : " + message);	
			}
			serverSocket.close();
		} catch(Exception e) {
			System.out.println(e);
		}	
	}
}