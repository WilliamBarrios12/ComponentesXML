package com.example.componentesxml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout home;
    BottomNavigationView btn_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImagenFragment imag = new ImagenFragment();
        SpinnerFragment spin = new SpinnerFragment();
        loadFragment(imag);
        home =findViewById(R.id.home);
        btn_navigation = findViewById(R.id.btn_navigation);

        btn_navigation.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.imagen_nav){
                    loadFragment(imag);
                    return true;
                } else if (item.getItemId() == R.id.spinner_nav) {
                    loadFragment(spin);
                    return true;
                }
                return false;
            }
        });
    }
    public void loadFragment(Fragment fr){
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.home, fr);
        tr.commit();
    }

}