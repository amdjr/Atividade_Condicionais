public class Calculos {

    public static float eTriangulo(float lado1, float lado2, float lado3) {

        int opcao = 1;

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if ((lado1 == lado2) || (lado1 == lado3)) {
                System.out.println("Triângulo Isósceles");
            } else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não é um triângulo!");
        }
        return opcao;

    }

    public static float alcool(float preco, float litros) {
        float desconto = litros * preco * 3 / 100;
        System.out.println("Desconto de: " + desconto);
        return desconto;
    }

    public static float gasolina(float preco, float litros) {
        float desconto = litros * preco * 4 / 100;
        System.out.println("Desconto de: " + desconto);
        return desconto;
    }
}