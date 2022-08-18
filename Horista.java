package MeuPacote;

public class Horista extends Empregado{
	private int horasTrabalhadas;
	private double salarioHora;
	
	public double calcularSalario() {
		return(horasTrabalhadas * salarioHora);
	}
	public Horista(String nome, String depto, int horasTrabalhadas, double salarioHora) {
		super(nome, depto);
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
		}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	@Override
	public String toString() {
		return "Horista [" +super.toString()+ "horasTrabalhadas= " + horasTrabalhadas + ", salarioHora=" + salarioHora + "]";

	}
}
