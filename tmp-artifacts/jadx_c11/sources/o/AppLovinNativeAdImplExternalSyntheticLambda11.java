package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda11 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final long onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public /* synthetic */ AppLovinNativeAdImplExternalSyntheticLambda11(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private AppLovinNativeAdImplExternalSyntheticLambda11(long j, long j2) {
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = j2;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        long j;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onWarmupCompleted;
            int i4 = 39 / 0;
        } else {
            j = this.onWarmupCompleted;
        }
        int i5 = i2 + 51;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return j;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(AppLovinNativeAdImplExternalSyntheticLambda11.class, obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "");
            AppLovinNativeAdImplExternalSyntheticLambda11 appLovinNativeAdImplExternalSyntheticLambda11 = (AppLovinNativeAdImplExternalSyntheticLambda11) obj;
            if (!setByteOrder.onExtraCallbackWithResult(this.onExtraCallbackWithResult, appLovinNativeAdImplExternalSyntheticLambda11.onExtraCallbackWithResult)) {
                int i4 = onNavigationEvent + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (setByteOrder.onExtraCallbackWithResult(this.onWarmupCompleted, appLovinNativeAdImplExternalSyntheticLambda11.onWarmupCompleted)) {
                return true;
            }
            int i6 = onExtraCallback + 25;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = onExtraCallback + 81;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnTransact = (setByteOrder.onTransact(this.onExtraCallbackWithResult) * 31) + setByteOrder.onTransact(this.onWarmupCompleted);
        int i4 = onExtraCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iOnTransact;
        }
        throw null;
    }
}
