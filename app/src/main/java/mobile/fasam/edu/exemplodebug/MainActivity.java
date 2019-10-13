package mobile.fasam.edu.exemplodebug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibir(View view) {
        txtNome = findViewById(R.id.txtNome);
        txtTelefone = findViewById(R.id.txtTelefone);

        String nome, telefone;
        nome = txtNome.getText().toString();
        telefone = txtTelefone.getText().toString();

        String dados = String.format("Os dados digitados foram %s %s", nome, telefone);

        Toast.makeText(getApplicationContext(),dados,Toast.LENGTH_LONG).show();


    }
}
