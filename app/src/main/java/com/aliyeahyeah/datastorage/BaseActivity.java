package com.aliyeahyeah.datastorage;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Castor on 2015/9/1.
 * BaseActivity
 */
public abstract class BaseActivity extends Activity {

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStyle();
        initContentView(savedInstanceState);
        initViews();
        initListeners();
    }

    /**
     * 设置Avtivity的一些风格
     */
    private void initStyle(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    /**
     *
     * @param savedInstanceState
     */
    protected abstract void initContentView(Bundle savedInstanceState);

    /**
     *
     */
    public abstract void initViews();

    /**
     *
     */
    public abstract void initListeners();
}
