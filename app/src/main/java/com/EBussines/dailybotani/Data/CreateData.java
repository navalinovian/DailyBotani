package com.EBussines.dailybotani.Data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.EBussines.dailybotani.R;

public class CreateData extends Activity implements View.OnClickListener {

    // inisialisasi elemen-elemen pada layout

    private Button buttonSubmit;
    private EditText edNama;
    private EditText edJenis;

    // inialisasi kontroller / Data Source

    private DBDataSource dataSource;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_data);

        buttonSubmit = (Button) findViewById(R.id.tambah_list);
        buttonSubmit.setOnClickListener(this);

        edNama = (EditText) findViewById(R.id.edit_nama);
        edJenis = (EditText) findViewById(R.id.edit_jenis);

        // instansiasi kelas DBDataSource

        dataSource = new DBDataSource(this);

        // membuat sambungan baru ke database

        dataSource.open();

    }

    // Ketika tombol submit diklik

    @Override
    public void onClick(View view) {
        // Inisialisasi data barang

        String nama = null;
        String jenis = null;


        // inisialisasi barang baru (masih kosong)

        Tanaman tanaman = null;

        if(edNama.getText() != null && edJenis.getText() != null){
            /* jika field nama, merk, dan harga tidak kosong maka
             * masukkan ke dalam data barang */

            nama = edNama.getText().toString();
            jenis = edJenis.getText().toString();
        }

        switch (view.getId()){
            case R.id.tambah_list:

                // insert data barang baru

                tanaman = dataSource.createTanaman(nama, jenis);

                // konfirmasi kesuksesan

                Toast.makeText(this, "masuk Barang\n" +
                        "nama" + tanaman.getNama_tanaman() +
                        "jenis" + tanaman.getJenis_tanaman(),
                        Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, ViewData.class);
                startActivity(i);
                break;
        }
    }
}
