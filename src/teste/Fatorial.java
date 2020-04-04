package teste;

public class Fatorial {
    /**
     * Versão recursiva do cálculo do fatorial
     * @param n
     * @return
     */
    public int calcularFatorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("Número negativo inválido");

        if (n > 1) {
            return n * calcularFatorial(n-1);
        } 
        return 1;
    }
}
