package MeuPacote;

public class Comissionado extends Empregado{
		private double BrutoVendas;
		private double TaxaComissao;
		private double Bonus;
		
		public double calcularSalario() {
			return(BrutoVendas * TaxaComissao);
		}
		public Comissionado(String nome, String depto, double brutoVendas, double taxaComissao, double bonus) {
			super(nome, depto);
			BrutoVendas = brutoVendas;
			TaxaComissao = taxaComissao;
			Bonus = bonus;
		}
		
		public double getBrutoVendas() {
			return BrutoVendas;
		}
		public void setBrutoVendas(double brutoVendas) {
			BrutoVendas = brutoVendas;
		}
		public double getTaxaComissao() {
			return TaxaComissao;
		}
		public void setTaxaComissao(double taxaComissao) {
			TaxaComissao = taxaComissao;
		}
		public double getBonus() {
			return Bonus;
		}
		public void setBonus(double bonus) {
			Bonus = bonus;
		}
		
		public String toString() {
			return "Comissionado [ " +super.toString() + "BrutoVendas= "+ BrutoVendas + ", TaxaComissao=" + TaxaComissao + ", Bonus=" + Bonus + "]";
		}
}
