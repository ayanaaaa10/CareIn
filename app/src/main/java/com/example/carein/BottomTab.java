package com.example.carein;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomTab extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_tab);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment selectedFragment = null;

                // Check which item was clicked and create the corresponding fragment
                switch (item.getItemId()) {
                    case R.id.menu_item1:
                        selectedFragment = new MainActivity(); // Replace with your fragment class
                        break;
                    case R.id.menu_item2:
                        selectedFragment = new MainActivity(); // Replace with your fragment class
                        break;
                    case R.id.menu_item3:
                        selectedFragment = new MainActivity(); // Replace with your fragment class
                        break;
                    case R.id.menu_item4:
                        selectedFragment = new MainActivity(); // Replace with your fragment class
                        break;
                }

                // Replace the fragment within the fragmentContainer
                if (selectedFragment != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragmentContainer, selectedFragment);
                    // Do not add to back stack
                    transaction.commit();
                }

                return true;
            }
        });


        // Initially, set the first fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MainActivity()).commit();

    }
}
