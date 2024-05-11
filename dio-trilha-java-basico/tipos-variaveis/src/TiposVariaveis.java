public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        int numero = 5;
        numero = 10;
        System.out.println("O número agora vale: " + numero + " antes valia 5! :-)");

       final double VALOR_DE_PI = 3.1415;
        System.out.println("O valor de PI é: " + VALOR_DE_PI);
        
        double resultado = (10 * 7 ) + (20 / 4);
        System.out.println(resultado);
        
    }
}
