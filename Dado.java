import java.util.Random;

public class Dado {
    private int qtdLados;
    private int valorFace;
    public Dado(int qtdLados) {
        this.valorFace = 1;
        this.qtdLados = qtdLados;
    }

    public int getValorFace() {
        return valorFace;
    }

    public void setQtdLados(int qtdLados) {
        this.qtdLados = qtdLados;
    }

    public int getQtdLados() {
        return this.qtdLados;
    }

    public void setValorFace(int valorFace) {
        if (valorFace >= 1 && valorFace<= qtdLados) {
            this.valorFace = valorFace;
        } else {
            System.out.println("Valor inválido para a face do dado");
        }
    }

    public void rolar() {
        Random random = new Random();
        this.valorFace = random.nextInt((this.qtdLados -1) +1) + 1;
    }
}