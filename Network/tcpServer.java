 //tcpServer.java
//usage:java tcpServer<port number>
import java.net.*;
import java.io.*;
public class tcpServer
{
public static void main(String[] args)
	{
	int port;
	ServerSocket server_socket;
	try{
	port=Integer.parseInt(args[0]);
		}catch(Exception e){System.out.println("Default Port=10000");
		port=10000;
	}
	try{
	server_socket=new ServerSocket(port);
	System.out.println("Server Waiting for Client on Port "+server_socket.getLocalPort());
	while(true){
	Socket socket=server_socket.accept();
	System.out.println("New Connection Accepted"+socket.getInetAddress()+":"+socket.getPort());
	ServerThread st=new ServerThread(socket);
	st.start();
	}
	}catch(Exception e){System.out.println("Connection Reset");}
	}
}//class ends
class ServerThread extends Thread
{
Socket s;
public ServerThread(Socket s)
	{
		this.s=s;	
	}
public void run()
	{
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	while(true)
		{
		String msg=br.readLine();
		if(msg==null) break;
		System.out.println("Message from :"+s.getPort()+" "+msg);
		}
	}catch(Exception e){}
	}
}