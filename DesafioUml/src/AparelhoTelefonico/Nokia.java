package AparelhoTelefonico;

public class Nokia implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Ligar o Aparelho");
    }

    @Override
    public void atender() {
        System.out.println("Atender Ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("gravando Correio de voz");
    }

    public static void main(String[] args) {
        Nokia ap1 = new Nokia();

        ap1.atender();
        ap1.ligar();
        ap1.iniciarCorreioDeVoz();
    }
}
