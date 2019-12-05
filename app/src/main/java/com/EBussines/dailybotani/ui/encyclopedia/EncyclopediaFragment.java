package com.EBussines.dailybotani.ui.encyclopedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.EBussines.dailybotani.R;

public class EncyclopediaFragment extends Fragment {

//    private EncyclopediaViewModel encyclopediaViewModel;
//
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        encyclopediaViewModel =
//                ViewModelProviders.of(this).get(EncyclopediaViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_encyclopedia, container, false);
//        final TextView textView = root.findViewById(R.id.text_encyclopedia);
//        encyclopediaViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
//    }


    public EncyclopediaFragment(){

    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_encyclopedia, container, false);
    }
}