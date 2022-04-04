import java.io.*;

public class SistemaAeroporto {
	private Companhia c1;
	private BufferedReader reader;

	public static void main(String[] args) throws Exception {
		SistemaAeroporto sa1 = new SistemaAeroporto();
		sa1.c1 = new Companhia();
		sa1.reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nNome da Companhia:");
		sa1.c1.setNomeCompanhia(sa1.reader.readLine());
		System.out.println("\nCodigo da Companhia:");
		sa1.c1.setcodCompanhia(sa1.reader.readLine());
		sa1.menu();
	}

	public void menu() throws Exception {
		String menu;
		do {
			System.out.println(
					"\n 1º Cadastrar novo Vôo.\n 2º Listar Vôos.\n 3º Listar passageiros .\n 4º Exibir quantidade de assentos livres.\n 5º Sair.");
			menu = this.reader.readLine();
			switch (Integer.parseInt(menu)) {
				case 1:
					this.cadastraVoo();
					break;
				case 2:
					this.listarVoo();
					break;
				case 3:
					this.listarPassageiro();
					break;
				case 4:
					this.exibirAssentosLivres();
					break;
				case 5:
					break;
				default:
					System.out.println("\n Opcão invalida!\n");
			}
		} while ((Integer.parseInt(menu)) != 5);
	}

	public void cadastraVoo() throws Exception {
		int contador = 0;
		int voos = 0;
		String menu;
		Voo voo = new Voo();
		System.out.print("\n Informe numero do Voo:");
		voo.setnumeroVoo(Integer.parseInt(this.reader.readLine()));
		System.out.println("\n Nº de Assentos:");
		voo.setNumeroAssentos(Integer.parseInt(this.reader.readLine()));

		do {
			System.out.println("\n 1º Cadastrar novo passageiro.\n 2º Sair.");
			menu = this.reader.readLine();

			switch (Integer.parseInt(menu)) {
				case 1:
					Passageiro psg1 = new Passageiro();
					System.out.println("\n Nome do passageiro:");
					psg1.setNomePassageiro(this.reader.readLine());

					System.out.println("\n Codigo do passageiro:");
					psg1.setcodPassageiro(this.reader.readLine());

					System.out.println("\n Assento do passageiro:");
					psg1.setNumeroAssento(Integer.parseInt(this.reader.readLine()));

					if (contador == voo.getNumeroAssentos())
						System.out.println("\n Este vôo está lotado!");
					else {
						contador = contador + 1;
						voo.setNumeroPassageiros(contador);
					}
					System.out.println("\n Passageiro cadastrado!");
					break;

				case 2:
					break;
				default:
					System.out.println("\n Opcão invalida!\n");
			}
		} while ((Integer.parseInt(menu)) != 2);
		voos = voos + 1;
		c1.setQtDeVoos(voos);
		c1.setVoos(voos, voo);
	}

	public void listarVoo() throws Exception {
		int i, j;
		System.out.println("\n********************Voos Cadastrados********************\n");
		for (i = 0; i < (c1.getQtDeVoos()); i++) {
			System.out.println("\n" + i + 1 + "° Voo:\n");
			System.out.println("\n Numero do Voo:" + c1.getVoos(i).getnumeroVoo());
			System.out.println("\n Total de assentos:" + c1.getVoos(i).getNumeroAssentos());
			System.out.println("\n Total passageiros:" + c1.getVoos(i).getNumeroPassageiros());
			System.out.println("\n********************Passageiros********************\n");
			for (j = 0; j < (c1.getVoos(i).getNumeroPassageiros()); j++) {
				System.out.println(
						"\n Nome do " + i + "° passageiro: " + c1.getVoos(i).getPassageiro(j).getNomePassageiro());
				System.out.println(
						"\n Codigo do " + i + "° passageiro: " + c1.getVoos(i).getPassageiro(j).getcodPassageiro());
				System.out.println("\n Numero do assento do " + i + "° passageiro: "
						+ c1.getVoos(i).getPassageiro(j).getNumeroAssento());
				System.out.println("\n********************//********************\n");
			}
		}
	}

	public void listarPassageiro() throws Exception {
		int i, j;
		System.out.println("\nDigite o numero do voo que deseja listar os passageiros:");
		String voo = this.reader.readLine();
		System.out
				.println("\nEsse vôo possui " + c1.getVoos(Integer.parseInt(voo)).getNumeroPassageiros()
						+ " passageiros!");

		for (i = 0; i < (c1.getVoos(Integer.parseInt(voo)).getNumeroPassageiros()); i++) {
			System.out.println("\n********************Informacoes do Passageiro********************\n");

			for (j = 0; j < (c1.getVoos(i).getNumeroPassageiros()); j++) {
				System.out.println(
						"\nNome do " + i + "° passageiro: " + c1.getVoos(i).getPassageiro(j).getNomePassageiro());
				System.out.println(
						"\n Codigo do " + i + "° passageiro: " + c1.getVoos(i).getPassageiro(j).getcodPassageiro());
				System.out.println(
						"\n Assento do " + i + "° passageiro: " + c1.getVoos(i).getPassageiro(j).getNumeroAssento());
				System.out.println("\n********************//********************\n");
			}
		}
	}

	public void exibirAssentosLivres() throws Exception {
		System.out.println("\nDigite o numero do voo que deseja concultar os assentos livres:");
		String voo = this.reader.readLine();
		System.out
				.println(
						"\nEsse vôo possui "
								+ ((c1.getVoos(Integer.parseInt(voo)).getNumeroAssentos())
										- (c1.getVoos(Integer.parseInt(voo)).getNumeroPassageiros()))
								+ " assentos livres!");
	}
}