public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv  smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Canal Atual : " + smartTv.canal);
        
        smartTv.mudarCanal(7);
        System.out.println("Canal Atual : " + smartTv.canal);
        
        System.out.println("Volume atual : " + smartTv.volum);

        System.out.println("TV Ligada ? " + smartTv.ligada);
   
        System.out.println("Volume Atual : " + smartTv.volum);



        smartTv.Ligar();
                System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);


    }
}

