package com.example.testapp002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button returnButton = (Button)findViewById(R.id.return_button);
        TextView text =(TextView) findViewById(R.id.textSub);


        //インテント取得
        Intent intent = getIntent();
        //インテントに保存されたデータを取得
        String data = intent.getStringExtra("keyword");
        text.setText(data);

        returnButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                finish();
            }
        });
    }
}
