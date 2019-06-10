package com.android.bittiger.janescookies.tinyflickr;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] exemples = new String[]{
            "Gat", "Gos", "Elefant", "Gamba", "Ocells", "Cotxes"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_search = (Button) findViewById(R.id.btn_buscar);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, exemples);
        final AutoCompleteTextView main_atv = (AutoCompleteTextView) findViewById(R.id.atv_1);

        main_atv.setAdapter(adapter);

        main_atv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btn_search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                    Intent canviPantalla=new Intent(MainActivity.this, GalleryActivity.class);
                    String inputImatge = main_atv.getText().toString();
                    canviPantalla.putExtra("Imatge", inputImatge);
                    startActivity(canviPantalla);

            }
        });

    }
}
