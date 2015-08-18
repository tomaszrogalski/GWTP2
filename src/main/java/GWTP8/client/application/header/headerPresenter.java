package GWTP8.client.application.header;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

import GWTP8.client.application.UserNotHappyEvent;
import GWTP8.client.application.UserNotHappyEvent.UserNotHappyHandler;
import GWTP8.client.place.NameTokens;

public class headerPresenter extends Presenter<headerPresenter.MyView, headerPresenter.MyProxy> {
	interface MyView extends View {
		public Label getHappyLabel();
	}

	@ContentSlot // tworzymy slot jasne
	public static final Type<RevealContentHandler<?>> SLOT_content = new Type<RevealContentHandler<?>>();

	private UserNotHappyHandler notHappyHandler = new UserNotHappyHandler() {

		@Override
		public void onUserNotHappy(UserNotHappyEvent event) {
			getView().getHappyLabel().setText("");
		}
	};

	@NameToken(NameTokens.header)
	@ProxyCodeSplit
	interface MyProxy extends ProxyPlace<headerPresenter> {
	}

	@Inject
	headerPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}
	
	@Override
	protected void onBind() {
		super.onBind();
		//tu
	registerHandler(getEventBus().addHandler(UserNotHappyEvent.getType(), notHappyHandler));
	}

}