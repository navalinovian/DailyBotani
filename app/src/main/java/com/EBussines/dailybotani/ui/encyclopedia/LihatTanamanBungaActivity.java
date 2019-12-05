package com.EBussines.dailybotani.ui.encyclopedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.EBussines.dailybotani.R;
import com.EBussines.dailybotani.ui.home.HomeFragment;
import com.EBussines.dailybotani.ui.profile.ProfileFragment;

public class LihatTanamanBungaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_tanaman_bunga);
    }

//
//    public void home(View view){
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//
//        HomeFragment homeFragment = (HomeFragment) getSupportFragmentManager().findFragmentByTag("HOME");
//
//        if(homeFragment != null && homeFragment.isVisible()){
//            // kosong
//        }
//
//        else {
//            // Menambah efek animasi
//            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//
//            // Menambahkan efek custom
//            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//            // Menentukan fragment yang akan dituju
//            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new HomeFragment(), "HOME");
//
//            // Untuk bisa kembali ke fragment sebelumnya
//            fragmentTransaction.addToBackStack(null);
//
//            // Menjalankan fragment
//            fragmentTransaction.commit();
//
//        }
//
//    }
////
//    public void encyclopedia(View view) {
////        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
////
////        EncyclopediaFragment encyclopediaFragment = (EncyclopediaFragment) getSupportFragmentManager().findFragmentByTag("ENCYCLOPEDIA");
////
////        if(encyclopediaFragment != null && encyclopediaFragment.isVisible()){
////            // kosong
////        }
////
////        else {
////            // Menambah efek animasi
////            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
////
////            // Menambahkan efek custom
////            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
////            // Menentukan fragment yang akan dituju
////            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new EncyclopediaFragment(), "ENCYCLOPEDIA");
////
////            // Untuk bisa kembali ke fragment sebelumnya
////            fragmentTransaction.addToBackStack(null);
////
////            // Menjalankan fragment
////            fragmentTransaction.commit();
////
////        }
//    }
//
//    public void profile(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//
//        ProfileFragment profileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag("PROFILE");
//
//        if(profileFragment != null && profileFragment.isVisible()){
//            // kosong
//        }
//
//        else {
//            // Menambah efek animasi
//            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//
//            // Menambahkan efek custom
//            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//            // Menentukan fragment yang akan dituju
//            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new ProfileFragment(), "PROFILE");
//
//            // Untuk bisa kembali ke fragment sebelumnya
//            fragmentTransaction.addToBackStack(null);
//
//            // Menjalankan fragment
//            fragmentTransaction.commit();
//
//        }
//
//    }
}
