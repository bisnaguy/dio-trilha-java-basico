public class OperadorRelacional {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        String nomeUm = "Gabriel";
        String nomeDois = new String("Gabriel");

        System.out.println(nomeUm.equals(nomeDois));
        

        String resultado = numero1 == numero2 ? "verdadeira":"Falsa";

        System.out.println("Essa condição é "+resultado);

        boolean simNao = numero1 > numero2;

        System.out.println("numeorUm é Maior a numeroDois: "+simNao);
    }
}

