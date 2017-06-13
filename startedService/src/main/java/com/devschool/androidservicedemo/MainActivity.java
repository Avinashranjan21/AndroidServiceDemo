package com.devschool.androidservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_startService)
    Button btnStartService;
    @BindView(R.id.btn_stopService)
    Button btnStopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_startService, R.id.btn_stopService})
    public void onViewClicked(View view) {
        Intent mStartedServiceIntent = new Intent(this,StartedServiceClass.class);
        switch (view.getId()) {
            case R.id.btn_startService:
                startService(mStartedServiceIntent);
                break;
            case R.id.btn_stopService:
                stopService(mStartedServiceIntent);
                break;
        }
    }
}
