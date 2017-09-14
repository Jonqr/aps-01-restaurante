import java.util.Scanner;
public class Restaurante {
	
	
	public Restaurante()
	{
		mostraCardapio();
	}
	
	Prato prato[] = new Prato[3];
	Pedido Prato[] = new Pedido[3];
	
	public void mostraCardapio()
	{
		for(int i =0;i<prato.length;i++)
		{
			System.out.println
			("Nome:"+prato[i].getNome() + " , Preço: "+ prato[i].getPreco() +"/n"+
			"Descricao do prato /n"+
			prato[i].getDescricao());
		}
	}
	
	public void alteraPrato(){}
	
	public void criaPrato(){		
		
		int cont=0;
		while(cont<prato.length)
		{
		
		System.out.println("Adicione prato:");
		System.out.println("Add nome prato");	String a = new Scanner(System.in).nextLine();
		System.out.println("Add Preço prato");   double b = new Scanner(System.in).nextDouble();
		prato[cont] = new Prato(a,b);
		prato[cont].addDesc();
		
		cont++;
		}//fim while
		cont=0;
	

	}
	public void criaPedido()
	{
		System.out.println("Crie o pedido");	
	}
}//fim classe
		

//		Modifique a classe Restaurante para que um pedido seja criado a partir desta classe.




