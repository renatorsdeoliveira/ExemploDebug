package mobile.fasam.edu.exemplodebug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibirTela(View view) {

        int opcao = view.getId();
        Intent intent;

        switch (opcao){

            //Exibir tela MainActivity
            case R.id.btnMain:

                intent = new Intent(this,MainActivity.class);
                startActivity(intent);

                break;
            default:
                Toast.makeText(getApplicationContext(),
                        "Opcao Inválida",
                        Toast.LENGTH_LONG).show();
                break;
        }


    }
}
