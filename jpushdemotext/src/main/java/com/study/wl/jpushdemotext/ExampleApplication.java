package com.study.wl.jpushdemotext;

import android.app.Application;
import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by ${WU} on 2018/5/22.
 */

public class ExampleApplication extends Application {
    private static final String TAG = "JIGUANG-Example";
    private static Context context;

    @Override
    public void onCreate() {
        Logger.d(TAG, "[ExampleApplication] onCreate");
        super.onCreate();
        context = getApplicationContext();

        JPushInterface.setDebugMode(true); 	// 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);     		// 初始化 JPush
    }

    /**
     * 获取全局上下文*/
    public static Context getContext() {
        return context;
    }
}
