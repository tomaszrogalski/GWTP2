package GWTP8.client.application.second;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import GWTP8.client.application.header.headerPresenter;

class secondView extends ViewImpl implements secondPresenter.MyView {
	interface Binder extends UiBinder<Widget, secondView> {
	}

	@UiField
	Label secondLabel;

	@UiField
	HTMLPanel listPanel;

	@Inject
	secondView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getSecondLabel() {
		return secondLabel;
	}

	// dodaj
	@Override
	public void addToSlot(Object slot, IsWidget content) {
		if (slot == secondPresenter.SLOT_list) {
			if (content != null) {
				listPanel.add(content);
			}
		} else {
			super.addToSlot(slot, content);
		}
	}

	// usun a potem dodaj
	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == secondPresenter.SLOT_list) {
			listPanel.clear();
			if (content != null) {
				listPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}