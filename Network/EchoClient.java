//EchoClient is an HTTP client which uses HTTP protocol

import java.net.*;
import java.io.*;

public class EchoClient 
{
	static final int serverPort=15555;
	static final int packetSize=1024;
	public static void main(String[] args) throws UnknownHostException,SocketException 
	{
      DatagramSocket socket;
	  DatagramPacket packet;
	  InetAddress address;
	  String messageSend;
	  String messageReturn;byte[] data;
	  if(args.length!=2){
		  System.out.println("Usage Error:Java EchoClient<Servername><Message>");
		  System.exit(0);
	  }
	  address=InetAddress.getByName(args[0]);
	  socket= new DatagramSocket();
	  data=new byte[packetSize];
	  messageSend=new String(args[1]);
	  messageSend.getBytes(0,messageSend.length(),data,0);
	  packet=new DatagramPacket(data,data.length,address,serverPort);
	  System.out.println("Trying to Send the packet");
	  try{
		  socket.send(packet);
	   }catch(IOException ie){
		   System.out.println("Could not send :"+ie.getMessage());
		   System.exit(0);
	   }
	   packet=new DatagramPacket(data,data.length);
	   try{
		   socket.receive(packet);
	   }catch(IOException e){
		   System.out.println("Could not receive:"+e.getMessage());
		   System.exit(0);
	   }
	   messageReturn=new String(packet.getData(),0);
	   System.out.println("Message Returned:"+messageReturn.trim());

	}
}
