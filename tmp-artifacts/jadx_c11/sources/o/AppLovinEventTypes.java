package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinEventTypes implements getAdditionalConsentStatus {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final SurfaceOutputImplExternalSyntheticLambda1 onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLovinEventTypes)) {
            return false;
        }
        AppLovinEventTypes appLovinEventTypes = (AppLovinEventTypes) obj;
        if (Intrinsics.areEqual(this.onNavigationEvent, appLovinEventTypes.onNavigationEvent)) {
            return Intrinsics.areEqual(this.onExtraCallback, appLovinEventTypes.onExtraCallback) && Intrinsics.areEqual(this.onExtraCallbackWithResult, appLovinEventTypes.onExtraCallbackWithResult);
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 67;
        onWarmupCompleted = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 9;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.onExtraCallback.hashCode();
        String str = this.onExtraCallbackWithResult;
        if (str == null) {
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InlineComposable(placeholder=" + this.onNavigationEvent + ", children=" + this.onExtraCallback + ", contentDescription=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public AppLovinEventTypes(@NotNull SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(surfaceOutputImplExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent = surfaceOutputImplExternalSyntheticLambda1;
        this.onExtraCallback = function2;
        this.onExtraCallbackWithResult = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppLovinEventTypes(SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1, Function2 function2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        this(surfaceOutputImplExternalSyntheticLambda1, function2, str);
    }

    public final SurfaceOutputImplExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SurfaceOutputImplExternalSyntheticLambda1 surfaceOutputImplExternalSyntheticLambda1 = this.onNavigationEvent;
        int i4 = i2 + 89;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return surfaceOutputImplExternalSyntheticLambda1;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = this.onExtraCallback;
        int i4 = i3 + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    @Override // o.getAdditionalConsentStatus
    public String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
