package GWTP8.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

import GWTP8.client.application.header.headerModule;
import GWTP8.client.application.home.HomeModule;
import GWTP8.client.application.ratepage.RatePageModule;
import GWTP8.client.application.second.secondModule;
import GWTP8.client.application.test1.test1Module;
import GWTP8.client.application.test2.Test2Module;
import GWTP8.client.application.third.ThirdModule;
import GWTP8.client.application.whynot.WhyNotModule;
import GWTP8.client.application.stronastartowa.StronaStartowaModule;
import GWTP8.client.application.bot.BotModule;
import GWTP8.client.application.top.topModule;
import GWTP8.client.application.odpowiedz.OdpowiedzModule;

public class ApplicationModule extends AbstractPresenterModule {
	@Override
	protected void configure() {

		install(new OdpowiedzModule());
		install(new topModule());
		install(new BotModule());
		install(new StronaStartowaModule());
		install(new Test2Module());
		install(new test1Module());
		install(new WhyNotModule());
		install(new RatePageModule());
		install(new ThirdModule());
		install(new headerModule());
		install(new secondModule());
		install(new HomeModule());

		bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
				ApplicationPresenter.MyProxy.class);
	}
}
