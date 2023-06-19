package com.example.rmedinasprint4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.rmedinasprint4.databinding.Activity2Binding;
import com.example.rmedinasprint4.databinding.ActivityMain2Binding;
import com.example.rmedinasprint4.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //aca esta el problema, quizas estoy inflando 2 veces

        /*setSupportActionBar(binding.topAppBar);
        //MenuInflater inflater = getMenuInflater();
        // al menu y a la barra le di el mismo nombre
        inflater.inflate(R.menu.top_app_bar, binding.topAppBar.getMenu());

        binding.topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.github) {
                    Intent intento = new Intent(Intent.ACTION_VIEW);
                    intento.setData(Uri.parse("https://github.com/RobertoMedinaP"));
                    startActivity(intento);
                    return true;
                }
                return false;
            }
        });*/

    }
}