package com.EBussines.dailybotani.ui.encyclopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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

//        Intent intent = new Intent(getActivity(), LihatTanamanBungaActivity.class);
//        startActivity(intent);
//        return inflater.inflate(R.layout.fragment_encyclopedia, container, false);

        View view = inflater.inflate(R.layout.fragment_encyclopedia,
                container, false);
        ImageView button = (ImageView) view.findViewById(R.id.bunga_kategori);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), LihatTanamanBungaActivity.class);
                startActivity(intent);


            }
        });
        return view;

    }
//
//    public void TanamanBunga(View view) {
//        Intent intent = new Intent(getActivity(), LihatTanamanBungaActivity.class);
//        startActivity(intent);
//    }



}