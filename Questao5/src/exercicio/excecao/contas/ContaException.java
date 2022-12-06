package exercicio.excecao.contas;

public class ContaException extends Exception{

    public ContaException(String message) {
        super("Erro: " + message);
    }
    
}
