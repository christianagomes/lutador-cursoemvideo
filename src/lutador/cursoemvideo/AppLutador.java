package lutador.cursoemvideo;

public class AppLutador {
    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[2];

        lutador[0] = new Lutador("MATHEUS", "Brasileiro", 28, 8, 1, 2, 1.78f, 91.6f);
        lutador[1] = new Lutador("JOAO", "Brasileiro", 25, 11, 3, 2, 1.81f, 105.7f);

        Luta luta = new Luta();
        luta.marcarLuta(lutador[0], lutador[1]);
        luta.lutar();


    }

}
