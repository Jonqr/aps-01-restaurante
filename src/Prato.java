import java.util.Scanner;
public class Prato
{
	// -------- 
	
	private boolean cont = false;
	
	public Prato()
	{	
		
		System.out.println("Objeto Prato Criado");
		
	}		
	//=1=  O nome e o preço são obrigatórios, construtor da classe deve garantir isso.
	public Prato (String prato,double preco)
	{
		
		if(cont==true){
		
			setPreco(preco);
			
		}
		if(cont==false)
		{
			setNome(prato);
			setPreco(preco);
			cont= true;
		}	
		
	}//fim construtor
	
	//GET - SET -----------------------------------------
	private String Nome;
	private double Preco;
	private String Descricao ;
	Ingrediente ingrediente[] = new Ingrediente[3];
	
	public void addDesc()
	{	boolean continu = false;
		int cont=0;
		int op =0;
		while(continu != true )
			
			if(cont<3){
			System.out.println(
			"ADD Ingredientes /n"+
			"01 -Carne /n"+
			"02 -Legume /n"+
			"03 - Verdura/n"+
			"04 - Tempero /n"+
			"05-Acompanhamento/n");
			op = new Scanner(System.in).nextInt();
			
				if(op == 01){System.out.println("Carne:"); ingrediente[cont].setCarne(new Scanner(System.in).nextLine()); cont++;} //carne
				if(op == 02){System.out.println("Legume:"); ingrediente[cont].setLegume(new Scanner(System.in).nextLine()); cont++;} //Legume
				if(op == 03){System.out.println("Tempero"); ingrediente[cont].setTempero(new Scanner(System.in).nextLine());cont++;} // Verdura
				if(op == 04){System.out.println("Verdura:"); ingrediente[cont].setVerdura(new Scanner(System.in).nextLine());cont++;}//Tempero
				if(op == 04){System.out.println("Acompanhamento");ingrediente[cont].setAcompanhamento(new Scanner(System.in).nextLine());cont++;}
				
				int ope =0;
				System.out.println("Deseja adicionar outro ingrediente ?   1-sim - 2-nao;"); op = new Scanner(System.in).nextInt();
				if(ope==1){	continu = false; ope =0;}
				if(ope==2) {continu = true; ope=0;}
				
			}
			else
			{
				continu =true;
			}
			
			System.out.println(""); ingrediente[cont].setCarne(new Scanner(System.in).nextLine());

	}
	public void verIgrediente()
	{
		for(int i =0;i<ingrediente.length;i++){
			
		System.out.println(ingrediente[i].getAcompanhamento()+
		ingrediente[i].getCarne()+
		ingrediente[i].getLegume()+
		ingrediente[i].getTempero()+
		ingrediente[i].getVerdura());
	}}
	
	
	//NOME  ---------------------------------------
	public String getNome() {
		return Nome;
	}
	private void setNome(String nome) {
		Nome = nome;
	}
	//Descricao-------------------------
	
	public String getDescricao() {
		return Descricao;
	}
	private void setDescricao(String Descricao) {
		this.Descricao = Descricao;
	}
	
	//Preço -------------------------
	public double getPreco() {
		return Preco;
	}

	private void setPreco(double preco) {
		Preco = preco;
	}
	
	//------------------------------------
		
	
}