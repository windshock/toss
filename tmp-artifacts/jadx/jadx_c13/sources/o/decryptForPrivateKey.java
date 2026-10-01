package o;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class decryptForPrivateKey {
    private static decryptForHidingPrivateKeyWithFinger onExtraCallback;
    public static final decryptForPrivateKey onNavigationEvent = new decryptForPrivateKey();

    private decryptForPrivateKey() {
    }

    public final void onExtraCallbackWithResult(@NotNull Function1<? super Context, ? extends readFileToByteArray> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallback = new convertFromFingerToNPKI(function1);
    }

    public final readFileToByteArray IAuthTabCallback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        decryptForHidingPrivateKeyWithFinger decryptforhidingprivatekeywithfinger = onExtraCallback;
        if (decryptforhidingprivatekeywithfinger != null) {
            return decryptforhidingprivatekeywithfinger.onWarmupCompleted(context);
        }
        return null;
    }

    public final boolean IAuthTabCallback() {
        return onExtraCallback != null;
    }
}
