package com.EBussines.dailybotani;

//import android.os.Bundle;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        BottomNavigationView navView = findViewById(R.id.background_menu);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_encyclopedia, R.id.navigation_profile)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);
//    }
//
//}

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.EBussines.dailybotani.ui.encyclopedia.EncyclopediaFragment;
import com.EBussines.dailybotani.ui.home.HomeFragment;
import com.EBussines.dailybotani.ui.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void home(View view){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        HomeFragment homeFragment = (HomeFragment) getSupportFragmentManager().findFragmentByTag("HOME");

        if(homeFragment != null && homeFragment.isVisible()){
            // kosong
        }

        else {
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambahkan efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new HomeFragment(), "HOME");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }

    }

    public void encyclopedia(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        EncyclopediaFragment encyclopediaFragment = (EncyclopediaFragment) getSupportFragmentManager().findFragmentByTag("ENCYCLOPEDIA");

        if(encyclopediaFragment != null && encyclopediaFragment.isVisible()){
            // kosong
        }

        else {
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambahkan efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new EncyclopediaFragment(), "ENCYCLOPEDIA");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }
    }

    public void profile(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        ProfileFragment profileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag("PROFILE");

        if(profileFragment != null && profileFragment.isVisible()){
            // kosong
        }

        else {
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambahkan efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new ProfileFragment(), "PROFILE");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }

    }
}