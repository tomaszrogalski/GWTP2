package GWTP8.client.application.test1;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class test1Module extends AbstractPresenterModule {
	@Override
	protected void configure() {

		bindPresenter(test1Presenter.class, test1Presenter.MyView.class, test1View.class, test1Presenter.MyProxy.class);
	}
}