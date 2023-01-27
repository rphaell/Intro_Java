// 1 - Pacotes
package intro;

// 2 - Referência as Bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        String opcao = "goiaba";

        switch (opcao) {
            case "ifSimples":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "curto":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu executar um método inexistente");
                break;
            }
        }



    public static void ifSimples() {
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software
        // if = se
        // else = senão

        String modo = "extenso";
        if (modo == "curto") {
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
    }


    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de Areas Modo Curto");

        // Calculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de "
                + comprimento + "m" + ", a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de Areas Modo Extenso");

        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 30; // Largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de "
                + comprimento + "m" + ", a área é de " + resultado + "m².");
    }
}
