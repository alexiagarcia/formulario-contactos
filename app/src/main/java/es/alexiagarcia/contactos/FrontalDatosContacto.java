package es.alexiagarcia.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FrontalDatosContacto extends AppCompatActivity {

    String c_nombre, c_descripcion, c_telefono,  c_email;
    TextView nombre, telefono, email, descripcion,fecha;
    int dia,mes,anio;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_frontal);

        Bundle parametro=getIntent().getExtras();
        c_nombre = parametro.getString("nombre_contacto");
        c_telefono = parametro.getString("numero_telefono");
        c_email = parametro.getString("email");
        c_descripcion = parametro.getString("descripcion_contacto");
        dia = parametro.getInt("dia");
        mes= parametro.getInt("mes");
        anio=parametro.getInt("anio");

        nombre = (TextView) findViewById(R.id.tvnombre);
        telefono = (TextView) findViewById(R.id.tvtelefono);
        email = (TextView) findViewById(R.id.tvemail);
        descripcion = (TextView) findViewById(R.id.tvdescripcion);
        fecha = (TextView) findViewById(R.id.tvfecha);
        back = (Button) findViewById(R.id.btback);

        nombre.setText(c_nombre);
        telefono.setText(c_telefono);
        fecha.setText(dia + "/ "+ mes + "/ " + anio);
        email.setText(c_email);
        descripcion.setText(c_descripcion);

        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                finish();
            }
        });


    }
}
