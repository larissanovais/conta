
public class Conta {

	String nomeConta;
	int numeroConta;
	float saldoConta = 100;
	
	public void sacar(float valor) {
		
		saldoConta -= valor;
	}
	
	public void depositar(float valor) {
		
		saldoConta += valor;
	}
		
	public float consultarSaldo() {
		
		return saldoConta;
	}
	
	public String consultarNome() {
		
		return nomeConta;
	}
	
	public void AlterarNome(String novoNome) {
		
		nomeConta = novoNome;
	}
		
	
}
