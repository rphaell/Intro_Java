// 1 - Pacotes
package intro;

// 2 - Referência as Bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Bom dia");
        System.out.println("Cálculo de Areas");

    }

    public void CalcularAreaModoExtenso(){
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // Largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de "
                + comprimento + "m" + ", a área é de " + resultado + "m².");
    }

    public void calcularAreaModoCompacto(){
        int largura = 10;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m" + " e o comprimento de "
                + comprimento + "m" + ", a área é de " + largura * comprimento + "m².");
    }
}
