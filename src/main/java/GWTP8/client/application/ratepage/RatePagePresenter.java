package GWTP8.client.application.ratepage;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;

import GWTP8.client.application.UserNotHappyEvent;
import GWTP8.client.application.whynot.WhyNotPresenter;

public class RatePagePresenter extends PresenterWidget<RatePagePresenter.MyView> {
	interface MyView extends View {
		public Button getYesButton();

		public Button getNoButton();
	}
	
	private final EventBus eventBus;

	@Inject
	WhyNotPresenter whyNotPresenter;
	
	
	@Inject
	RatePagePresenter(EventBus eventBus, MyView view) {
		super(eventBus, view);
this.eventBus = eventBus;
	}

	//tutaj ustawiam dzialanie mojego panelu na onliki dodaje alerty
	@Override
	protected void onBind() {
		super.onBind();

		getView().getYesButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To dobrze");
			}
		});

		getView().getNoButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				UserNotHappyEvent userNotHappyEvent = new UserNotHappyEvent("Tekst, daj mi Tekst");
				RatePagePresenter.this.eventBus.fireEvent(userNotHappyEvent);
			addToPopupSlot(whyNotPresenter);
			}
		});
	}

}