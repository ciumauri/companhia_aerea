public class Passageiro {
	private String nomePassageiro;
	private String codPassageiro;
	private int numeroAssento;

	/*
	 * Métodos acessores modificadores
	 */
	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setcodPassageiro(String codPassageiro) {
		this.codPassageiro = codPassageiro;
	}

	public String getcodPassageiro() {
		return codPassageiro;
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}

}