package studio.uphie.one.common;

import android.app.Application;
import android.util.DisplayMetrics;

import com.facebook.FacebookSdk;

import studio.uphie.one.utils.ImageUtil;
import studio.uphie.one.utils.NetworkUtil;
import studio.uphie.one.utils.TextToast;

/**
 * Created by Uphie on 2015/9/5.
 * Email: uphie7@gmail.com
 */
public class App extends Application {

    public static DisplayMetrics displayMetrics;

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        ImageUtil.init(this);
        NetworkUtil.init(this);
        TextToast.init(this);
    }
}
