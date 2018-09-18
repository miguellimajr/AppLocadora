package negocio;

import auxiliar.Constante;

public class Emprestimo {
	
	Carro carro;
	Cliente cliente;	
		
	
	public float calculaAluguel() {		
		
		return ((carro.getValorCarro() + carro.getSeguro())/100)*(1-(Constante.getTxDesconto()/100));
				
	}
	
	
	public boolean liberaAluguel() {
		if (cliente.getRendaMensal() >= (carro.getValorCarro()*0.1)) {
			return true;
		}
		
		return false;
	}
	
	
	public void consultaAluguel() {
		if (liberaAluguel()) {
			System.out.printf("O Aluguel foi aprovado pelo Sistema.\n"
					+"Desconto promocional: %.0f %%\n"
					+"Valor da diaria: R$ %.2f\n",
					Constante.getTxDesconto(),
					calculaAluguel());			
			}
		else {
			System.out.printf("O Aluguel não foi aprovado pelo Sistema.\n");
			
		}
			
		}
	
	
	
	public void exibe() {
		
		carro.exibe();
		cliente.exibe();
		
	}


	public Carro getCarro() {
		return carro;
	}



	public void setCarro(Carro carro) {
		this.carro = carro;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
