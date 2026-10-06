public class Escritor extends Thread {
    private final char caracter;
    private final int veces;

    public Escritor(char caracter, int veces) {
        this.caracter = caracter;
        this.veces = veces;
    }

    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}