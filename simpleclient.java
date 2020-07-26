import java.net.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class simpleclient{
	public static void main(String[] args) {
		
		try{
			String hostName = (args[0]); //sets host name to inputted address
			InetAddress echoServerIP = InetAddress.getByName(hostName);
			Socket clientSocket = new Socket(echoServerIP, Integer.parseInt(args[1]));
			
			InputStreamReader in = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader reader = new BufferedReader(in);
			String line;
			while ((line = reader.readLine()) != null){
				System.out.println(line);
			}
		}
		catch(Exception e) {
			System.err.println("There has been an error");
			
		}
	}
}
