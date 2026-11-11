package com.example.karyawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;

public class Gaji_Diki extends AppCompatActivity {
    EditText edNama, edGaji, edTunjangan, edHari, edMakan,
    edTransportasi, edGajiK, edgajiB;

    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_diki);

        edNama = findViewById(R.id.edNama);
        edGaji = findViewById(R.id.edGajiP);
        edTunjangan = findViewById(R.id.edTunjangan);
        edHari = findViewById(R.id.edKerja);
        edMakan = findViewById(R.id.edMakan);
        edTransportasi = findViewById(R.id.edTransportasi);
        edGajiK = findViewById(R.id.edGajiK);
        edgajiB = findViewById(R.id.edGajiB);

        btHitung = findViewById(R.id.btHitung);

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            long gaji = Long.parseLong(edGaji.getText().toString());
            long Tunjangan = Long.parseLong((edTunjangan.getText().toString()));
            long HariK     = Long.parseLong(edHari.getText().toString());

            long TunjanganMakan = HariK * 10000;
            long Jtransportasi = 5000 * HariK;
            long GajiKotor    = gaji + Tunjangan + TunjanganMakan + Jtransportasi;
            long GajiBersih   = GajiKotor -(GajiKotor * 10/100);

                NumberFormat rp = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

            edMakan.setText(rp.format(TunjanganMakan));
            edTransportasi.setText(rp.format(Jtransportasi));
            edGajiK.setText(rp.format(GajiKotor));
            edgajiB.setText(rp.format(GajiBersih));

            }
        });



    }
}