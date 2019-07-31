package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button btn_go_to_main;
    private EditText ed_enter_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_go_to_main = findViewById(R.id.btn_go_to_Main);
        ed_enter_name = findViewById(R.id.ed_name);

        btn_go_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendBackName();
            }
        });
    }

    public void sendBackName(){

        Intent intent = new Intent();
        intent.putExtra("result", ed_enter_name.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
