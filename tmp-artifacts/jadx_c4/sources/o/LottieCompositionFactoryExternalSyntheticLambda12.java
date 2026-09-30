package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda12 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final onItemClicked<Float> onExtraCallback;
    private final float onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieCompositionFactoryExternalSyntheticLambda12)) {
            return false;
        }
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = (LottieCompositionFactoryExternalSyntheticLambda12) obj;
        if (Float.compare(this.IAuthTabCallback, lottieCompositionFactoryExternalSyntheticLambda12.IAuthTabCallback) != 0) {
            return false;
        }
        if (Float.compare(this.onExtraCallbackWithResult, lottieCompositionFactoryExternalSyntheticLambda12.onExtraCallbackWithResult) == 0) {
            return Intrinsics.areEqual(this.onExtraCallback, lottieCompositionFactoryExternalSyntheticLambda12.onExtraCallback);
        }
        int i4 = onNavigationEvent + 67;
        onWarmupCompleted = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Float.hashCode(this.IAuthTabCallback) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + this.onExtraCallback.hashCode();
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PointComponentItemAnimState(initValue=" + this.IAuthTabCallback + ", targetValue=" + this.onExtraCallbackWithResult + ", animSpec=" + this.onExtraCallback + ")";
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public LottieCompositionFactoryExternalSyntheticLambda12(float f, float f2, @NotNull onItemClicked<Float> onitemclicked) {
        Intrinsics.checkNotNullParameter(onitemclicked, "");
        this.IAuthTabCallback = f;
        this.onExtraCallbackWithResult = f2;
        this.onExtraCallback = onitemclicked;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda12(float f, float f2, onItemClicked onitemclicked, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            f2 = f;
        }
        if ((i & 4) != 0) {
            int i3 = onNavigationEvent + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onitemclicked = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
            int i5 = onNavigationEvent + 79;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 2;
            } else {
                int i7 = 2 % 2;
            }
        }
        this(f, f2, onitemclicked);
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.onExtraCallbackWithResult;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final onItemClicked<Float> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onItemClicked<Float> onitemclicked = this.onExtraCallback;
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onitemclicked;
    }
}
