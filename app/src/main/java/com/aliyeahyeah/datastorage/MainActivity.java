package com.aliyeahyeah.datastorage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends BaseActivity {

    private Button btn_sp, btn_io, btn_sql, btn_cp, btn_net;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initContentView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
    }

    public void initViews() {
        btn_sp = (Button) findViewById(R.id.acticity_main_btn_sp);
        btn_io = (Button) findViewById(R.id.acticity_main_btn_io);
        btn_sql = (Button) findViewById(R.id.acticity_main_btn_sql);
        btn_cp = (Button) findViewById(R.id.acticity_main_btn_cp);
        btn_net = (Button) findViewById(R.id.acticity_main_btn_net);
    }

    @Override
    public void initListeners() {
        View.OnClickListener btn_listener_sp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,SharedPreferencesActivity.class);
                startActivity(IntentFactory.getSpIntent(MainActivity.this));
            }
        };
        View.OnClickListener btn_listener_io = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener btn_listener_sql = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener btn_listener_cp = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        View.OnClickListener btn_listener_net = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        btn_sp.setOnClickListener(btn_listener_sp);
        btn_io.setOnClickListener(btn_listener_io);
        btn_sql.setOnClickListener(btn_listener_sql);
        btn_cp.setOnClickListener(btn_listener_cp);
        btn_net.setOnClickListener(btn_listener_net);

    }


}
