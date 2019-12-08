package com.EBussines.dailybotani.Data;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.EBussines.dailybotani.R;
import com.EBussines.dailybotani.ui.home.HomeFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ViewData extends ListActivity implements AdapterView.OnItemLongClickListener {

    // inisialisasi kontroller
    private DBDataSource dataSource;

    // inisialisasi arraylist
    private ArrayList<Tanaman> values;
    private Button editButton;
    private Button delButton;



    public void nambah(View view) {
        Intent intent = new Intent(this, CreateData.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tanaman);
        dataSource = new DBDataSource(this);

        // buka kontroller

        dataSource.open();;

        // ambil semua data tanaman

        values = dataSource.getAllTanaman();

        // masukkan data tanaman ke array adapter

        ArrayAdapter<Tanaman> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);

        // set adapter pada list

        setListAdapter(adapter);

        // mengambil listview untuk diset onItemLongClickListener
        ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setOnItemLongClickListener(this);

    };


    @Override
    public boolean onItemLongClick(final AdapterView<?> adapter, View v, int pos, final long id) {


        // tampilkan alert dialog
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_view);
        dialog.setTitle("Pilih Aksi");
        dialog.show();
        final Tanaman b = (Tanaman) getListAdapter().getItem(pos);
        editButton = (Button) dialog.findViewById(R.id.button_edit_data);
        delButton = (Button) dialog.findViewById(R.id.button_delete_data);

        // apabila tombol edit diklik

        editButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        switchToEdit(b.getId());
                    }
                }
        );


        // apabila tombol delete di klik

        delButton.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        // Delete tanaman
                        dataSource.deleteTanaman(b.getId());
                        dialog.dismiss();
                        finish();
                        startActivity(getIntent());
                    }
                }
        );

        return true;
    }

    private void tambahTanaman() {

        Intent intent = new Intent(this, CreateData.class);
        startActivity(intent);
    }

    // method untuk edit data
    public void switchToEdit(long id){
        Tanaman b = dataSource.getTanaman(id);
        Intent i = new Intent(this, EditTanaman.class);
        Bundle bun = new Bundle();
        bun.putLong("id", b.getId());
        bun.putString("nama", b.getNama_tanaman());
        bun.putString("jenis", b.getJenis_tanaman());
        i.putExtras(bun);
        finale();
        startActivity(i);
    }

    // method yang dipanggil ketika edit data selesai

    private void finale() {

        ViewData.this.finish();
        dataSource.close();
    }

    @Override
    protected void onResume(){
        dataSource.open();
        super.onResume();
    }

    @Override
    protected void onPause(){
        dataSource.close();
        super.onPause();
    }

}
