package GWTP8.client.application.test2;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class Test2View extends ViewImpl implements Test2Presenter.MyView {
	interface Binder extends UiBinder<Widget, Test2View> {
	}

	@Inject
	Test2View(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

}