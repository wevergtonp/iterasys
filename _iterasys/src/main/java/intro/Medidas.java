package intro;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U   D E   O P Ç Õ E S ");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("d - Contar até Dez");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contagem Regressiva de 10 a 0");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você optou pelo método curto");
                calcularModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você optou pelo método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você optou pelo método extenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você optou pelo método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você optou pelo método ContagemRegressiva");
                contagemRegressiva();
                break;
            default:
                System.out.println("Você selecionou " + opcao + ", e essa opção é inválida.");
                break;
        }
    }

    public static void ifSimples() {
        String modo = "curto";

        if (modo == "curto") {
            calcularModoCurto();
        } else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso() {
        //Calculo de área - Exemplo: o tamanho do tapete ou do piso
        System.out.println("Calculando área por modo extenso");
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 5;
        resultado = largura * comprimento;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m. A área é de " + resultado + "m²");
    }

    public static void calcularModoCurto() {
        System.out.println("Calculando área por modo curto");
        int largura = 5;
        int comprimento = 6;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m. A área é de " + (largura * comprimento) + "m²");
    }

    public static void contarAteDez() {
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }


    }

    public static void contagemRegressiva(){
        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }


}
