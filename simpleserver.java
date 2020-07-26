import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class simpleserver{
	public static void main(String[] args) {
		try{
			ServerSocket ss = new ServerSocket(0); //set the port to the first available
			System.out.println(ss.getLocalPort()); //print the port so it can be put into the client arguments
			while(true) {
				Socket client = ss.accept(); // Blocking
				System.out.println("Obtained connection"); //display when a connection has been made
				InetAddress clientName = client.getLocalAddress(); //get the ip of the connecting client
				String hostName = clientName.getHostName(); //set string for printing
				String hostAddress = clientName.getHostAddress(); //set string for printing
				System.out.println(hostAddress + "\n" + hostName); //print to the client
				
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream())); //set up writer
				writer.write("Hello, " + hostName + ".\nYour IP address is " + hostAddress); //write to client
				writer.flush();
				client.close();
			}
		}
		catch(Exception e) { //error catching
			System.err.println("There has been an error");
			
		}

	}
}
