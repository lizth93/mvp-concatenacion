package co.edu.ucc.mvp.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import co.edu.ucc.mvp.R;
import co.edu.ucc.mvp.views.presenters.IPresenter;
import co.edu.ucc.mvp.views.presenters.Presenter;

public class MainActivity extends AppCompatActivity implements IView {

    @BindView(R.id.txtNum1)
    EditText txtNum1;

    @BindView(R.id.txtNum2)
    EditText txtNum2;

    @BindView(R.id.btnSumar)
    Button btnSumar;
    // agregado
    @BindView(R.id.txtYear)
    EditText txtYear;
    //agregado
    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new Presenter(this);
    }

    @OnClick(R.id.btnSumar)
    public void onClickSumar() {
        String nombre = String.valueOf(txtNum1.getText().toString());
        String apellido = String.valueOf(txtNum2.getText().toString());
        int sustraendo = Integer.parseInt(txtYear.getText().toString());
        int minuendo = 2018;

        presenter.formatearDatos(nombre,  apellido, sustraendo, minuendo);

    }

    public void mostrarError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void mostrarResultado(String resultNombres, int diferencia) {
        Toast.makeText(this,
                "Bienvenid@:" + resultNombres + " Con edad: " + diferencia, Toast.LENGTH_SHORT).show();
    }

}
