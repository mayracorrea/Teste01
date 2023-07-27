package aula6calculadora.framework;

/**
 *
 * @author jean
 */
public class Multiplicacao extends Operacao {

    public Multiplicacao(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected int executa(int esquerda, int direita) {
        return esquerda * direita;
    }

    @Override
    protected String simbolo() {
        return "*";
    }
}
