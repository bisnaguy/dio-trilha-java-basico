public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Teve ligada = "+ smartTv.ligada);
        System.out.println("Qual é o canal atual: "+ smartTv.canal);
        System.out.println("Qual é o volume: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Teve ligada = "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Teve ligada = "+ smartTv.ligada);

        int volumes = smartTv.volume;

        for(int i = 0; i < volumes; i++){
            smartTv.diminuirVolume();
            System.out.println("Qual é o volume: "+ smartTv.volume);
        }

        smartTv.mudarCanal(13);
        System.out.println("Qual é o canal atual: "+ smartTv.canal);
    }
}
