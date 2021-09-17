public class Perguntas {

    public static int detetive(int pergunta1, int pergunta2, int pergunta3, int pergunta4, int pergunta5) {
        int resultado = pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5;
        if (resultado == 5) {
            System.out.println("Possível assassino!!");
        } else if (resultado == 8) {
            System.out.println("Elemento suspeito!!");
        } else if ((resultado > 5) && (resultado < 8)) {
            System.out.println("Possível cúmplice!!");
        } else {
            System.out.println("Elemento é inocente!!");
        }
        return resultado;
    }
}
