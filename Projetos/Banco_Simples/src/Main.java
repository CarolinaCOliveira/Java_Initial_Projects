
public class Main {

	public static void main(String[] args) {
		Cliente Carolina = new Cliente();
		Carolina.setNome("Carolina"); //cadastro simples de cliente
		
			
		Conta cc = new ContaCorrente(Carolina);
		cc.depositar(10000.00);  //deposito na conta corrente
		
		Conta poupanca = new ContaPoupanca(Carolina);
		cc.transferir(5600.00, poupanca); //tranferencia  da CC p/ a CP.

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
		
