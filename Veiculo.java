package liviacorazzaferrao;

import javax.swing.JOptionPane;

public class Veiculo {
	String ano_fabricacao;
	Condutor condutor;

	public void cadastra(int numVeiculos) {
		setAno_fabricacao(JOptionPane.showInputDialog("Ano de fabricação do " + numVeiculos + " veículo: "));
		setCondutor(new Condutor());
		condutor.cadastra(numVeiculos);
	}

	public boolean getCondutorEmbriagado() {
		return condutor.isEmbriagadoOuNao();
	}

	public String getAno_fabricacao() {
		return ano_fabricacao;
	}

	public void setAno_fabricacao(String ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	@Override
	public String toString() {
		return "Veiculo [ano_fabricacao=" + ano_fabricacao + ", condutor=" + condutor + "]";
	}

}
