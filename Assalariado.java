package MeuPacote;

public class Assalariado extends Empregado{
	private double salarioMensal;
	private double desconto;
	
	public double calcularSalario() {
		return(salarioMensal - desconto);
	}
	
	public Assalariado(String nome, String depto, double salarioMensal, double desconto) {
		super(nome, depto);
		this.salarioMensal = salarioMensal;
		this.desconto = desconto;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Assalariado ["+super.toString()+" salarioMensal=" + salarioMensal + ", desconto=" + desconto + "]";
	}
	
}
