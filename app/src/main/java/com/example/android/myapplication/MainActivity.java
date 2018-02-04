package com.example.android.myapplication;
// annisa aninditya_1202152334_si3906
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText jumlah;
    public void onEatbus(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*50000;

        b.putString("Resto","eatbus");
        b.putString("Jumlah",jumlah.getText().toString());
        b.putString("Harga",String.valueOf(harga));
        intent.putExtras(b);
        Toast.makeText(this, "Maaf uang kamu tidak cukup", Toast.LENGTH_LONG).show();


        startActivity(intent);
    }

    public void onAbnormal(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();
        jumlah = (EditText) findViewById(R.id.txt_jumlah);
        String jml = jumlah.getText().toString();
        int harga=Integer.parseInt(jml)*30000;

        b.putString("Resto","abnormal");
        b.putString("Jumlah",jumlah.getText().toString());
        b.putString("Harga",String.valueOf(harga));
        intent.putExtras(b);

        Toast.makeText(this, "Makan Malam disini aja ", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
