package exercicio.excecao.contas;

public class ContaBancaria {

    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldoComLimite() {
        return this.saldo + limite;
    }

    public boolean sacar(double valor) throws ContaException {

        /*
         * Professor, nessa parte diz:
         * A sua classe conta bancária deve permitir apenas saques inferiores a R$
         * 500,00 ou que
         * não façam com que a soma entre o saldo e o limite da conta resultem em um
         * valor
         * menor do que zero.
         * 
         * 
         * 
         * Se o saldo for 1000 e o limite for 100, a soma seria 1100. O saque
         * não seria permitido se fosse 1101, mas se fosse 1100 sim, mas fugiria da outra condição de ser maior
         * que 500
         */

        if (valor > 500 ||getSaldoComLimite()-valor < 0 ) {
            throw new ContaException("Valor do saque maior que o permitido");
        } /*else if (getSaldoComLimite()-valor < 0) {
            throw new ContaException("Valor do saque superior ao limite do saldo disponivel");
        }*/
        this.saldo = saldo - valor;
        return true;
    }

    public void depositar(double valor) throws ContaException {
        if (valor > 1000) {
            throw new ContaException("Valor do deposito maior que o permitido (R$1000,00)");
        }
        this.saldo = saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
