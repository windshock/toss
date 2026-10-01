package o;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onAppStart {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final void IAuthTabCallback(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        try {
            activity.reportFullyDrawn();
            int i4 = onWarmupCompleted + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v5 android.net.Uri) = (r1v4 android.net.Uri), (r1v14 android.net.Uri) binds: [B:8:0x0026, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallbackWithResult(@NotNull Activity activity) {
        Uri referrer;
        String host;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(activity, "");
            referrer = activity.getReferrer();
            int i3 = 71 / 0;
            if (referrer != null) {
                int i4 = onWarmupCompleted + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                host = referrer.getHost();
                if (i5 == 0) {
                    int i6 = 51 / 0;
                }
            } else {
                host = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(activity, "");
            referrer = activity.getReferrer();
            if (referrer != null) {
            }
        }
        if (host == null) {
            int i7 = onWarmupCompleted + 43;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            host = "";
        }
        Intrinsics.checkNotNullExpressionValue(activity.getPackageName(), "");
        return !StringsKt.contains$default(host, r7, false, 2, (Object) null);
    }
}
