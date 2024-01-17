package DispositivoDeAudioPortatil;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    public static void main(String[] args) {
        Ipod test = new Ipod();
        test.pausar();
        test.selecionarMusica();
        test.tocar();
    }
}
