package com.aliyeahyeah.datastorage;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Castor on 2015/9/1.
 * 吐司类的简单封装
 */
public class ToastUtil {

    private static Toast toast =null;

    public static void show(Context context,String content){
        if(toast == null){
            toast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }   else{
            toast.setText(content);
        }
       toast.show();
    }

}
