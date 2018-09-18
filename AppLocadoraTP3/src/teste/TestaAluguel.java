package teste;

import negocio.Carro;
import negocio.Cliente;
import negocio.Emprestimo;

public class TestaAluguel {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("123.476.348-09", "João Silva", "9876-5432", "Centro", 30, 40000);
		
		Carro carro = new Carro("Gol", "ABC-5050", "Volkswagen", "Motor 1.6", 2016, 50000, 15000, null);
		
		String adicionais[] = {"ABS", "Teto Solar", "Bancos de Couro", "Rádio Bluetooth"};
		
		carro.setAdicionais(adicionais);
		
		Emprestimo e = new Emprestimo();
		e.setCarro(carro);
		e.setCliente(cliente);
		
		e.exibe();
		
		
		e.consultaAluguel();
	
			

		
	}
	
	

}
