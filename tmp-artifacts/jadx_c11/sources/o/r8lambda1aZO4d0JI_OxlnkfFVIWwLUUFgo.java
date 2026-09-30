package o;

import com.facebook.react.ReactInstanceManager;
import com.google.android.gms.internal.ads.zzgc;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda1aZO4d0JI_OxlnkfFVIWwLUUFgo {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final void onExtraCallbackWithResult(@NotNull ReactInstanceManager reactInstanceManager) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactInstanceManager, "");
        Object obj = null;
        try {
            reactInstanceManager.onWarmupCompleted();
            int i4 = onNavigationEvent + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(-727664198, zzgc.onExtraCallbackWithResult(), 727664201, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "reactInstanceManager.destroy error : " + e, null, 2, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
    }
}
