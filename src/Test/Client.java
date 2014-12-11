package Test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args){
		
		try{

	
		Socket b=new Socket("200.1.4.211",60000);
		DataOutputStream d = new DataOutputStream(b.getOutputStream());
		d.writeUTF("±ËªÛ«ˆ πŸ∫∏ ∏€√ª¿Ã.");
		DataInputStream c = new DataInputStream(b.getInputStream());
		System.out.println(c.readUTF());
		
		}catch(Exception e){}
		
		
	}
}
