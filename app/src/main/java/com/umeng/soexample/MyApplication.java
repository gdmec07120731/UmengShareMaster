package com.umeng.soexample;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;

/**
 * Package :com.ppjun.soexample
 * Description :
 * Author :Rc3
 * Created at :2016/9/27 14:46.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    }
}
