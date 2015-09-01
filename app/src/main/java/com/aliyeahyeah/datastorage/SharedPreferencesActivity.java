package com.aliyeahyeah.datastorage;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPreferencesActivity extends BaseActivity {
    private TextView tv_output;
    private EditText et_name, et_age;
    private Button btn_write, btn_read;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initContentView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_shared_preferences);
    }

    @Override
    public void initViews() {
        et_name = (EditText) findViewById(R.id.activity_sp_et_input_name);
        et_age = (EditText) findViewById(R.id.activity_sp_et_input_age);
        tv_output = (TextView) findViewById(R.id.activity_sp_tv_out);
        btn_write = (Button) findViewById(R.id.activity_sp_btn_write);
        btn_read = (Button) findViewById(R.id.activity_sp_btn_read);
    }

    @Override
    public void initListeners() {
        View.OnClickListener sp_write = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("test", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                String name = et_name.getText().toString();
                String age = et_age.getText().toString();
                editor.putString("name", name);
                editor.putString("age", age);
                editor.commit();
            }
        };
        View.OnClickListener sp_read = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("test", Context.MODE_PRIVATE);
                String name = sp.getString("name", "null");
                String age = sp.getString("age", "null");
                tv_output.setText("name:" + name + "age:" + age);
            }
        };

        btn_write.setOnClickListener(sp_write);
        btn_read.setOnClickListener(sp_read);
    }


}
