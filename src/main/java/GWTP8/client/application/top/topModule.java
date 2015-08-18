package GWTP8.client.application.top;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class topModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(topPresenter.class, topPresenter.MyView.class, topView.class, topPresenter.MyProxy.class);
    }
}