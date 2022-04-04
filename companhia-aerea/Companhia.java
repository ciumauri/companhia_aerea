public class Companhia {
    private String nomeCompanhia;
    private String codCompanhia;
    private int qtDeVoos;
    private Voo[] vetDeVoos;

    /*
     * Métodos acessores e modificadores
     */

    public Companhia() {
        this.vetDeVoos = new Voo[5];
    }

    public String getNomeCompanhia() {
        return this.nomeCompanhia;
    }

    public void setNomeCompanhia(String nomeCompanhia) {
        this.nomeCompanhia = nomeCompanhia;
    }

    public String getcodCompanhia() {
        return this.codCompanhia;
    }

    public void setcodCompanhia(String codCompanhia) {
        this.codCompanhia = codCompanhia;
    }

    public int getQtDeVoos() {
        return qtDeVoos;
    }

    public void setQtDeVoos(int qtDeVoos) {
        this.qtDeVoos = qtDeVoos;
    }

    public Voo getVoos(int pos) {
        return this.vetDeVoos[pos];
    }

    public void setVoos(int pos, Voo v) {
        this.vetDeVoos[pos] = v;
    }

}
