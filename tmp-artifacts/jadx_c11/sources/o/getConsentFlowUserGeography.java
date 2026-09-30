package o;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getConsentFlowUserGeography {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final void onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 ^ 63) + ((i2 & 63) << 1);
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            DERSet.onExtraCallback.onContextAvailable();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (DERSet.onExtraCallback.onContextAvailable()) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (Build.VERSION.SDK_INT >= 34) {
                int i6 = onWarmupCompleted;
                int i7 = (i6 ^ 11) + ((i6 & 11) << 1);
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                view.setAccessibilityDataSensitive(1);
            }
        }
        int i9 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull Activity activity, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = (i2 & 119) + (i2 | 119);
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Object[] objArr = {DERSet.onExtraCallback};
        int iOnExtraCallback = getKekid.onExtraCallback();
        if (((Boolean) DERSet.onExtraCallback(499656961, objArr, -499656928, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback)).booleanValue()) {
            int i5 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (Build.VERSION.SDK_INT >= 31) {
                int i7 = onExtraCallbackWithResult;
                int i8 = ((i7 | 31) << 1) - (i7 ^ 31);
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                activity.getWindow().setHideOverlayWindows(z);
                if (i9 == 0) {
                    throw null;
                }
            }
        }
        int i10 = onWarmupCompleted;
        int i11 = (i10 ^ 69) + ((i10 & 69) << 1);
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 44 / 0;
        }
    }
}
