import java.net.*;

class Server
{
	public static void main(String args[])
	{
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server started successfully...");
			System.out.println("Listening to port no 5000");
			Socket socket = serverSocket.accept();
		} catch(Exception e) {
			System.out.println(e);
		}	
	}
}