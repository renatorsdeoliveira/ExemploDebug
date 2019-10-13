package mobile.fasam.edu.exemplodebug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoActivity extends DebugActivity {

    EditText txtNomeAluno;
    EditText txtN1;
    EditText txtN2;
    EditText txtN3;
    ListView listView;

    List<HashMap<String,String>> listaAluno = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
    }

    public void adicionarAluno(View view) {
        txtNomeAluno = findViewById(R.id.txtNomeAluno);
        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        txtN3 = findViewById(R.id.txtN3);

        String nomeAluno, n1, n2, n3;

        nomeAluno = txtNomeAluno.getText().toString();
        n1 = txtN1.getText().toString();
        n2 = txtN2.getText().toString();
        n3 = txtN3.getText().toString();

        String dados = String.format("Os dados adicionados foram", nomeAluno, n1, n2, n3);

        HashMap<String,String> map = new HashMap<>();
        map.put("nomeAluno", nomeAluno);
        map.put("n1", n1);
        map.put("n2",n2);
        map.put("n3",n3);

        listaAluno.add(map);

        String[] de = {"nomeAluno","n1","n2","n3"};
        int[] para = {R.id.labelNomeAluno, R.id.LabelN1, R.id.LabelN2, R.id.LabelN3};

        SimpleAdapter adapter = new SimpleAdapter(
                getApplicationContext(),
                listaAluno,
                R.layout.aluno,
                de,
                para
        );

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }
}
