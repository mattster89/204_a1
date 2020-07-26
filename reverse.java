import java.net.*;
import java.io.*;

public class reverse{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>"); //print example of how to format input if no websites are given
		return;
		}
		for(String hostAddress:args){ //for every argument given
		try {
			InetAddress IP = InetAddress.getByName(hostAddress); //returns the host name of the provided ip address
			if (hostAddress.equals(IP.getHostName())){
				System.out.println(hostAddress + " : " + "Host address does not have a name"); //prints out that the given ip's host address doesnt have a name	
				}
			else{
			System.out.println(hostAddress + " : " + IP.getHostName()); //prints the host address then the host name
			}
		}
		catch(UnknownHostException e) {
			System.err.println(hostAddress + " : unknown host address"); //says unknown host if an invalid website is given
		}
		}
		
	}
}

