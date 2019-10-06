import java.net.*;
import java.io.*;
import java.util.*;

class Client
{
	public static void main(String args[])
	{
		try {
			Socket socket = new Socket("localhost", 5000);
			System.out.println("Connected to server successfully...");
			System.out.println("You can now send messages to the server");
			System.out.print("Enter your messages below :- ");
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			Scanner in = new Scanner(System.in);
			while(true) {			
				String message = in.nextLine();
				outputStream.writeUTF(message);

				if(message.equalsIgnoreCase("exit")) {
					break;
				}
			}
			socket.close();
		} catch(Exception e) {
			System.out.println(e);
		}	
	}
}