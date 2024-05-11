public class Negacao {
    public static void main(String[] args) {
        boolean variavel = true;
        System.out.println(!variavel); // É false somente na memória
        variavel = !variavel;  // Agora a variavel é a negação do valor que seja
        System.out.println(variavel);
    }
}
