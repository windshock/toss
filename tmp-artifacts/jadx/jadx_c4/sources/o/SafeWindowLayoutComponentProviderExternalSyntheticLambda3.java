package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeWindowLayoutComponentProviderExternalSyntheticLambda3 implements SafeWindowLayoutComponentProviderExternalSyntheticLambda4 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 IAuthTabCallback;
    private final SafeWindowLayoutComponentProviderExternalSyntheticLambda6 onExtraCallback;

    public SafeWindowLayoutComponentProviderExternalSyntheticLambda3(@NotNull SafeWindowLayoutComponentProviderExternalSyntheticLambda6 safeWindowLayoutComponentProviderExternalSyntheticLambda6, @NotNull WindowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1 windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(safeWindowLayoutComponentProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1, "");
        this.onExtraCallback = safeWindowLayoutComponentProviderExternalSyntheticLambda6;
        this.IAuthTabCallback = windowInfoTrackerImplwindowLayoutInfo2ExternalSyntheticLambda1;
    }

    @Override // o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4
    public Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull access13800<? super JsonObject> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(windowInfoTrackerCompanionExternalSyntheticLambda0, str, access13800Var);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    @Override // o.SafeWindowLayoutComponentProviderExternalSyntheticLambda4
    public Object onExtraCallbackWithResult(@NotNull WindowInfoTrackerCompanionExternalSyntheticLambda0 windowInfoTrackerCompanionExternalSyntheticLambda0, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull access13800<? super WindowInfoTrackerImplwindowLayoutInfo1ExternalSyntheticLambda0> access13800Var) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            objOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, str3, access13800Var);
            int i3 = 79 / 0;
        } else {
            objOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(windowInfoTrackerCompanionExternalSyntheticLambda0, str, str2, str3, access13800Var);
        }
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }
}
