package dev.bc4.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgResult,btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgResult = findViewById(R.id.imgResult);
        btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Bundle dados = getIntent().getExtras();
        int number = dados.getInt("numero");

        if(number == 0){
            imgResult.setImageResource(R.drawable.moeda_cara);
        }else{
            imgResult.setImageResource(R.drawable.moeda_coroa);
        }

    }
}