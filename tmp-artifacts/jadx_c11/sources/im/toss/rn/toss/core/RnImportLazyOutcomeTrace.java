package im.toss.rn.toss.core;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.ResourceResolutionException;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnImportLazyOutcomeTrace {
    private static int IAuthTabCallback = 1;
    public static final RnImportLazyOutcomeTrace onExtraCallback = new RnImportLazyOutcomeTrace();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private RnImportLazyOutcomeTrace() {
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull ResourceResolutionException resourceResolutionException, boolean z3, @Nullable String str3, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(resourceResolutionException, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("host", str);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("shared_bundle_state", str2);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("has_react_host", String.valueOf(z));
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("has_react_context", String.valueOf(z2));
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("has_bundle_loader_module", String.valueOf(resourceResolutionException.onWarmupCompleted().contains("TossBundleLoader")));
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("import_lazy_entered", String.valueOf(z3));
        if (str3 == null) {
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            str3 = "null";
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "TossRnHostMilestone", "import_lazy_never_called", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, getWrite.IAuthTabCallback("import_lazy_skip_reason", str3), getWrite.IAuthTabCallback("elapsed_ms", String.valueOf(j))}), (String) null, false, (String) null, 56, (Object) null);
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
