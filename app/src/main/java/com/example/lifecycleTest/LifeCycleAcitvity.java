package com.example.lifecycleTest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.androidknowlegereview.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LifeCycleAcitvity extends AppCompatActivity {

    private TextView tv_life;
    private ArrayList<String> lifes = new ArrayList<>();
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_acitvity);
        tv_life = findViewById(R.id.tv_life_cycle);
        lifes.add("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        lifes.add("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        lifes.add("onstop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        lifes.add("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        lifes.add("onResume");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String all = Arrays.toString(lifes.toArray());
                tv_life.setText(all);
                lifes.add("-----");
            }
        },1500);
    }


}
