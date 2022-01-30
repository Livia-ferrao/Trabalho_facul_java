package liviacorazzaferrao;

import javax.swing.JOptionPane;

public class Rodovia {
	String nome;
	Double quilometragemTotal;

	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome rodovia: "));
		setQuilometragemTotal(Double.parseDouble(JOptionPane.showInputDialog("Quilometragem total: ")));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuilometragemTotal() {
		return quilometragemTotal;
	}

	public void setQuilometragemTotal(Double quilometragemTotal) {
		this.quilometragemTotal = quilometragemTotal;
	}

	@Override
	public String toString() {
		return "Rodovia [nome=" + nome + ", quilometragemTotal=" + quilometragemTotal + "]";
	}

}
