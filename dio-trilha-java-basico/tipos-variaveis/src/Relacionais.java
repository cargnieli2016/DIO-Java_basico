public class Relacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        String nomeUm = "Donizt";
        String nomeDois = "Donizt";
        System.out.println("Nome um é igual a nome dois? " + nomeUm.equals(numero2));

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira!");
        } 

        System.out.println("Numero Um é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Número um é diferente de número 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Número 1 é maior que número 2? " + simNao);

    }
}
