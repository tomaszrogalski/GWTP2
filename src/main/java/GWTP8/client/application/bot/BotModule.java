package GWTP8.client.application.bot;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class BotModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(BotPresenter.class, BotPresenter.MyView.class, BotView.class, BotPresenter.MyProxy.class);
    }
}