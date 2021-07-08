package intro;

public class Medidas {

    public static void main(String[] args) {

        String opcao = "ifSimples";

        switch (opcao){
            case "ifSimples":
                System.out.println("Você optou pelo método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você optou pelo método curto");
                calcularModoCurto();
                break;
            case "extenso":
                System.out.println("Você optou pelo método extenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você selecionou " + opcao + ", e essa opção é inválida.");
                break;
        }
    }

    public static void ifSimples() {
        String modo = "curto";

        if (modo == "curto"){
            calcularModoCurto();
        } else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso(){
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

    public static void calcularModoCurto(){
        System.out.println("Calculando área por modo curto");
        int largura = 5;
        int comprimento = 6;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m. A área é de " + (largura * comprimento) + "m²");
    }
}
