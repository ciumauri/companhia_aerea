public class Voo {
	private int numeroVoo;
	private String destinoVoo;
	private int numeroAssentos;
	private int numeroPassageiros;
	private Passageiro[] vetPassageiro;

	/*
	 * Métodos acessores e modificadores
	 */

	public int getnumeroVoo() {
		return numeroVoo;
	}

	public void setnumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public String getdestinoVoo() {
		return destinoVoo;
	}

	public void setdestinoVoo(String destinoVoo) {
		this.destinoVoo = destinoVoo;
	}

	public int getNumeroAssentos() {
		return numeroAssentos;
	}

	public void setNumeroAssentos(int numeroAssentos) {
		this.numeroAssentos = numeroAssentos;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public Passageiro getPassageiro(int pos) {
		return this.vetPassageiro[pos];
	}

	public void setPassageiro(int pos, Passageiro passageiro) {
		this.vetPassageiro[pos] = passageiro;
	}

}