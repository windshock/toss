package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r0e {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final r0e onExtraCallbackWithResult = new r0e();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 57;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private r0e() {
    }

    public final void onExtraCallback(@NotNull Context context, @NotNull String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        context.getSharedPreferences("widget_worker_throttle", 0).edit().putLong("last_enqueue_" + str + i, zzaj.onWarmupCompleted().IAuthTabCallbackDefault()).apply();
        int i3 = onExtraCallback + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback(@NotNull Context context, @NotNull String str, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("widget_worker_throttle", 0);
        String str2 = "last_enqueue_" + str + i;
        long j = sharedPreferences.getLong(str2, 0L);
        long jIAuthTabCallbackDefault = zzaj.onWarmupCompleted().IAuthTabCallbackDefault();
        if (jIAuthTabCallbackDefault < j) {
            sharedPreferences.edit().remove(str2).apply();
            return false;
        }
        if (jIAuthTabCallbackDefault - j >= 540000) {
            return false;
        }
        int i3 = onWarmupCompleted + 21;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 23;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onWarmupCompleted(str);
            int i3 = 99 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            TopAppBarStateExternalSyntheticLambda1.onNavigationEvent(context).onWarmupCompleted(str);
        }
        int i4 = onWarmupCompleted + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean onNavigationEvent(@NotNull Context context) {
        boolean zIsInteractive;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Object systemService = context.getSystemService("power");
            Intrinsics.checkNotNull(systemService, "");
            zIsInteractive = ((PowerManager) systemService).isInteractive();
            int i3 = 84 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Object systemService2 = context.getSystemService("power");
            Intrinsics.checkNotNull(systemService2, "");
            zIsInteractive = ((PowerManager) systemService2).isInteractive();
        }
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zIsInteractive;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
