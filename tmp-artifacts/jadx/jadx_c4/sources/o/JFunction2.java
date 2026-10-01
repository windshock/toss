package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface JFunction2 {
    <T> void onExtraCallbackWithResult(@NotNull String str, @NotNull T t, boolean z);

    <T> T onWarmupCompleted(@NotNull String str, @NotNull T t);

    static /* synthetic */ void onNavigationEvent(JFunction2 jFunction2, String str, Object obj, boolean z, int i, Object obj2) {
        int i2 = 2 % 2;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        jFunction2.onExtraCallbackWithResult(str, obj, z);
    }
}
