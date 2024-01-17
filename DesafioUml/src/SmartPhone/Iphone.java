package SmartPhone;

import AparelhoTelefonico.AparelhoTelefonico;
import DispositivoDeAudioPortatil.ReprodutorMusical;
import NavegadorNaInternet.NavegadorNaInternet;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    @Override
    public void ligar() {
        System.out.println("ligando o SmartPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Gravando correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir pagina no navegador");
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página no navegador");
    }

    public static void main(String[] args) {
        Iphone se = new Iphone();

        se.adcionarNovaAba();
        se.atender();
        se.atualizarPagina();
        se.ligar();
        se.pausar();
        se.exibirPagina();
        se.iniciarCorreioDeVoz();
        se.tocar();
        se.selecionarMusica();
    }
}
