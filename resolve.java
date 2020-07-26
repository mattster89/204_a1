import java.net.*;
import java.io.*;

public class resolve{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>"); //print example of how to format input if no websites are given
		return;
		}
		for(String hostName:args){ //for every argument given
		try {
			InetAddress IP = InetAddress.getByName(hostName); //returns the ip address of the requested website
			System.out.println(hostName + " : " + IP.getHostAddress()); //prints the website followed by its ip
		}
		catch(UnknownHostException e) {
			System.err.println(hostName + " : unknown host"); //says unknown host if an invalid website is given
		}
		}
		
	}
}



