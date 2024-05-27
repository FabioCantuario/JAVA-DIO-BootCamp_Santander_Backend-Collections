package set.convidados;

import java.util.Objects;

public class Convidado {
	
	private String convidado;
	private int convite;
	
	public Convidado(String convidado, int convite) {
		this.convidado = convidado;
		this.convite = convite;
	}

	public String getConvidado() {
		return convidado;
	}

	public int getConvite() {
		return convite;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(convite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return convite == other.convite;
	}

	public String toString() {
		return 	convidado 
				+ " convite: "
				+ convite
				+ "\n";
	}
	
	
	
	

}
