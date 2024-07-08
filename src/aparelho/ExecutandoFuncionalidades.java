package aparelho;

public class ExecutandoFuncionalidades {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}
