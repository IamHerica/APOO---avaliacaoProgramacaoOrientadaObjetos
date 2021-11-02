import Associados.Epic;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Realizar o cadastro das plataformas de jogos adicionando manualmente os possiveis jogos da semana
        Epic adminEpic = new Epic(1);
        System.out.println("Sistema acesso a partir da companhia " + adminEpic.getCompanhia());
        adminEpic.AddJogoFree("Overcooked 2");
        adminEpic.AddJogoFree("PUBG");
        adminEpic.AddJogoFree("Control");
        adminEpic.AddJogoFree("Fall Guys");
        adminEpic.SortGame();
        System.out.println(adminEpic.getJogoSorteadoDaSemana());



        ArrayList<String> listaJogosGratis = new ArrayList();
        listaJogosGratis.add("NBA 2K21");
        listaJogosGratis.add("Satisfactory");

        //Realizar o cadastro das plataformas passando uma lista com os possiveis jogos
        Epic adminEpic2 = new Epic(1, listaJogosGratis);
        System.out.println("Sistema acesso a partir da companhia " + adminEpic2.getCompanhia());
        System.out.println(adminEpic2.getJogoSorteadoDaSemana());
    }
}
