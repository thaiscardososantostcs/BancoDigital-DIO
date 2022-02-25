
public class Main {

	public static void main(String[] args) {
		Cliente thais = new Cliente();
		thais.setNome("Thais");
		
		
		
		
		
		Conta cc = new ContaCorrente(thais);
		Conta poupanca = new ContaPoupanca(thais);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
