package co.edu.ucc.mvp.domain;

/**
 * Created by luz Edith on 10-Mar-18.
 */

public class InteractorOperaciones implements IInteractorOperaciones {

    @Override
    public String concatenar(String a, String b) {
        return a + " " + b;
    }

    public int diferencia(int sustraendo, int minuendo) {
        return minuendo - sustraendo;
    }

}
