public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("A TV está em qual volume? " + smartTv.volume);
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("A TV está em qual canal? " + smartTv.canal);
        System.out.println("A TV está em qual volume? " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Novo status -> A TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> A TV desligada? " + smartTv.ligada);
    }
}
