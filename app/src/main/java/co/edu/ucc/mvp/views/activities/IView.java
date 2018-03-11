package co.edu.ucc.mvp.views.activities;

/**
 * Created by luz Edith on 10-Mar-18.
 */

public interface IView {

    void onClickSumar();

    void mostrarError(String msg);

    void mostrarResultado(String resultNombres, int diferencia);

}
