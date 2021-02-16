/* This class also uses RequestProcessor.class.
   The use of this program is that
   Whenever the program is run, it creates a directory structure and by taking 
   this directory structure and the port number(some number), the JVM allows 
   the user to invoke all the contents of that directory from a browser.
*/

/* Run the program as folloes:
   workdir> javac RequestProcessor.java

   workdir> javac JHTTP.java

   workdir> java 
   workdir> java JHTTP . 9999 welcome.html   

   Here this welcome.html must be in u r current dir
   If welcome.html is not there the JVM looks for index.html
   If index.html is not there it throws an Exception.

   Now go to a browser and type
   http://localhost:9999/welcome.html

   now you can try by taking another html(some xyz.html your directory) an dcall it as above step.

*/

import java.net.*;
import java.io.*;
import java.util.*;

public class JHTTP extends Thread {

  private File documentRootDirectory;
  private String indexFileName = "index.html";
  private ServerSocket server;
  private int numThreads = 50;
    
  public JHTTP(File documentRootDirectory, int port, 
   String indexFileName) throws IOException {
    
    if (!documentRootDirectory.isDirectory()) {
      throw new IOException(documentRootDirectory 
       + " does not exist as a directory"); 
    }
    this.documentRootDirectory = documentRootDirectory;
    this.indexFileName = indexFileName;
    this.server = new ServerSocket(port);
  }

  public JHTTP(File documentRootDirectory, int port) 
   throws IOException {
    this(documentRootDirectory, port, "index.html");
  }

  public JHTTP(File documentRootDirectory) throws IOException {
    this(documentRootDirectory, 80, "index.html");
  }

  public void run() {
  
    for (int i = 0; i < numThreads; i++) {
      Thread t = new Thread(new RequestProcessor(documentRootDirectory, indexFileName));
      t.start();   
    }
    System.out.println("Accepting connections on port " 
     + server.getLocalPort());
    System.out.println("Document Root: " + documentRootDirectory);
    while (true) {
      try {
        Socket request = server.accept();
        RequestProcessor.processRequest(request);
      }
      catch (IOException e) { 
      }   
    }
    
  }
  
  public static void main(String[] args) {

    // get the Document root
    File docroot;
    try {
      docroot = new File(args[0]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage: java JHTTP docroot port indexfile");
      return;
    }
    
    // set the port to listen on
    int port;
    try {
      port = Integer.parseInt(args[1]);
      if (port < 0 || port > 65535) port = 80;
    }  
    catch (Exception e) {
      port = 80;
    }  
    
    try {            
      JHTTP webserver = new JHTTP(docroot, port);
      webserver.start();
    }
    catch (IOException e) {
      System.out.println("Server could not start because of an " 
       + e.getClass());
      System.out.println(e);
    }
  
  }

}

