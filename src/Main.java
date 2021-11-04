import java.util.ArrayList;
import Associados.Epic;
import Associados.Steam;

public class Main {
    public static void main(String[] args) {

        //Realizar o cadastro das plataformas de jogos adicionando manualmente os possiveis jogos da semana
        Epic adminEpic = new Epic(1);
        System.out.println("Sistema acesso a partir da companhia " + adminEpic.getCompanhia());
        adminEpic.SetAdm("Diego");
        adminEpic.AddJogoFree("Overcooked 2");
        adminEpic.AddJogoFree("GTA 5");
        adminEpic.AddJogoFree("Control");
        adminEpic.AddJogoFree("Rocket League");
        adminEpic.SortGame();
        System.out.println(adminEpic.getJogoSorteadoDaSemana());

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> listaJogosGratis = new ArrayList();
        listaJogosGratis.add("NBA 2K21");
        listaJogosGratis.add("Satisfactory");
        listaJogosGratis.add("Batman LEGO");

        //Realizar o cadastro das plataformas passando uma lista com os possiveis jogos
        Epic adminEpic2 = new Epic(1, listaJogosGratis);
        System.out.println("Sistema acesso a partir da companhia " + adminEpic2.getCompanhia());
        adminEpic2.SetAdm("Fabiano");
        System.out.println(adminEpic2.getJogoSorteadoDaSemana());

        System.out.println("---------------------------------------------------------------------");


        Steam steam1 = new Steam(2, "Steam");
        steam1.SetAdm("Lucas");
        System.out.println(steam1.getCompanhia());




    }
}
