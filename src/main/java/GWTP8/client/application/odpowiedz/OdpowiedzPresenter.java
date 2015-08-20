package GWTP8.client.application.odpowiedz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTP8.client.place.NameTokens;
import GWTP8.serwer.Czlowiek;
import GWTP8.serwer.CzlowiekDao;
import GWTP8.shared.CzlowiekAction;
import GWTP8.shared.CzlowiekDto;
import GWTP8.shared.CzlowiekResult;
import GWTP8.shared.OdpowiedzZSerweraResult;
import GWTP8.shared.WyslijDoSerweraAction;

public class OdpowiedzPresenter extends Presenter<OdpowiedzPresenter.MyView, OdpowiedzPresenter.MyProxy> {
	public static final String textToServerParam = "textToServer";
	private String textToServer = "dupa dupa";

	interface MyView extends View {
		void setOdpowiedzSerevera(String serverOdpowiedz);
	}

	@NameToken(NameTokens.odpowiedz)
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<OdpowiedzPresenter> {
	}

	private final DispatchAsync dispatcher;

	@Inject
	OdpowiedzPresenter(EventBus eventBus, MyView view, MyProxy proxy, DispatchAsync dispatcher) {
		super(eventBus, view, proxy, RevealType.Root);
		this.dispatcher = dispatcher;
	}

	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		textToServer = request.getParameter(textToServerParam, null);
	}

	//PolaczenieZBaza ObiektKlasyPolaczenieZBaza = PolaczenieZBaza.getInstance();

	protected void onReset() {
		super.onReset();
//		getView().setOdpowiedzSerevera("Waiting for response...");
//		dispatcher.execute(new WyslijDoSerweraAction(textToServer), new AsyncCallback<OdpowiedzZSerweraResult>() {
//
//			@Override
//			public void onFailure(Throwable caught) {
//				getView().setOdpowiedzSerevera("An error occured: " + caught.getMessage());
//			}
//
//			@Override
//			public void onSuccess(OdpowiedzZSerweraResult result) {
//				getView().setOdpowiedzSerevera(result.getOdpowiedzZSerwera());
//
//			}
//		});
		
		
		
		
		dispatcher.execute(new CzlowiekAction(), new AsyncCallback<CzlowiekResult>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(CzlowiekResult result) {
				// TODO Auto-generated method stub
				
			}

//			@Override
//			public void onFailure(Throwable caught) {
//				getView().setOdpowiedzSerevera("An error occured: " + caught.getMessage());
//			}
//
//			@Override
//			public void onSuccess(CzlowiekResult result) {
//				getView().setOdpowiedzSerevera(result.getOdpowiedzZSerwera());
//
//			}
		});
	}
}
