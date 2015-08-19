package GWTP8.server.guice;

import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;

import GWTP8.serwer.WyslijDoSerweraHandler;
import GWTP8.shared.WyslijDoSerweraAction;

public class ServerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {
    	 bindHandler(WyslijDoSerweraAction.class, WyslijDoSerweraHandler.class);
    }
}
