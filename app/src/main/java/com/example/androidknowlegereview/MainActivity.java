package com.example.androidknowlegereview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lifecycleTest.LifeCycleAcitvity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lifeCycle(View view) {
        startActivity(new Intent(this, LifeCycleAcitvity.class));
    }

}
