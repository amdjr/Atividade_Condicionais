import java.time.Year;
import java.util.Scanner;

public class Principal {
    private static final String RESPOSTA = "[1]-Sim | [2]-Não";
    private static final String LADO = "Digite o tamanho do lado: ";

    public static void main(String[] args) {

        System.out.println("Atividade 7\n========");

        try {
            System.out.println(
                    "Escolha o exercício: \n[1] - Exercício 1 (Triângulos)\n[2] - Exercício 2 (Ano Bissexto)\n[3] - Exercício 3 (Detetive)\n[4] - Exercício 4 (Posto)");
            Scanner teclado = new Scanner(System.in);
            int op = teclado.nextInt();

            if (op == 1) {
                System.out.println(LADO);
                Float num1 = teclado.nextFloat();
                System.out.println(LADO);
                Float num2 = teclado.nextFloat();
                System.out.println(LADO);
                Float num3 = teclado.nextFloat();

                Calculos.eTriangulo(num1, num2, num3);
                teclado.close();

            } else if (op == 2) {
                System.out.println("Digite um ano");
                Long ano1 = teclado.nextLong();

                if ((Year.isLeap(ano1))) {
                    System.out.println("Ano bissexto");
                    teclado.close();
                } else
                    System.out.println("Ano não bissexto");

            } else if (op == 3) {
                System.out.println("Telefonou para a vítima?");
                System.out.println(RESPOSTA);
                int pergunta1 = teclado.nextInt();
                System.out.println("Esteve no local do crime?");
                int pergunta2 = teclado.nextInt();
                System.out.println("Mora perto da vítima?");
                int pergunta3 = teclado.nextInt();
                System.out.println("Devia para a vítima?");
                int pergunta4 = teclado.nextInt();
                System.out.println("Já trabalhou com a vítima?");
                int pergunta5 = teclado.nextInt();

                Perguntas.detetive(pergunta1, pergunta2, pergunta3, pergunta4, pergunta5);
                teclado.close();

            } else if (op == 4) {
                System.out.println("Qual o tipo de combustível?");
                System.out.println("Digite: [G]-Gasolina | [A]-Álcool");
                String tipo = teclado.next();
                if (tipo != null && tipo.equalsIgnoreCase("G")) {
                    System.out.println("Qual preço do combustível?");
                    float preco = teclado.nextFloat();
                    System.out.println("Quantos litros?");
                    float litros = teclado.nextFloat();

                    Calculos.gasolina(preco, litros);

                } else if (tipo != null && tipo.equalsIgnoreCase("A")) {
                    System.out.println("Qual preço do combustível?");
                    float preco = teclado.nextFloat();
                    System.out.println("Quantos litros?");
                    float litros = teclado.nextFloat();

                    Calculos.alcool(preco, litros);

                } else
                    System.out.println("Ocorreu um erro.");
            }
        } catch (Exception ex) {
            System.out.println("Digito incorreto. Programa encerrado");
        }
    }
}