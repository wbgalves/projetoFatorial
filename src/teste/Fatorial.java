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

    public int calcularFatorialIterativo(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("N�o existe fatorial de n�mero negativo");
        int resultado = 1;
        for(int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
