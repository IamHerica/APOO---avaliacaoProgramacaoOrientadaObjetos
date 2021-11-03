package Associados;

import java.util.ArrayList;
import java.util.Random;

public class Epic extends FormsAssociados {

    private ArrayList<String> listaJogosGratis = new ArrayList();
    private String jogoSorteadoDaSemana;
    private static final String Companhia = "Epic";

    //Construtor que passa os elementos basicos de uma companhia
    public Epic(int id) {
        super(id, Companhia);
    }

    //Sobrecarga de construtor que passa a lista de jogos gratis
    public Epic(int id, ArrayList<String> listaJogosGratis) {
        super(id, Companhia);

        this.listaJogosGratis = listaJogosGratis;
        SortGame();
    }

    //Retornar qual o jogo sorteado da semana
    public String getJogoSorteadoDaSemana() {
        return jogoSorteadoDaSemana;
    }

    //Adicionar na lista de jogos que podem ser gratis na semana
    public void AddJogoFree(String jogoDaSemana) {
        listaJogosGratis.add(jogoDaSemana);
    }

    //Sortear qual será o jogo gratis da semana
    public void SortGame() {

        Random random = new Random();

        //Sortea um numero a partir do tamanho da lista de jogo
        int n = random.nextInt(listaJogosGratis.size());

        jogoSorteadoDaSemana = "O jogo gratis da semana é: "
                + listaJogosGratis.get(n);
    }

    @Override
    public void SetAdm(String admin) {
        System.out.println(admin +" no comando do sistema.");
    }
}

