package com.example.my01_helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCall, btnNew;
    EditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhone = findViewById(R.id.etPhone);
        btnCall = findViewById(R.id.btnCall);
        btnNew = findViewById(R.id.btnNew);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phoneNum = "tel:"+etPhone.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNum));
                startActivity(intent);
            }
        });

        //서브화면으로 전환
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //this, MainActivity.class?
                Intent intent = new Intent(getApplicationContext(), Sub1Activity.class);
                startActivity(intent);
            }
        });
    }

    //button1 클릭
    public void onBtn1Clicked(View view){
        Toast.makeText(this, "버튼1이 눌렸습니다.", Toast.LENGTH_SHORT).show();

    }

    //button2 클릭
    public void onBtn2Clicked(View view){   
                                                            //uri로 변경
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);//시작

    }
}