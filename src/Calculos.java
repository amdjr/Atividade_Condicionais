public class Calculos {

    private static final String DESCONTO = "Desconto de: ";

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
        if (litros <= 20) {
            float desconto = litros * preco * 3 / 100;
            System.out.println(DESCONTO + desconto);
            return desconto;

        } else {
            float desconto = litros * preco * 5 / 100;
            System.out.println(DESCONTO + desconto);
        }
        return preco;
    }

    public static float gasolina(float preco, float litros) {
        if (litros <= 20) {
            float desconto = litros * preco * 4 / 100;
            System.out.println(DESCONTO + desconto);
            return desconto;

        } else {
            float desconto = litros * preco * 6 / 100;
            System.out.println(DESCONTO + desconto);
        }
        return preco;
    }
}