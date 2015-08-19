package GWTP8.shared;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

public class WyslijDoSerweraAction extends UnsecuredActionImpl<OdpowiedzZSerweraResult> {

	private String textKtoryWyslemyDoSerwera;

	public WyslijDoSerweraAction(final String textKtoryWyslemyDoSerwera) {

		this.textKtoryWyslemyDoSerwera = textKtoryWyslemyDoSerwera;
	}

	@SuppressWarnings("nieuzywany")
	public WyslijDoSerweraAction() {
		super();
	}

	public String getTextKtoryWyslemyDoSerwera() {
		return textKtoryWyslemyDoSerwera;
	}
}
