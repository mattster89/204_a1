import java.net.*;
import java.io.*;

public class resolveall{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>"); //print example of how to format input if no websites are given
		return;
		}
		for(String hostName:args){ //for every argument given
		try {
			InetAddress[] array = InetAddress.getAllByName(hostName); //creates an array of all ip addresses fro the host name
			for(InetAddress IP:array){ //for every ip adress in the array
				System.out.println(hostName + " : " + IP.getHostAddress()); //prints every ip address linked to the host name in the array
			}
		}
		catch(UnknownHostException e) {
			System.err.println(hostName + " : unknown host"); //says unknown host if an invalid website is given
		}
		}
		
	}
}

