package com.EBussines.dailybotani.Data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.EBussines.dailybotani.R;

public class EditTanaman extends Activity implements View.OnClickListener {
    private DBDataSource dataSource;

    private long id;
    private String nama;
    private String jenis;

    private EditText edNama;
    private EditText edJenis;

    private TextView txId;

    private Button btnSave;
    private Button btnCancel;

    private Tanaman tanaman;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_data);
        //inisialisasi variabel
        edNama = (EditText) findViewById(R.id.editText_nama);
        edJenis = (EditText) findViewById(R.id.editText_jenis);
        txId = (TextView) findViewById(R.id.text_id_tanaman);
        //buat sambungan baru ke database
        dataSource = new DBDataSource(this);
        dataSource.open();
        // ambil data tanaman dari extras
        Bundle bun = this.getIntent().getExtras();
        id = bun.getLong("id");
        jenis = bun.getString("jenis");
        nama = bun.getString("nama");
        //masukkan data-data tanaman tersebut ke field editor
        txId.append(String.valueOf(id));
        edNama.setText(nama);
        edJenis.setText(jenis);
        //set listener pada tombol
        btnSave = (Button) findViewById(R.id.button_save_update);
        btnSave.setOnClickListener(this);
        btnCancel = (Button) findViewById(R.id.button_cancel_update);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            // apabila tombol save diklik (update tanaman)
            case R.id.button_save_update :
                tanaman = new Tanaman();
                tanaman.setJenis_tanaman(edJenis.getText().toString());
                tanaman.setNama_tanaman(edNama.getText().toString());
                tanaman.setId(id);
                dataSource.updateTanaman(tanaman);
                Intent i = new Intent(this, ViewData.class);
                startActivity(i);
                EditTanaman.this.finish();
                dataSource.close();
                break;
            // apabila tombol cancel diklik, finish activity
            case R.id.button_cancel_update :
                finish();
                dataSource.close();
                break;
        }
    }

}
