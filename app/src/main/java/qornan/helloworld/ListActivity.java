package qornan.helloworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<String> daftarpesertaiak = new ArrayList<>();
        daftarpesertaiak.add("Husein");
        daftarpesertaiak.add("Mufid");
        daftarpesertaiak.add("Lulu");
        daftarpesertaiak.add("Bening");
        daftarpesertaiak.add("Evy");
        daftarpesertaiak.add("Aldo");
        daftarpesertaiak.add("Fadhit");
        daftarpesertaiak.add("Fajar");
        daftarpesertaiak.add("Hisyam");
        daftarpesertaiak.add("Amran");
        daftarpesertaiak.add("Fikri");
        daftarpesertaiak.add("Fathin");
        daftarpesertaiak.add("Reza");

        ListAdapter adapter =
                new ListAdapter(
                        this, android.R.layout.simple_list_item_1,
                        daftarpesertaiak);

        ListView listpeserta;
        listpeserta = (ListView) findViewById(R.id.listkalimat);

        listpeserta.setAdapter(adapter);

        final Context activityini = this;

        listpeserta.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(activityini,
                       "clicked " + i, Toast.LENGTH_LONG).show();
            }
        });

    }
}
