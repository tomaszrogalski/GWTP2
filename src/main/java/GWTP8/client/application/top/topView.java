package GWTP8.client.application.top;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class topView extends ViewImpl implements topPresenter.MyView {
	interface Binder extends UiBinder<Widget, topView> {
	}

	@Inject
	topView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}