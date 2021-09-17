public class Calculos {

    private static final String VALOR_A_PAGAR = "Valor a pagar c/ desconto: R$";
    private static final String MSG_DESC = "Desconto de: R$%s por litro\n";
    private static final String DIV = "========";

    public static float eTriangulo(float lado1, float lado2, float lado3) {

        int opcao = 1;

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo Equilátero");
                System.out.println(DIV);
            } else if ((lado1 == lado2) || (lado1 == lado3)) {
                System.out.println("Triângulo Isósceles");
                System.out.println(DIV);
            } else
                System.out.println("Triângulo Escaleno");
            System.out.println(DIV);
        } else {
            System.out.println("Não é um triângulo!");
        }
        return opcao;

    }

    public static float alcool(float preco, float litros) {
        if (litros <= 20) {
            float valorTotal = preco * litros;
            float desconto = (float) ((double) 3 / 100 * preco);
            System.out.println(DIV);
            System.out.printf(MSG_DESC, desconto);
            System.out.println(VALOR_A_PAGAR + (valorTotal - desconto));
            System.out.println(DIV);

        } else {
            float valorTotal = preco * litros;
            float desconto = (float) ((double) 5 / 100 * preco);
            System.out.println(DIV);
            System.out.printf(MSG_DESC, desconto);
            System.out.println(VALOR_A_PAGAR + (valorTotal - desconto));
            System.out.println(DIV);
        }
        return preco;
    }

    public static float gasolina(float preco, float litros) {

        if (litros <= 20) {
            float valorTotal = preco * litros;
            float desconto = (float) ((double) 4 / 100 * preco);
            System.out.println(DIV);
            System.out.printf(MSG_DESC, desconto);
            System.out.println(VALOR_A_PAGAR + (valorTotal - desconto));
            System.out.println(DIV);

            return valorTotal;

        } else {
            float valorTotal = preco * litros;
            float desconto = (float) ((double) 6 / 100 * preco);
            System.out.println(DIV);
            System.out.printf(MSG_DESC, desconto);
            System.out.println(VALOR_A_PAGAR + (valorTotal - desconto));
            System.out.println(DIV);
        }
        return preco;
    }
}