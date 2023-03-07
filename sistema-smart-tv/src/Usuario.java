public class Usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " +smartTv.volume);

        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual : " +smartTv.canal);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        
        System.out.println("Volume Atual : " +smartTv.volume);

  
        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);


    }
}

