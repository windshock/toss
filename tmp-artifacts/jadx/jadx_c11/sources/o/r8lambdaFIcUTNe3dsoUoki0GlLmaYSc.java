package o;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaFIcUTNe3dsoUoki0GlLmaYSc {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final void IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", (String) null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "ReactNativeViewLoadStart"), getWrite.IAuthTabCallback("sharedBundleUrl", str), getWrite.IAuthTabCallback("sharedDeploymentId", str2)}), (String) null, false, (String) null, 58, (Object) null);
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
