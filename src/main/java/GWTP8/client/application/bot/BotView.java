package GWTP8.client.application.bot;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class BotView extends ViewImpl implements BotPresenter.MyView {
	interface Binder extends UiBinder<Widget, BotView> {
	}

	@Inject
	BotView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}