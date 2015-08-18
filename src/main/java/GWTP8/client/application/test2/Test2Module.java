package GWTP8.client.application.test2;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class Test2Module extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(Test2Presenter.class, Test2Presenter.MyView.class, Test2View.class, Test2Presenter.MyProxy.class);
    }
}