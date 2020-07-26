import java.net.*;
import java.io.*;

public class resolveall{
	public static void main(String[] args) {
		if(args.length == 0){
		System.out.println("Usage: Resolve <name1><name2>...<nameN>");
		return;
		}
		for(String hostName:args){
		
		
		
		try {
			InetAddress[] array = InetAddress.getAllByName(hostName);
			for(InetAddress IP:array){
				System.out.println(hostName + " : " + IP.getHostAddress());
			}
		}
		catch(UnknownHostException e) {
			System.err.println(hostName + " : unknown host");
		}
		}
		
	}
}

