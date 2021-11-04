package Associados;

import Interfaces.IContratoAssociados;

public abstract class FormsAssociados implements IContratoAssociados {
    private int id;
    private String companhia;

    public FormsAssociados(int id, String companhia) {
        this.id = id;
        this.companhia = companhia;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public abstract void SetAdm(String admin);
}
