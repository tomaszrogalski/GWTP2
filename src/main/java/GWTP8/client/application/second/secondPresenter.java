package GWTP8.client.application.second;

import javax.inject.Provider;

import org.omg.CORBA.portable.IndirectionException;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.IndirectProvider;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;

import GWTP8.client.application.header.headerPresenter;
import GWTP8.client.application.ratepage.RatePagePresenter;
import GWTP8.client.place.NameTokens;

public class secondPresenter extends Presenter<secondPresenter.MyView, secondPresenter.MyProxy> {
	interface MyView extends View {
		public Label getSecondLabel();
	}

	public static final Object SLOT_list = new Object();

	@NameToken(NameTokens.second) // adres
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<secondPresenter> {
	}

	String name = "";

	// ogarnac to
	private final IndirectProvider<RatePagePresenter> ratePageFaktory;

	@Inject 
	secondPresenter(EventBus eventBus, MyView view, MyProxy proxy, Provider<RatePagePresenter> ratePageFaktory) {
		super(eventBus, view, proxy, RevealType.Root);

		// i to
		this.ratePageFaktory = new StandardProvider<RatePagePresenter>(ratePageFaktory);

	}

	@Override // ?????
	protected void revealInParent() {
		RevealContentEvent.fire(this, headerPresenter.SLOT_content, this);
	}

	@Override
	public void prepareFromRequest(PlaceRequest request) {
		super.prepareFromRequest(request);
		// name w odpowidzi, klucz wartosc jak w home klucz i wartosc. fajne
		// jezeli nie znajdzie wartosci o takim klucz to uzyje "default value"
		// jezeli do strony o tokenie second przejde recznie wpisujac url to
		// pojawia sie default
		name = request.getParameter("name", "Default value");
	}

	@Override // gdy byl w onbind to nie bylo nic prawdopodobnie dlatego ze w
				// momencie tworzenia nie bylo jeszcze przypisanej wartosci
	// ????????
	protected void onReset() {
		super.onReset();
		getView().getSecondLabel().setText(name);

		setInSlot(SLOT_list, null);

		for (int i = 0; i < 3; i++) {
			ratePageFaktory.get(new AsyncCallback<RatePagePresenter>() {

				@Override
				public void onSuccess(RatePagePresenter result) {
					addToSlot(SLOT_list, result);
				}

				@Override
				public void onFailure(Throwable caught) {

				}
			});

		}
	}

}