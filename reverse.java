import java.net.*;
import java.io.*;

public class reverse{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>");
		return;
		}
		for(String hostAddress:args){
		
		
		
		try {
			InetAddress IP = InetAddress.getByName(hostAddress);
			if (hostAddress.equals(IP.getHostName())){
				System.out.println(hostAddress + " : " + "Host address does not have a name");			
				}
			else{
				
			System.out.println(hostAddress + " : " + IP.getHostName());
			}
		}
		catch(UnknownHostException e) {
			System.err.println(hostAddress + " : unknown host address");
		}
		}
		
	}
}

