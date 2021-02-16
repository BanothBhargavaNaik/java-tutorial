//EchoClient is an HTTP server which uses HTTP protocol

import java.net.*;
import java.io.*;

public class EchoServer
{
	static final int serverPort=1026;
	static final int packetSize=1024;
	public static void main(String[] args) throws SocketException
	{
		DatagramPacket packet;
		DatagramSocket socket;
		byte[] data;
		int clientPort;
		InetAddress address;
        String str;
		socket=new DatagramSocket(serverPort);
		for (; ; )
		{
			data=new byte[packetSize];
			packet=new DatagramPacket(data,packetSize);
            System.out.println("waiting to receive the packets");
			try{
				socket.receive(packet);
			   }catch(IOException ie){
				   System.out.println("couldnot receive:"+ie.getMessage());
				   System.exit(0);
			   }
			   address=packet.getAddress();
			   clientPort=packet.getPort();
			   str=new String(data,0,packet.getLength());
			   System.out.println("Message:"+str.trim());
			   System.out.println("From:"+address);
			   packet=new DatagramPacket(data,packetSize,address,clientPort);
			   try{
				   socket.send(packet);
			   }catch(IOException ex){
				   System.out.println("could not send:"+ex.getMessage());
				   System.exit(0);
				   	}

		}	
}
}





