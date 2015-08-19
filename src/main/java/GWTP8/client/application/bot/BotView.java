package GWTP8.client.application.bot;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

class BotView extends ViewImpl implements BotPresenter.MyView {
	interface Binder extends UiBinder<Widget, BotView> {
	}

	@UiField
	Label labelImie;
	@UiField
	Label labelNazwisko;
	@UiField
	Label labelPesel;
	@UiField
	Label labelUlica;
	@UiField
	Label labelNrDomu;
	@UiField
	Label labelMiejscowosc;

	@UiField
	TextBox textboxImie;
	@UiField
	TextBox textboxNazwisko;
	@UiField
	TextBox textboxPesel;
	@UiField
	TextBox textboxUlica;
	@UiField
	TextBox textboxNrDomu;
	@UiField
	TextBox textboxMiejscowosc;

	@UiField
	Button buttonWyczysc;
	@UiField
	Button buttonWyslij;

	@Inject
	BotView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	// @UiHandler("buttonWyslij")
	// void onWyslij(ClickEvent event) {
	// getUiHandlers().sendName(nameField.getText());
	// }

	public TextBox getTextboxImie() {
		return textboxImie;
	}

	public TextBox getTextboxNazwisko() {
		return textboxNazwisko;
	}

	public TextBox getTextboxPesel() {
		return textboxPesel;
	}

	public TextBox getTextboxUlica() {
		return textboxUlica;
	}

	public TextBox getTextboxNrDomu() {
		return textboxNrDomu;
	}

	public TextBox getTextboxMiejscowosc() {
		return textboxMiejscowosc;
	}

	public Button getButtonWyczysc() {
		return buttonWyczysc;
	}

	public Button getButtonWyslij() {
		return buttonWyslij;
	}

}