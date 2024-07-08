package aparelho;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorDeInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico {
    String nome = "iPhone 1";


    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA" );
    }

    @Override
    public void pausar() {
        System.out.println("PAUSA MÚSICA" );
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MUDANDO A MÚSICA" );
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO A PÁGINA" );
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA" );
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA" );
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO" );
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO" );
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CAIXA POSTAL, DEIXE SEU RECADO" );
    }
}
