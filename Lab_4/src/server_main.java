import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class server_main extends CoapResource{
public server_main(String name) {
	super(name);
}

@Override
public void handleGET(CoapExchange exchange) {
	String text="Humidity : "+Math.floor((Math.random()*(45-20)+20));
	
	exchange.respond(text);
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
public static void main(String[] args) {
	CoapServer server=new CoapServer();
	server.add(new server_main("Humidity"));
	server.add(new server_main1("Temperature"));
	server.start();
}
}
