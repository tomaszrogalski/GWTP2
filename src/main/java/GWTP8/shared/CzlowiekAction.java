package GWTP8.shared;

import com.gwtplatform.dispatch.rpc.shared.UnsecuredActionImpl;

import GWTP8.serwer.Czlowiek;

public class CzlowiekAction extends UnsecuredActionImpl<CzlowiekResult> {
	private CzlowiekDto czlowiek;

	public CzlowiekAction(final CzlowiekDto czlowiek) {

		this.czlowiek = new CzlowiekDto(3L, "dfs", "dfs", "dfs", "dfs", "dfs", "dfs");
	}

	public CzlowiekAction() {
		this.czlowiek = new CzlowiekDto(3L, "dfs", "dfs", "dfs", "dfs", "dfs", "dfs");
	}

	public CzlowiekDto getCzlowiek() {

		czlowiek.setId(3L);
		czlowiek.setImie("sad");
		czlowiek.setMiejscowosc("sadas");
		czlowiek.setNazwisko("asdas");
		czlowiek.setNrdomu("wqeq");
		czlowiek.setPesel("sadas");
		czlowiek.setUlica("sadas");
		return czlowiek;
	}
}
