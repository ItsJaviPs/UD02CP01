public class Main {
    public static void main(String[] args) {
        Escritor h1 = new Escritor('A', 50);
        Escritor h2 = new Escritor('B', 50);
        Escritor h3 = new Escritor('C', 50);

        h1.start();
        h2.start();
        h3.start();
    }
}