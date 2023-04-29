package modulo;

public abstract class patrimonio {
	
	protected String NomeItem;
	protected int quantidade;
	private double valorTotal;
	
	public patrimonio(String NomeItem, int quantidade) {
		setNomeItem(NomeItem);
		setquantidade(quantidade);
	}
	public patrimonio(double valorTotal) {
		setvalorTotal(valorTotal);
	}
	public String getNomeItem() {
		return NomeItem;
	}
	public int getquantidade() {
		return quantidade;
	}
	public double getvalorTotal() {
		return valorTotal;
	}
	public void setNomeItem(String NomeItem) {
		this.NomeItem = NomeItem;
	}
	public void setquantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setvalorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
