// 1 - Pacote
package intro;

// 2 - Referências as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Calculo de áreas");
        calcularModoCompacto();
    }

    //Métodos de apoio

    public static void calcularAreaModoExtenso(){
        //Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;
        resultado = largura * comprimento;

        //Saída na tela
        System.out.println("A área do tapete é de: " + resultado + "m²");
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m. A área é de " + resultado + "m²");
    }

    public static void calcularModoCompacto(){
        int largura = 5;
        int comprimento = 6;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m. A área é de " + (largura * comprimento) + "m²");
    }
}
