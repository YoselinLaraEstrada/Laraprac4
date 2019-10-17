package mx.tesoem.isc.laraprac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibeParametrosactivity extends AppCompatActivity {
    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametrosactivity);

        Bundle parametros=getIntent().getExtras();
        vnombre=(TextView) findViewById(R.id.lblparametros);
        vnombre.setText("BIENVENIDO "+ parametros.getString("pnombre"));
    }
}
