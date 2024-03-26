import java.util.Scanner;

abstract class FiguraGeometrica {
    abstract double calcularArea();
}

class Triangulo extends FiguraGeometrica {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

class Retangulo extends FiguraGeometrica {
    double lado1;
    double lado2;

    Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    double calcularArea() {
        return lado1 * lado2;
    }
}

class Quadrado extends FiguraGeometrica {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

class Trapezio extends FiguraGeometrica {
    double baseMaior;
    double baseMenor;
    double altura;

    Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}

class Losango extends FiguraGeometrica {
    double diagonalMaior;
    double diagonalMenor;

    Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}

class Circulo extends FiguraGeometrica {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo(a) à calculadora geométrica");
        System.out.println("------------------------------------------------");
        System.out.println("Menu de figuras geométricas:");
        System.out.println("\n1. Triângulo");
        System.out.println("2. Retângulo");
        System.out.println("3. Quadrado");
        System.out.println("4. Trapézio");
        System.out.println("5. Losango");
        System.out.println("6. Círculo");
        System.out.print("\nInsira a figura desejada: ");

        int opcao = scanner.nextInt();

        FiguraGeometrica figura;

        switch (opcao) {
            case 1:
                System.out.println("Digite a base do triângulo:");
                double base = scanner.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double altura = scanner.nextDouble();
                figura = new Triangulo(base, altura);
                break;
            case 2:
                System.out.println("Digite o lado 1 do retângulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Digite o lado 2 do retângulo:");
                double lado2 = scanner.nextDouble();
                figura = new Retangulo(lado1, lado2);
                break;
            case 3:
                System.out.println("Digite o lado do quadrado:");
                double lado = scanner.nextDouble();
                figura = new Quadrado(lado);
                break;
            case 4:
                System.out.println("Digite a base maior do trapézio:");
                double baseMaior = scanner.nextDouble();
                System.out.println("Digite a base menor do trapézio:");
                double baseMenor = scanner.nextDouble();
                System.out.println("Digite a altura do trapézio:");
                double alturaTrapezio = scanner.nextDouble();
                figura = new Trapezio(baseMaior, baseMenor, alturaTrapezio);
                break;
            case 5:
                System.out.println("Digite a diagonal maior do losango:");
                double diagonalMaior = scanner.nextDouble();
                System.out.println("Digite a diagonal menor do losango:");
                double diagonalMenor = scanner.nextDouble();
                figura = new Losango(diagonalMaior, diagonalMenor);
                break;
            case 6:
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                figura = new Circulo(raio);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        double area = figura.calcularArea();
        System.out.println("A área da figura selecionada é: " + area);
    }
}
