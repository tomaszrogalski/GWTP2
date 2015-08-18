package GWTP8.client.application.test1;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

import GWTP8.client.application.home.HomePagePresenter;

class test1View extends ViewImpl implements test1Presenter.MyView {
	interface Binder extends UiBinder<Widget, test1View> {
	}

	@UiField
	Button dlugoscButton;

	@UiField
	TextBox dlugoscBox;
	@UiField
	HTMLPanel tuBedzieSlot;

	@Inject
	test1View(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Button getDlugoscButton() {
		return dlugoscButton;
	}

	public TextBox getDlugoscBox() {
		return dlugoscBox;
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == test1Presenter.SLOT_moj_w_test1) {
			tuBedzieSlot.clear();
			if (content != null) {
				tuBedzieSlot.add(content);
			}

		} else {
			super.setInSlot(slot, content);
		}
	}
}