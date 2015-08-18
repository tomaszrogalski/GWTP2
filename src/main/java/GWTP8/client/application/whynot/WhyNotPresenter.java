package GWTP8.client.application.whynot;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
    import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
public class WhyNotPresenter extends PresenterWidget<WhyNotPresenter.MyView>  {
    interface MyView extends PopupView  {
    	public Button getOkButton();

    }

    @Inject
    WhyNotPresenter(
            EventBus eventBus,
            MyView view) {
        super(eventBus, view);
        
    }
    
    @Override
    protected void onBind() {
    	super.onBind();
    	
    	getView().getOkButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				getView().hide();
			}
		});
    }
    
    
}