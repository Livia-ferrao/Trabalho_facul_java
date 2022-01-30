package liviacorazzaferrao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {

	private static ArrayList<Rodovia> rodovias = new ArrayList<>();
	private static ArrayList<Acidente> acidentes = new ArrayList<>();

	public static void main(String[] args) {
		String menu = "1 - Cadastrar rodovias\n"
				+ "2 - Cadastrar Acidentes (com os respectivos veículos e seus condutores)\n"
				+ "3 - Listar todos os acidentes cujo algum condutor estava embriagado\n"
				+ "4 - Mostrar qual rodovia que possui mais acidentes com vítimas fatais\n"
				+ "5 - Quantidade de acidentes por rodovia\n" + "6 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				cadastrarRodovia();
			}
			if (op == 2) {
				cadastrarAcidentes();
			}
			if (op == 3) {
				exibeAcidentesComCondutorEmbriagado();
			}
			if (op == 4) {
				rodoviaMaisVitimas();
			}
			if (op == 5) {
				qntAcidentesPorRodovia();
			}

		} while (op != 6);
	}

	private static void cadastrarRodovia() {
		Rodovia r1 = new Rodovia();
		r1.cadastra();
		rodovias.add(r1);
	}

	private static void cadastrarAcidentes() {
		if (rodovias.size() == 0) {
			JOptionPane.showMessageDialog(null, "Cadastre uma rodovia!");
		} else {
			int qntAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantos acidentes deseja cadastrar? "));

			for (int i = 1; i <= qntAcidentes; i++) {
				String nomeRodovia = JOptionPane.showInputDialog("Nome da rodovia do acidente " + i + ": ");

				for (Rodovia r : rodovias) {
					if (r.getNome().equalsIgnoreCase(nomeRodovia)) {
						Acidente acidente1 = new Acidente();
						acidente1.cadastra(r);
						acidentes.add(acidente1);
					}
				}
			}

		}
	}

	private static void exibeAcidentesComCondutorEmbriagado() {
		String acidentesCondutorEmbriagado = "";

		for (Acidente acidente : acidentes) {
			if (acidente.getAlgumCondutorEmbriagado()) {
				acidentesCondutorEmbriagado += acidente + "\n\n";
			}
		}
		JOptionPane.showMessageDialog(null, acidentesCondutorEmbriagado);
	}

	private static void rodoviaMaisVitimas() {
		Rodovia rodoviaComMaisVitimasFatais = new Rodovia();
		int qntVitimas = 0;
		for (int i = 0; i < acidentes.size(); i++) {
			if (i == 0) {
				rodoviaComMaisVitimasFatais = acidentes.get(i).getRodovia();
				qntVitimas = acidentes.get(i).getQnt_vitimas();
			} else {
				if (acidentes.get(i).getQnt_vitimas() > qntVitimas) {
					rodoviaComMaisVitimasFatais = acidentes.get(i).getRodovia();
					qntVitimas = acidentes.get(i).getQnt_vitimas();
				}
			}
		}
		JOptionPane.showMessageDialog(null, "A rodovia com mais vítimas fatais é: " + rodoviaComMaisVitimasFatais);
	};

	private static void qntAcidentesPorRodovia() {
		String rodovia = JOptionPane.showInputDialog("Quantidade de acidentes por qual rodovia? ");
		int qntAcidenteRodovia = 0;
		for (Acidente acidente : acidentes) {
			if (acidente.getRodovia().getNome().equalsIgnoreCase(rodovia)) {
				qntAcidenteRodovia = qntAcidenteRodovia + 1;
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de acidentes da rodovia " + rodovia + ": " + qntAcidenteRodovia);
		qntAcidenteRodovia = 0;
	}

}
