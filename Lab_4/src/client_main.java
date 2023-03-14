import java.io.*;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class client_main {

public static void main(String[] args) {
	CoapClient client1=new CoapClient("coap://localhost/Humidity");
	CoapClient client2=new CoapClient("coap://localhost/Temperature");

	try {
		for(int i=0;i<10;i++) {
			String text=client1.get().getResponseText();
			System.out.println(text);
			String temp=client2.get().getResponseText();
			System.out.println(temp);
		}
	}catch(ConnectorException e2) {
			e2.printStackTrace();
		}
		catch(IOException e2) {
			e2.printStackTrace();
		}
		System.out.println("Client Ended");
	}
}