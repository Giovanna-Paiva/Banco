import model.ContaBancaria;

public class AppBanco {
	public static void main (String args[]) {
		
		
		ContaBancaria[] contas;
		contas = new ContaBancaria[10];
		
		for (int pos=0; pos <= contas.length-1; pos++) {
			contas[pos] = new ContaBancaria("111.111.111-1"+pos, 10000+pos, pos);
			contas[pos].creditar(1000 + (pos*100));
		}
		
		for(int pos = 0; pos < contas.length; pos++) {
			System.out.println(contas[pos].exibirInfo());
		}
			
		
		/*
		ContaBancaria c1, c2;
		
		c1 = new ContaBancaria("123.456.789-00",10001,1);
		c2 = new ContaBancaria("234.567.890-12",10002,3);
		
		c1.creditar(4000);
		c2.creditar(1000);
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		if (c1.debitar(2650)) {
			System.out.println("Debito efetuado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		
		c1.transferir(1000, c2);
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		*/
		
	}
}
