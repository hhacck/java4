
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class server_main1 extends CoapResource{
public server_main1(String name) {
	super(name);
}

@Override
public void handleGET(CoapExchange exchange) {
	String text="Temperature: "+Math.floor((Math.random()*(45-20)+20));	
	exchange.respond(text);
	try {
		Thread.sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
