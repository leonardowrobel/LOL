package model;

/**
 *
 * @author Leonardo
 */
public abstract class Perfil {
    private long id;
    private String nome;
    private String email;
    private String senha;
    private Privilegio perfil;

    public Perfil() {
    }

    public Perfil(long id, String nome, String email, String senha, Privilegio perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    
    
    
}
