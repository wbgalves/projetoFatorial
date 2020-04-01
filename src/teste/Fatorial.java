package teste;

public class Fatorial {
    private static int calcularFatorial(int i) {
        if (i > 1) {
            return i * calcularFatorial(i-1);
        } 
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(Fatorial.calcularFatorial(5));
    }

}
