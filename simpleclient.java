import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class simpleclient{
	public static void main(String[] args) {
		
		try{
			String hostName = (args[0]); //sets host name to inputted address
			InetAddress echoServerIP = InetAddress.getByName(hostName);
			Socket clientSocket = new Socket(echoServerIP, Integer.parseInt(args[1])); //set the socket to the second given argument (the port)
			
			InputStreamReader in = new InputStreamReader(clientSocket.getInputStream()); //initialise the reader
			BufferedReader reader = new BufferedReader(in); //initialise the reader
			String line;
			while ((line = reader.readLine()) != null){ //Print everything in the recieved reader string
				System.out.println(line);
			}
		}
		catch(Exception e) { //error catching
			System.err.println("There has been an error");
			
		}
	}
}
