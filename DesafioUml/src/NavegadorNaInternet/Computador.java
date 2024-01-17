package NavegadorNaInternet;

public class Computador implements NavegadorNaInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibir em tela a pagina da internet");
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Realizando a atualização da página");
    }

    public static void main(String[] args) {
        Computador positivo = new Computador();

        positivo.adcionarNovaAba();
        positivo.atualizarPagina();
        positivo.exibirPagina();
    }
}
