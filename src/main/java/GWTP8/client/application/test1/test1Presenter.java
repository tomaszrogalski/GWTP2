package GWTP8.client.application.test1;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import GWTP8.client.application.test2.Test2Presenter;
import GWTP8.client.place.NameTokens;

public class test1Presenter extends Presenter<test1Presenter.MyView, test1Presenter.MyProxy> {
	interface MyView extends View {

		public Button getDlugoscButton();

		public TextBox getDlugoscBox();
	}

	public static final Object SLOT_moj_w_test1 = new Object();

	@NameToken(NameTokens.test1)
	@ProxyStandard
	interface MyProxy extends ProxyPlace<test1Presenter> {
	}

	@Inject
	test1Presenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	@Inject // wstrzykuje panel
	Test2Presenter tescik2Presenter;

	@Override
	protected void onBind() {
		setInSlot(SLOT_moj_w_test1, tescik2Presenter);
		super.onBind();
	}

	@Override
	protected void onReset() {
		super.onReset();

		getView().getDlugoscButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Integer lenght = getView().getDlugoscBox().getText().length();
				getView().getDlugoscBox().setText(lenght.toString());
			}
		});

	}

}