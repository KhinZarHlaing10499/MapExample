package com.example.mapexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=(ImageButton) findViewById(R.id.mapButton);
    }

    public void Map_Click(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo: 47.4925,19.0513"));
        Intent chooser =Intent.createChooser(i,"Google Maps");
        startActivity(chooser);
    }
}
