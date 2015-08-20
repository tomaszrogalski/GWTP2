package GWTP8.shared;

public class CzlowiekDto {

	private Long id;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String ulica;

	private String nrdomu;

	private String miejscowosc;

	public CzlowiekDto(Long id, String imie, String nazwisko, String pesel, String ulica, String nrdomu,
			String miejscowosc) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.ulica = ulica;
		this.nrdomu = nrdomu;
		this.miejscowosc = miejscowosc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNrdomu() {
		return nrdomu;
	}

	public void setNrdomu(String nrdomu) {
		this.nrdomu = nrdomu;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	
	
}
