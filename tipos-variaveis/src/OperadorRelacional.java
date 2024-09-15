public class OperadorRelacional {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras!");
        }else{
            System.out.println("Fim");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira!");
        }else{
            System.out.println("Nenhuma das condições é verdadeira!");
        }
    }
}

