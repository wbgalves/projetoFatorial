package teste;

public class Fatorial {
    /**
     * Vers�o recursiva do c�lculo do fatorial
     * @param n
     * @return
     */
    public int calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("N�mero negativo inv�lido");

        if (n > 1) {
            return n * calcularFatorial(n-1);
        } 
        return 1;
    }
}
