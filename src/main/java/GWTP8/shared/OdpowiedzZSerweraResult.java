package GWTP8.shared;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class OdpowiedzZSerweraResult implements Result{
	
	private String odpowiedzZSerwera;

	public OdpowiedzZSerweraResult(final String odpowiedzZSerwera) {
		super();
		this.odpowiedzZSerwera = odpowiedzZSerwera;
	}
	
	@SuppressWarnings("nieuzywany")
	public OdpowiedzZSerweraResult() {
		super();
	}


	public String getOdpowiedzZSerwera() {
		return odpowiedzZSerwera;
	}
	
	

}
