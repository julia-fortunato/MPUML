package modulo;

public class Main {
	static filial filialTeste1;
	static imovel imovelTeste1;
	static movel movelTeste1;

	public static void main(String[] args) {
		filialTeste1 = new filial("Matriz","Rua Alves de Carvalho, 160, Braslandia, Sao Goncalo-RJ","12.345.678/0002-00","Marcelo dos Santos");
		imovelTeste1 = new imovel("Lote Santa Maria",1,false,150000,120);
		movelTeste1 = new movel("BMW e36 1996",1,93600);
		
		System.out.println("     Patri360\ngerencia patrimonial \n");
		System.out.println("________________________________________\n");
		System.out.println(filialTeste1.toString());
		System.out.println("________________________________________\n");
		System.out.println("PATRIMONIO IMOVEL:\n");
		System.out.println(imovelTeste1.toString());
		System.out.println("________________________________________\n");
		System.out.println("PATRIMONIO MOVEL:\n");
		System.out.println(movelTeste1.toString());
		System.out.println("________________________________________\n");
	}

}
