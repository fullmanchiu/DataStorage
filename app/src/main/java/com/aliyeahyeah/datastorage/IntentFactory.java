package com.aliyeahyeah.datastorage;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Castor on 2015/9/2.
 */
public class IntentFactory {
    /**
     * 获取跳转到SP界面的Intent
     * @param context 上一个界面
     * @return 返回组装好的intent
     */
    public static Intent getSpIntent(Context context){
        Intent intent = new Intent(context,SharedPreferencesActivity.class);
        return intent;
    }
//    public static void startSpActicity(Context context){
//
//    }

}
