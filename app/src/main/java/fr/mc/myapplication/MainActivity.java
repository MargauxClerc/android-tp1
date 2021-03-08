package fr.mc.myapplication;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstFragment = findViewById(R.id.first_button);
        firstFragment.setOnClickListener(view ->
            getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.slide_from_bottom, 0)
                .replace(R.id.fragment_container, FirstFragment.class, null)
                .commit());
    }
}