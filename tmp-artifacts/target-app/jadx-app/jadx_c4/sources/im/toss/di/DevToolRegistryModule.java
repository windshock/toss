package im.toss.di;

import android.os.Process;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import javax.inject.Singleton;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DevToolRegistryModule {
    private static int IAuthTabCallback = 0;
    public static final DevToolRegistryModule onExtraCallback = new DevToolRegistryModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 65;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    private DevToolRegistryModule() {
    }

    @Singleton
    public final Object onExtraCallbackWithResult$1ddead5a() throws Throwable {
        int i = 2 % 2;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-11449044);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26578), 8 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 11185, -837700676, false, (String) null, new Class[0]);
            }
            Object objNewInstance = ((Constructor) objOnExtraCallback).newInstance(null);
            int i2 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return objNewInstance;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
