
public class Comentarios {
    public static void main(String[] args) {
        // Olá, seu sou um comentário em uma única linha

            /* Olá,
            * Eu sou um comentario
            * que posso ser mais detalhadod
             * quando necessário
            */

    }

    /** 
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */
    public void metodo(){}

    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */
public int somaMultiplica (int n, int x, String m){ // soma ou multiplica??
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}
    }
