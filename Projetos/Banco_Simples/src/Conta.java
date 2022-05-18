
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
        @Override
        public void sacar(double valor){
            saldo = saldo - valor;
        }

        @Override
        public void depositar(double valor){
            saldo = saldo + valor;
        }

        @Override
        public void transferir(double valor, Conta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);

        }

        public int getAgencia () {
            return agencia;
        }

        public int getNumero () {
            return numeroConta;
        }

        public double getSaldo () {
            return saldo;
        }

        protected void ImprimirInfosComuns() {
        	System.out.println(String.format("Titular: %s", this.cliente.getNome()));
    		System.out.println(String.format("Agencia: %d", this.agencia));
    		System.out.println(String.format("Numero: %d", this.numeroConta));
    		System.out.println(String.format("Saldo: %.2f", this.saldo));
    	}


    }
