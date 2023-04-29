package modulo;

public class imovel extends patrimonio {

	private boolean Tipo;
	private double Valor;
	private double Tamanho;
	
	
	public imovel(String NomeItem, int quantidade,boolean Tipo,double Valor,double Tamanho) {
		super(NomeItem, quantidade);
		setTipo(Tipo);
		setValor(Valor);
		setTamanho(Tamanho);
	}

	public boolean getTipo() {
		return Tipo;
	}

	public void setTipo(boolean Tipo) {
		this.Tipo = Tipo;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double Valor) {
		this.Valor = Valor;
	}

	public double getTamanho() {
		return Tamanho;
	}

	public void setTamanho(double Tamanho) {
		this.Tamanho = Tamanho;
	}
	public String toString() {
		String Terreno;
		if(Tipo == true) {
			Terreno = "Residencia";
		}
		else {
			Terreno = "Terreno";
		}
			
		return "Item: "+NomeItem+"\nQuantidade: "+quantidade+"\nTipo: "+Terreno+"\nValor: R$ "+Valor+"\nTamanho: "+Tamanho+" metros quadrados";
	}
}
