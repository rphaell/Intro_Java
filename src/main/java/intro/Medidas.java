// 1 - Pacotes
package intro;

// 2 - Referência as Bibliotecas
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U    DE   O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto: ");
        System.out.println("e - Calcular Area Modo Extenso: ");
        System.out.println("i - If Simples: ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();


        // switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software

        //String opcao = "goiaba";

        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu executar um método inexistente");
            }
        }



    public static void ifSimples() {
        // Condicional = verificar uma condição - fazer uma pergunta para uma pessoa, um hardware ou software
        // if = se
        // else = senão

        String modo = "i";
        if (modo == "i") {
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
