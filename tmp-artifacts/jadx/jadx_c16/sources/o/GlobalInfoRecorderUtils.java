package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GlobalInfoRecorderUtils {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final getSupportedHighSpeedResolutionsFor onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted("", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final getSupportedHighSpeedResolutionsFor onNavigationEvent = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted((Object) null, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    private final getSupportedHighSpeedResolutionsFor IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    public final void onWarmupCompleted(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback(str);
            onExtraCallback(str2);
            onExtraCallbackWithResult(false);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            IAuthTabCallback(str);
            onExtraCallback(str2);
            onExtraCallbackWithResult(true);
        }
        int i3 = onExtraCallback + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(false);
        IAuthTabCallback("");
        onExtraCallback(null);
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.IAuthTabCallback(str);
            int i3 = onWarmupCompleted + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.onExtraCallbackWithResult.IAuthTabCallback(str);
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onNavigationEvent.onExtraCallbackWithResult();
        int i4 = onExtraCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return str;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.IAuthTabCallback(str);
            int i3 = onWarmupCompleted + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onNavigationEvent.IAuthTabCallback(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        }
        ((Boolean) this.IAuthTabCallback.onExtraCallbackWithResult()).booleanValue();
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onWarmupCompleted + 79;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
