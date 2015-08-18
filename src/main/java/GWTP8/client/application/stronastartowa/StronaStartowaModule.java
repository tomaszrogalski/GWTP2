package GWTP8.client.application.stronastartowa;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class StronaStartowaModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(StronaStartowaPresenter.class, StronaStartowaPresenter.MyView.class, StronaStartowaView.class, StronaStartowaPresenter.MyProxy.class);
    }
}