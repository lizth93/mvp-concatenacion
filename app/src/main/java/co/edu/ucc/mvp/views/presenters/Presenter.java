package co.edu.ucc.mvp.views.presenters;

import co.edu.ucc.mvp.domain.IInteractorOperaciones;
import co.edu.ucc.mvp.domain.InteractorOperaciones;
import co.edu.ucc.mvp.views.activities.IView;

/**
 * Created by luz Edith on 10-Mar-18.
 */

public class Presenter implements IPresenter {

    private IView view;
    private IInteractorOperaciones operaciones;

    public Presenter(IView view) {
        this.view = view;
        operaciones = new InteractorOperaciones();
    }

    @Override
    public void formatearDatos(String a, String b, int sustraendo, int minuendo)
    {
        try {
            String resultConcatenar = operaciones.concatenar(a, b);
            int diferencia = operaciones.diferencia(sustraendo, minuendo);

            view.mostrarResultado(resultConcatenar,diferencia);
        } catch (Exception e) {
            view.mostrarError(e.getMessage());
        }
    }
}
