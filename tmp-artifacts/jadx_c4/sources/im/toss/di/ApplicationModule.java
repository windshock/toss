package im.toss.di;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import im.toss.TossApplication;
import java.lang.reflect.Field;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.zzax;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ApplicationModule {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final ApplicationModule onExtraCallbackWithResult = new ApplicationModule();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 83;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private ApplicationModule() {
    }

    @Singleton
    public final zzax onNavigationEvent(@NotNull Context context) {
        TossApplication tossApplication;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            tossApplication = (TossApplication) context;
            int i3 = 56 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            tossApplication = (TossApplication) context;
        }
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return tossApplication;
    }

    @Singleton
    public final Object IAuthTabCallback$128544c1() throws IllegalAccessException, IllegalArgumentException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-833316231);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27430), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, TextUtils.lastIndexOf("", '0', 0) + 19463, -15440663, false, "onNavigationEvent", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        int i4 = onExtraCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }
}
