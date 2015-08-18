package GWTP8.client.application.stronastartowa;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class StronaStartowaView extends ViewImpl implements StronaStartowaPresenter.MyView {
	interface Binder extends UiBinder<Widget, StronaStartowaView> {
	}

	@UiField
	HTMLPanel top;
	@UiField
	HTMLPanel bot;

	@Inject
	StronaStartowaView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HTMLPanel getTop() {
		return top;
	}

	public HTMLPanel getBot() {
		return bot;
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == StronaStartowaPresenter.SLOT_bot) {
			bot.clear();
			if (content != null) {
				bot.add(content);
			}
		} else if (slot == StronaStartowaPresenter.SLOT_top) {
			top.clear();
			if (content != null) {
				top.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}