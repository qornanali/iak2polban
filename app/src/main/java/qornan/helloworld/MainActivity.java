package qornan.helloworld;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);

        txt.setText("Indonesia Android Kejar 2");
        txt2.setText("0");

        Button btn;
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("Hello World");
            }
        });

        Button btn2;
        btn2 = (Button) findViewById(R.id.tambah);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = txt2.getText().toString();
                int counter = Integer.parseInt(text);
                txt2.setText(counter+1 + "");
            }
        });


        tambah();
    }

    public void tambah(){
    }
}
