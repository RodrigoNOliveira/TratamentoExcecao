public class Login {
    private String usuario = "adm";
    private String senha = "adm";

    

    public Login() {
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws Exception {

        try {
            if (!this.usuario.equals(usuario) && !this.senha.equals(senha)) {
                throw new Exception("Usuario e senha incorretos");
            } else if (!this.usuario.equals(usuario)) {
                throw new Exception("Usuario incorreto");
            } else if(!this.senha.equals(senha)){
                throw new Exception("Senha incorreta");
            }
             else {
                System.out.println("Login realizado");
                return true;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
