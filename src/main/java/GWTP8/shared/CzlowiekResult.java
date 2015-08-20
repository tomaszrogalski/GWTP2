package GWTP8.shared;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class CzlowiekResult implements Result {

	private String odpowiedzZSerwera;

	public CzlowiekResult(final String odpowiedzZSerwera) {
		super();
		this.odpowiedzZSerwera = odpowiedzZSerwera;
	}

	@SuppressWarnings("nieuzywany")
	public CzlowiekResult() {
		super();
	}

	public String getOdpowiedzZSerwera() {
		return odpowiedzZSerwera;
	}

}
