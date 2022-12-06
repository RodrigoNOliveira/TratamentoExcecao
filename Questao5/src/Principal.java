import exercicio.excecao.contas.ContaBancaria;

public class Principal {
    public static void main(String[] args) throws Exception {
       
        ContaBancaria c1 = new ContaBancaria(500, 100);
        try{
        System.out.println(c1.getSaldoComLimite());
        //c1.depositar(1001);
        c1.depositar(500);
        System.out.println(c1.getSaldoComLimite());
        c1.sacar(901);
        //c1.sacar(501);
        System.out.println(c1.getSaldoComLimite());}
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
