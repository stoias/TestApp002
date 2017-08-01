package com.example.testapp002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity {

    private EditText edit=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        edit = (EditText)findViewById(R.id.edit_text3);
        Button returnButton = (Button)findViewById(R.id.return_button3);
        TextView text =(TextView) findViewById(R.id.textSub);

        returnButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                // インテントのインスタント作成
                Intent data =new Intent();
                // インテントに値をセット
                data.putExtra("test",edit.getText().toString());
                //結果を設定
                setResult(RESULT_OK,data);
                //サブ画面の終了
                finish();
            }
        });
    }
}
