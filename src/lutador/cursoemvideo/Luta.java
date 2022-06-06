package lutador.cursoemvideo;

import java.util.Random;

public class Luta {

    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        if (aprovada) {
            System.out.println("desafiado");
            this.desafiado.apresentar();
            System.out.println("desafiante");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 3 é o tamanho ou seja vsi escolher 0 1 ou 2
            switch (vencedor) {
                case 0:
                    System.out.println("empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + " ganhou.");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " ganhou.");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("Luta não aprovada.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
