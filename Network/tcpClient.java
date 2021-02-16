
// tcpClient.java
// Very simple client that just sends number to the server and reads result that the server sends.

import java.net.*;
import java.io.*;
public class tcpClient 
{
	public static void main(String[] args)throws IOException 
	{
		// Passing null to getByName() produces the special "Local Loopback" IP address,
		// for testing on one machine w/o a network:
		InetAddress addr = InetAddress.getByName(null);
		
		// Alternatively, you can use the address or name:
		// InetAddress addr = InetAddress.getByName("127.0.0.1");
		// InetAddress addr = InetAddress.getByName("localhost");
		System.out.println("addr = " + addr);
		Socket socket = new Socket(addr, 10000);
		
		// Guard everything in a try-finally to make
		// sure that the socket is closed:
		try
		{
			System.out.println("socket = " + socket);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader in = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// Output is automatically flushed by PrintWriter:
			PrintWriter out =
				new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);

			while(true){
			System.out.print("Enter Some String: ");
			//int num=Integer.parseInt(br.readLine()); // Reading from KeyBoard
			String str=br.readLine();
			out.println(str);}
			//int addnum = Integer.parseInt(in.readLine()); // Reading from Server
		//	System.out.println("Result from Server: "+addnum);
		}catch(Exception e){e.printStackTrace();}
	
	
	}
} 