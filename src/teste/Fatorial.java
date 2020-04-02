package teste;

public class Fatorial {
    /**
     * Vers�o recursiva do c�lculo do fatorial
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
