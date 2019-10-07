package com.verbosetech.yoohoo;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.vanniktech.emoji.EmojiManager;
import com.vanniktech.emoji.google.GoogleEmojiProvider;
import com.verbosetech.yoohoo.receivers.ConnectivityReceiver;

/**
 * Created by mayank on 11/2/17.
 */

public class BaseApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        ConnectivityReceiver.init(this);
        //
        // Fabric.with(this, new Crashlytics());
        EmojiManager.install(new GoogleEmojiProvider());

        String admobAppId = "ca-app-pub-5439869944421168~4174567044";
        /*if (!TextUtils.isEmpty(admobAppId))
           // MobileAds.initialize(this, admobAppId);
    }*/
    }
}
