package mobile.fasam.edu.exemplodebug;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProfessorActivity extends DebugActivity {
    EditText txtNome;
    EditText txtEmail;
    EditText txtTelefone;
    EditText txtMatricula;
    ListView listView;

    List<HashMap<String,String>> listaProfessor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
    }

    public void adicionarProfessor(View view) {
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtMatricula = findViewById(R.id.txtMatricula);

        String nome, email, telefone, matricula;

        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtTelefone.getText().toString();
        matricula = txtMatricula.getText().toString();

        String dados = String.format("Os dados adicionados foram", nome, email, telefone, matricula);

        HashMap<String,String> map = new HashMap<>();
        map.put("nome",nome);
        map.put("email",email);
        map.put("telefone",telefone);
        map.put("matricula",matricula);

        listaProfessor.add(map);

        String[] de = {"nome","email","telefone","matricula"};
        int[] para = {R.id.labelNome, R.id.LabelEmail, R.id.LabelTelefone, R.id.LabelMatricula};

        SimpleAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                listaProfessor,
                R.layout.professor,
                de,
                para
        );

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
