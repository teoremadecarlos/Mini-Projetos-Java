public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    // Construtor
    public Elevador (int capacidadeElevador, int totalAndares){
        this.totalAndares =  totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.andarAtual = 0; //Elevador inicia no térreo
        this.pessoasPresentes = 0; //Elevador começa com 0 pessoas
    }
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidade() {
        return capacidadeElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    // Entrar uma pessoa no elevador
    public void entrar() {
        if (pessoasPresentes < capacidadeElevador) {
            pessoasPresentes++;
            System.out.println("Uma pessoa entrou no elevador");
        } else {
            System.out.println("O elevador está lotado. Não é possivel entrar.");
        }
    }

    // Saída de uma pessoa no elevador
    public void sair() {
        if (pessoasPresentes > 0){
            pessoasPresentes--;
            System.out.println("Uma pessoa saiu do elevador");
        } else {
            System.out.println("O elevador está vazio.");
        }
    }

    // Subida do elevador
    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("O elevador subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador tá no último andar. Não é possível subir.");
        }
    }

    // Descida do elevador
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("O elevador desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("O elevador está no térreo. Não é possível descer");
        }
    }

    public static void main(String[] args) {
        Elevador elevador = new Elevador(10,5);

        elevador.entrar();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        elevador.sair();
    }
}
