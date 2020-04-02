package teste;

public class Fatorial {
    /**
     * Versão recursiva do cálculo do fatorial
     * @param i
     * @return
     */
    public int calcularFatorial(int i) {
        if (i > 1) {
            return i * calcularFatorial(i-1);
        } 
        return 1;
    }
}
