package liviacorazzaferrao;

import javax.swing.JOptionPane;

public class Condutor {
	private String nome;
	private int idade;
	private char sexo;
	private boolean embriagadoOuNao;

	public void cadastra(int numVeiculo) {
		setNome(JOptionPane.showInputDialog("Nome do condutor do " + numVeiculo + " veículo: "));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do condutor do " + getNome() + ": ")));
		setSexo(JOptionPane.showInputDialog("Sexo de " + getNome() + ": ").toUpperCase().charAt(0));
		setEmbriagadoOuNao(JOptionPane.showInputDialog("O condutor " + getNome() + " estava embriagado? (S/N)")
				.toUpperCase().charAt(0));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isEmbriagadoOuNao() {
		return embriagadoOuNao;
	}

	public void setEmbriagadoOuNao(char embriagadoOuNao) {
		if (embriagadoOuNao == 'S') {
			this.embriagadoOuNao = true;
		} else if (embriagadoOuNao == 'N') {
			this.embriagadoOuNao = false;
		}
	}

	@Override
	public String toString() {
		return "Condutor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", embriagadoOuNao="
				+ embriagadoOuNao + "]";
	}

}
