package com.example.bendahara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import static com.example.bendahara.R.id.nHasil;

public class MainActivity extends AppCompatActivity {

    private EditText nom, eKoma;
    private TextView kalimat, nhasil;
    private Button btDPP, btPPN, btPPh21,btPPh22,btPPh23,btPResto;
    int naik = 2;
    double angka,dpp,ppn,pph21,pph22,pph23,presto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nHarga);
        btDPP = findViewById(R.id.bDpp);
        btPPN = findViewById(R.id.bPPN);
        btPPh21 = findViewById(R.id.bPPh21);
        btPPh22 = findViewById(R.id.bPPh22);
        btPPh23 = findViewById(R.id.bPPh23);
        btPResto = findViewById(R.id.bPResto);
        kalimat = findViewById(R.id.Hasil);
        nhasil = findViewById(R.id.nHasil);

        btDPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = Integer.parseInt(nom.getText().toString());
                dpp = angka * 100 / 110;
                DecimalFormat df = new DecimalFormat("#,###,###");
                kalimat.setText("Nilai Dasar Pengenaan Pajak yang harus dibayar :");
                nhasil.setText(""+df.format(dpp));
            }
        });

        btPPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = Integer.parseInt(nom.getText().toString());
                dpp = angka * 100 / 110;
                ppn = dpp * 10 / 100;
                DecimalFormat df = new DecimalFormat("#,###,###");
                kalimat.setText("Nilai Pajak Pertambahan Nilai yang harus dibayar :");
                nhasil.setText(""+df.format(ppn));
            }
        });

        btPPh21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = Integer.parseInt(nom.getText().toString());
            }
        });

        btPPh22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = Integer.parseInt(nom.getText().toString());
                dpp = angka * 100 / 110;
                ppn = dpp * 10 / 100;
                pph22 = ppn * 15 / 100;
                DecimalFormat df = new DecimalFormat("#,###,###");
                kalimat.setText("Nilai Pajak Penghasilan Pasal 22 yang harus dibayar :");
                nhasil.setText(""+df.format(pph22);
            }
        });

        btPPh23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka = Integer.parseInt(nom.getText().toString());
                pph23 = angka * 2 / 100;
                DecimalFormat df = new DecimalFormat("#,###,###");
                kalimat.setText("Nilai Pajak Penghasilan Pasal 23 yang harus dibayar :");
                nhasil.setText(""+df.format(pph23));
            }
        });
    }
}