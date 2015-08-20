package GWTP8.serwer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@Table(name = "czlowiek", schema = "kraina_smokow2")
public class Czlowiek {

	@Id
//	@SequenceGenerator(name = "id_seq", sequenceName = "kraina_smokow2.id_seq", initialValue = 1, allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
//	@Column(name = "id")
	private Long id;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String ulica;

	private String nrdomu;

	private String miejscowosc;

	public Czlowiek(Long id, String imie, String nazwisko, String pesel, String ulica, String nrdomu,
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

	
	public void setId(Long id) {
		this.id = id;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}


	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}


	public void setPesel(String pesel) {
		this.pesel = pesel;
	}


	public void setUlica(String ulica) {
		this.ulica = ulica;
	}


	public void setNrdomu(String nrdomu) {
		this.nrdomu = nrdomu;
	}


	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}


	public Long getId() {
		return id;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public String getPesel() {
		return pesel;
	}

	public String getUlica() {
		return ulica;
	}

	public String getNrdomu() {
		return nrdomu;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}
	
	
}
