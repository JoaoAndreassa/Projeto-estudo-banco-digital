
public class main {

	public static void main(String[] args) {
		cliente joao = new cliente();
		joao.setNome("joao");
		
		conta cc = new ContaCorrente(joao);
		conta poupanca = new ContaPoupanca(joao);
		
		
		cc.depositar(5000);
		cc.tranferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		
	}
}
