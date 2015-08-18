package GWTP8.client.application.stronastartowa;

import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

import GWTP8.client.application.bot.BotPresenter;
import GWTP8.client.application.top.topPresenter;
import GWTP8.client.place.NameTokens;

public class StronaStartowaPresenter
		extends Presenter<StronaStartowaPresenter.MyView, StronaStartowaPresenter.MyProxy> {
	interface MyView extends View {

		public HTMLPanel getTop();

		public HTMLPanel getBot();
	}

	public static final Object SLOT_top = new Object();
	public static final Object SLOT_bot = new Object();

	@NameToken(NameTokens.stronaStartowa)
	@ProxyStandard
	interface MyProxy extends ProxyPlace<StronaStartowaPresenter> {
	}

	@Inject
	StronaStartowaPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	@Inject
	topPresenter top;

	@Inject
	BotPresenter bot;

	@Override
	protected void onBind() {
		super.onBind();

		setInSlot(SLOT_bot, bot);
		setInSlot(SLOT_top, top);

	}

}