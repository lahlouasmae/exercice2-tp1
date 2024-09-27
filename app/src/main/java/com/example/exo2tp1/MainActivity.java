package com.example.exo2tp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    private EditText adresse;
    private EditText surface;
    private EditText nbe;
    private CheckBox cb;
    private Button calcul;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.ed1);
        adresse = findViewById(R.id.ed2);
        surface = findViewById(R.id.ed3);
        nbe = findViewById(R.id.ed4);
        cb = findViewById(R.id.cb);
        calcul = findViewById(R.id.bt);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        calcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double surfaceValue = Double.parseDouble(surface.getText().toString());


                double impotDeBase = surfaceValue * 2;
                tv1.setText("Impôt de base: " + impotDeBase);

                double impotSupplementaire;
                if (cb.isChecked()) {
                    impotSupplementaire = Double.parseDouble(nbe.getText().toString()) * 50 + 100;
                } else {
                    impotSupplementaire = Double.parseDouble(nbe.getText().toString()) * 50;
                }
                tv2.setText("Impôt supplémentaire: " + impotSupplementaire);


                double impotTotal = impotDeBase + impotSupplementaire;
                tv3.setText("Impôt Total: " + impotTotal);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
