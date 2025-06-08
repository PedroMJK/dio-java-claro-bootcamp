public class SmartTv {
    // Attributes
    boolean ligada = false;
    int canal = 1;
    int volum = 25;

    // Methods
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volum++;
        System.out.println("Volume aumentando em : " + volum);
    }

    public void diminuirVolume() {
        volum--;
        System.out.println("Volume aumentando em : " + volum);
    }

    public void Ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}
