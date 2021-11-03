package Associados;

public class Steam extends FormsAssociados {

    public Steam(int id, String companhia) {
        super(id, companhia);
    }

    @Override
    public void SetAdm(String admin) {
        System.out.println("Bem vindo ao sistema da Steam, " + admin);
    }
}
