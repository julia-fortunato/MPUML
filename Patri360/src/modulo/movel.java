package modulo;

public class movel extends patrimonio {

	private double Valor;
	
	public movel(String NomeItem, int quantidade, double Valor) {
		super(NomeItem, quantidade);
		setValor(Valor);

	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double Valor) {
		this.Valor = Valor;
	}
	
	public String toString() {
		return "Nome: "+NomeItem+"\nQuantidade: "+quantidade+"\nValor: R$ "+Valor;
	}
	
}
