import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class simpleserver{
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(0);
			System.out.println(ss.getLocalPort());
			while(true) {
				Socket client = ss.accept(); // Blocking
				System.out.println("Obtained connection");
				InetAddress clientName = client.getLocalAddress();
				String hostName = clientName.getHostName();
				String hostAddress = clientName.getHostAddress();
				System.out.println(hostAddress + "\n" + hostName);
				
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				writer.write("Hello, " + hostName + ".\nYour IP address is " + hostAddress);
				writer.flush();
				client.close();
			}
		}
		catch(Exception e) {
			System.err.println("There has been an error");
			
		}

	}
}
