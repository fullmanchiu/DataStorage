package com.aliyeahyeah.datastorage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends BaseActivity {

    private Button btn1;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initContentView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
    }

    public void initViews() {
        btn1 = (Button) findViewById(R.id.acticity_main_btn1);
    }

    @Override
    public void initListeners() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.show(MainActivity.this, "OK" + i);
                Log.i("TOAST", "toast");
                i++;
            }
        });
    }

}
