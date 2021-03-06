package com.example.user.audioapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up);
        Button t = (Button)this.findViewById(R.id.signBtn);
        t.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent l = new Intent(SignUpActivity.this, ChooseActivity.class);
                startActivity(l);
                overridePendingTransition(R.anim.fade_in_two, R.anim.fade_out_two);
            }
        });
    }
    public void choose_page(View view){
        Intent startNewActivity = new Intent(this, ChooseActivity.class);
        startActivity(startNewActivity);
    }
}
