package org.tfan.phonegap.storage;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
//        super.setIntegerProperty("splashscreen", R.drawable.splash);
//        super.setStringProperty("loadingDialog", "开始启动Apps...");
//        super.loadUrl("file:///android_asset/www/index.html", 5000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
