package liviacorazzaferrao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Acidente {
	Rodovia rodovia;
	int qnt_vitimas;
	ArrayList<Veiculo> veiculosEnvolvidosAcidente = new ArrayList<>();

	public void cadastra(Rodovia rodovia) {
		setRodovia(rodovia);
		setQnt_vitimas(Integer.parseInt(JOptionPane.showInputDialog("Quantas vitimas fatais o acidente teve? ")));

		int num = Integer.parseInt(JOptionPane.showInputDialog("Quantos veículos estão envolvidos no acidente? "));

		for (int i = 1; i <= num; i++) {
			Veiculo veiculo = new Veiculo();
			veiculo.cadastra(i);
			veiculosEnvolvidosAcidente.add(veiculo);
		}
	}

	public boolean getAlgumCondutorEmbriagado() {
		for (Veiculo veiculo : veiculosEnvolvidosAcidente) {
			if (veiculo.getCondutorEmbriagado()) {
				return true;
			}
		}
		return false;
	}

	public Rodovia getRodovia() {
		return rodovia;
	}

	public void setRodovia(Rodovia rodovia) {
		this.rodovia = rodovia;
	}

	public int getQnt_vitimas() {
		return qnt_vitimas;
	}

	public void setQnt_vitimas(int qnt_vitimas) {
		this.qnt_vitimas = qnt_vitimas;
	}

	public ArrayList<Veiculo> getVeiculosEnvolvidosAcidente() {
		return veiculosEnvolvidosAcidente;
	}

	public void setVeiculosEnvolvidosAcidente(ArrayList<Veiculo> veiculosEnvolvidosAcidente) {
		this.veiculosEnvolvidosAcidente = veiculosEnvolvidosAcidente;
	}

	@Override
	public String toString() {
		return "Acidente [rodovia=" + rodovia + ", qnt_vitimas=" + qnt_vitimas + ", veiculosEnvolvidosAcidente="
				+ veiculosEnvolvidosAcidente + "]";
	}

}
