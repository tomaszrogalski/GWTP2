package GWTP8.serwer;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.google.inject.Provider;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

import GWTP8.shared.OdpowiedzZSerweraResult;
import GWTP8.shared.WyslijDoSerweraAction;

public class WyslijDoSerweraHandler implements ActionHandler<WyslijDoSerweraAction, OdpowiedzZSerweraResult> {
//	private Provider<HttpServletRequest> requestProvider;
//	private ServletContext servletContext;

//	@Inject
//	WyslijDoSerweraHandler(ServletContext servletContext, Provider<HttpServletRequest> requestProvider) {
//		this.servletContext = servletContext;
//		this.requestProvider = requestProvider;
//	}

	// co robi execute i czy musze tu miec @overida?
	public OdpowiedzZSerweraResult execute(WyslijDoSerweraAction action, ExecutionContext context)
			throws ActionException {

		String wyjscie = action.getTextKtoryWyslemyDoSerwera();
//		String serverInfo = servletContext.getServerInfo();
//		String userAgent = requestProvider.get().getHeader("User-Agent");
		// stworze sobie obiekt i tu go rozwale na drobne
		return new OdpowiedzZSerweraResult("Hello, " +wyjscie);

	}

	@Override
	public Class<WyslijDoSerweraAction> getActionType() {
		return WyslijDoSerweraAction.class;
	}

	@Override
	public void undo(WyslijDoSerweraAction action, OdpowiedzZSerweraResult result, ExecutionContext context)
			throws ActionException {
	}

}
