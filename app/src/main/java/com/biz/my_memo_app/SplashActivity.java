package com.biz.my_memo_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        // 처음 App이 실행되면서 Main화면이 나올때까지 딜레이되는 코드를 작성

        // 스플래쉬를 강제로 2초간 보여주기
        try {
            Thread.sleep( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 딜레이 코드가 완료되면 MainActivity를 띄우고
        // 자신(Splash) 종료

        startActivity(new Intent( SplashActivity.this, MainActivity.class )) ;
        finish();
    }
}
