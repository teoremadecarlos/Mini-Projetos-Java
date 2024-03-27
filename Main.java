public class Main {
    public static void main(String[] args) {
        Dado d6 = new Dado( 6);

        // Rolar o dado e obter o valor tirado
        d6.rolar();
        System.out.println("Valor da face do dado após o lançamento: " + d6.getValorFace());
    }
}