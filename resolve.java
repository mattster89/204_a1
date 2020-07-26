import java.net.*;
import java.io.*;

public class resolve{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>");
		return;
		}
		for(String hostName:args){
		
		
		
		try {
			InetAddress IP = InetAddress.getByName(hostName);
			System.out.println(hostName + " : " + IP.getHostAddress());
		}
		catch(UnknownHostException e) {
			System.err.println(hostName + " : unknown host");
		}
		}
		
	}
}



