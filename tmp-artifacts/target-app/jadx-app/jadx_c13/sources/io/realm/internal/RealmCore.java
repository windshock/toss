package io.realm.internal;

import android.content.Context;
import com.getkeepsafe.relinker.ReLinker;
import java.io.File;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmCore {
    private static final String IAuthTabCallback;
    private static final String onExtraCallbackWithResult;
    private static final String onNavigationEvent;
    private static boolean onWarmupCompleted;

    static {
        String str = File.separator;
        onNavigationEvent = str;
        String str2 = File.pathSeparator;
        onExtraCallbackWithResult = str2;
        IAuthTabCallback = "lib" + str2 + ".." + str + "lib";
        onWarmupCompleted = false;
    }

    public static void onWarmupCompleted(Context context) {
        synchronized (RealmCore.class) {
            if (onWarmupCompleted) {
                return;
            }
            ReLinker.onExtraCallbackWithResult(context, "realm-jni", "10.19.0");
            onWarmupCompleted = true;
        }
    }
}
