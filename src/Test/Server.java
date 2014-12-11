package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


	public static void main(String[] args) {
		Thread b = new threads();
		b.start();
	}
}

class threads extends Thread {

	public void run() {
		try{
		ServerSocket a= new ServerSocket(5000);
		while(true){
		Socket b=a.accept();
		DataInputStream c = new DataInputStream(b.getInputStream());
		System.out.println(c.readUTF());
		DataOutputStream d = new DataOutputStream(b.getOutputStream());
		d.writeUTF("∏€√ª¿Ã.");
		a.close();
		break;
		}
		}catch(Exception e){
			return;
		}
	}
}