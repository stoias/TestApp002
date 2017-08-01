package com.example.testapp002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {

    private Button sendButton2,retun_button2;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setScreenMain();
    }
    private void setScreenMain(){
        setContentView(R.layout.activity_main);

        Button sendButton = (Button)findViewById(R.id.send_button);
        final EditText editText =(EditText)findViewById(R.id.edit_text);
        sendButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // インテントのインスタンス生成
                Intent intent = new Intent(getApplication(),SubActivity.class);
                // インテントに値セット
                intent.putExtra("keyword",editText.getText().toString());
                startActivity(intent);
            }
        });

        sendButton2 = (Button)findViewById(R.id.send_button2);
        sendButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setScreenSub();
            }
        });

        textView = (TextView)findViewById(R.id.textview);
        Button sendButton3 =(Button)findViewById(R.id.send_button3);
        sendButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // インテントのインスタンス生成
                Intent intent = new Intent(getApplication(),Sub2Activity.class);
                // 画面呼び出し
                startActivityForResult(intent,001);
            }
        });

    }

    private void setScreenSub(){
        setContentView(R.layout.activity_sub2);
        retun_button2 = (Button)findViewById(R.id.return_button2);
        retun_button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setScreenMain();
            }
        });

    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        // requestCodeがサブ画面化確認する
        if(requestCode == 001){
            // resultCodeがOKか確認する
            if(resultCode == RESULT_OK){
                // 結果を取得して表示
                textView.setText(data.getCharSequenceExtra("test"));

            }
        }
    }

}
