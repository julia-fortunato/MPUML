package modulo;

import java.util.ArrayList;


public class filial {
	private	String Nome;
	private String Endereco;
	private String CNPJ;
	private String Responsavel;
	private ArrayList<patrimonio> lista = new ArrayList<patrimonio>();
	
	public filial(String Nome,String Endereco,String CNPJ,String Responsavel) {
		setNome(Nome);
		setEndereco(Endereco);
		setCNPJ(CNPJ);
		setResponsavel(Responsavel);
	}

	public String getNome() {
		return Nome;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public String getResponsavel() {
		return Responsavel;
	}
	
	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	
	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}
	
	public void setResponsavel(String Responsavel) {
		this.Responsavel = Responsavel;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public ArrayList<patrimonio> getLista() {
		return lista;
	}

	public void setLista(ArrayList<patrimonio> lista) {
		this.lista = lista;
	}
	public String toString() {
		return "Nome: "+Nome+"\nEndereco: "+Endereco+"\nCNPJ: "+CNPJ+"\nResponsavel: "+Responsavel;
	}
	
}

