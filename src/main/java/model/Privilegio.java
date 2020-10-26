package model;

/**
 *
 * @author Leonardo
 */
public enum Privilegio {
    CLIENTE("Cliente"),
    FUNCIONARIO("Funcionário");

    public String perfil;

    private Privilegio(String perfil) {
        this.perfil = perfil;
    }

}
