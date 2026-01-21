package bootcamp.dio.java.modulo03_poo.herancaepolimorfismo;

public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean logado;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logado = false;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isLogado() { return logado; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }

    public void realizarLogin(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            logado = true;
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }
    }

    public void realizarLogoff() {
        logado = false;
        System.out.println("Logoff realizado.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (!logado) {
            System.out.println("Você precisa estar logado para alterar dados.");
            return;
        }
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados atualizados com sucesso.");
    }

    public void alterarSenha(String senhaAtual, String novaSenha) {
        if (!logado) {
            System.out.println("Você precisa estar logado para alterar senha.");
            return;
        }
        if (this.senha.equals(senhaAtual)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Senha atual incorreta.");
        }
    }
    public abstract boolean isAdministrador();
}