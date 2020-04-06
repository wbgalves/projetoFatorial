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

    public int calcularFatorialIterativo(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("Não existe fatorial de número negativo");
        int resultado = 1;
        for(int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
