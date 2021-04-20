package it.prova.cercalibri.model;

public class Libro {

	private String titolo;
	private String genere;
	private Integer numeropagine;

	public Libro(String titolo, String genere, Integer numero) {
		this.titolo = titolo;
		this.genere = genere;
		this.numeropagine = numero;

	}

	public Integer getNumeropagine() {
		return numeropagine;
	}

	public void setNumeropagine(Integer numeropagine) {
		this.numeropagine = numeropagine;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genere == null) ? 0 : genere.hashCode());
		result = prime * result + ((numeropagine == null) ? 0 : numeropagine.hashCode());
		result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (genere == null) {
			if (other.genere != null)
				return false;
		} else if (!genere.equals(other.genere))
			return false;
		if (numeropagine == null) {
			if (other.numeropagine != null)
				return false;
		} else if (!numeropagine.equals(other.numeropagine))
			return false;
		if (titolo == null) {
			if (other.titolo != null)
				return false;
		} else if (!titolo.equals(other.titolo))
			return false;
		return true;
	}

}
