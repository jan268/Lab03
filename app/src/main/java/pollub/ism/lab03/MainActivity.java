package pollub.ism.lab03;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Uchwyty widoków
    private EditText wiadomoscWychodzaca = null, wiadomoscPrzychodzaca = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Podłaczenie uchwytów
        wiadomoscWychodzaca = (EditText) findViewById(R.id.wiadomoscWysylanie);
        wiadomoscPrzychodzaca = (EditText) findViewById(R.id.wiadomoscOdbieranie);

        wiadomoscPrzychodzaca.setEnabled(false);
    }

    public void uruchomDruga(View view){

    }

    public void uruchomTrzecia(View view){
        Intent intencja = new Intent(this, TrzeciaAktywnosc.class);
        startActivity(intencja);
    }
}