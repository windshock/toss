package o;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setShowTermsAndPrivacyPolicyAlertInGdpr {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public static final boolean onWarmupCompleted(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zIAuthTabCallback = r8lambdakSJKa4RMkEAGCUl5MvtfoJNzSuU.onExtraCallback.IAuthTabCallback(uri);
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }
}
