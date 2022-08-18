package MeuPacote;

public abstract class Empregado {
	private String nome;
	private String depto;
	
	public Empregado(String nome, String depto) {
		this.nome = nome;
		this.depto = depto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", depto=" + depto + "]";
	}
	public abstract double calcularSalario(); /* metodo abstrato nao tem codigo */
	
}
