package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda18 {
    private static int asBinder = 0;
    private static int onTransact = 1;
    private final LottieCompositionFactoryExternalSyntheticLambda12 IAuthTabCallback;
    private final LottieCompositionFactoryExternalSyntheticLambda12 IAuthTabCallbackDefault;
    private final String onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final LottieCompositionFactoryExternalSyntheticLambda12 onNavigationEvent;
    private final LottieCompositionFactoryExternalSyntheticLambda12 onWarmupCompleted;

    public /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda18(String str, long j, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda124, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, lottieCompositionFactoryExternalSyntheticLambda12, lottieCompositionFactoryExternalSyntheticLambda122, lottieCompositionFactoryExternalSyntheticLambda123, lottieCompositionFactoryExternalSyntheticLambda124);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieCompositionFactoryExternalSyntheticLambda18)) {
            int i2 = onTransact + 5;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LottieCompositionFactoryExternalSyntheticLambda18 lottieCompositionFactoryExternalSyntheticLambda18 = (LottieCompositionFactoryExternalSyntheticLambda18) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, lottieCompositionFactoryExternalSyntheticLambda18.onExtraCallback)) {
            int i4 = onTransact + 1;
            asBinder = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!setUseCaseDetached.onExtraCallback(this.onExtraCallbackWithResult, lottieCompositionFactoryExternalSyntheticLambda18.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallback, lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, lottieCompositionFactoryExternalSyntheticLambda18.onWarmupCompleted)) {
            int i5 = asBinder + 89;
            onTransact = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.onNavigationEvent, lottieCompositionFactoryExternalSyntheticLambda18.onNavigationEvent))) {
            if (!(!Intrinsics.areEqual(this.IAuthTabCallbackDefault, lottieCompositionFactoryExternalSyntheticLambda18.IAuthTabCallbackDefault))) {
                return true;
            }
            int i6 = asBinder + 87;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = asBinder + 25;
        int i9 = i8 % 128;
        onTransact = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 111;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.onExtraCallback.hashCode();
        int iAsInterface = setUseCaseDetached.asInterface(this.onExtraCallbackWithResult);
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.IAuthTabCallback;
        int iHashCode4 = 0;
        if (lottieCompositionFactoryExternalSyntheticLambda12 == null) {
            int i2 = onTransact + 95;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = lottieCompositionFactoryExternalSyntheticLambda12.hashCode();
        }
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122 = this.onWarmupCompleted;
        int iHashCode5 = lottieCompositionFactoryExternalSyntheticLambda122 == null ? 0 : lottieCompositionFactoryExternalSyntheticLambda122.hashCode();
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123 = this.onNavigationEvent;
        if (lottieCompositionFactoryExternalSyntheticLambda123 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = lottieCompositionFactoryExternalSyntheticLambda123.hashCode();
            int i4 = onTransact + 9;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda124 = this.IAuthTabCallbackDefault;
        if (lottieCompositionFactoryExternalSyntheticLambda124 != null) {
            int i6 = asBinder + 115;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                int iHashCode6 = lottieCompositionFactoryExternalSyntheticLambda124.hashCode();
                int i7 = 77 / 0;
                iHashCode4 = iHashCode6;
            } else {
                iHashCode4 = lottieCompositionFactoryExternalSyntheticLambda124.hashCode();
            }
        }
        return (((((((((iHashCode3 * 31) + iAsInterface) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PointComponentPointGradientState(imageUrl=" + this.onExtraCallback + ", size=" + setUseCaseDetached.asBinder(this.onExtraCallbackWithResult) + ", opacityAnimState=" + this.IAuthTabCallback + ", scaleAnimState=" + this.onWarmupCompleted + ", translateXAnimState=" + this.onNavigationEvent + ", translateYAnimState=" + this.IAuthTabCallbackDefault + ")";
        int i2 = asBinder + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private LottieCompositionFactoryExternalSyntheticLambda18(String str, long j, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda122, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda123, LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda124) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback = str;
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = lottieCompositionFactoryExternalSyntheticLambda12;
        this.onWarmupCompleted = lottieCompositionFactoryExternalSyntheticLambda122;
        this.onNavigationEvent = lottieCompositionFactoryExternalSyntheticLambda123;
        this.IAuthTabCallbackDefault = lottieCompositionFactoryExternalSyntheticLambda124;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 93;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 19;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        long j = this.onExtraCallbackWithResult;
        int i5 = i3 + 51;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LottieCompositionFactoryExternalSyntheticLambda12 onNavigationEvent() {
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 73;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            lottieCompositionFactoryExternalSyntheticLambda12 = this.IAuthTabCallback;
            int i4 = 21 / 0;
        } else {
            lottieCompositionFactoryExternalSyntheticLambda12 = this.IAuthTabCallback;
        }
        int i5 = i2 + 123;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return lottieCompositionFactoryExternalSyntheticLambda12;
    }

    public final LottieCompositionFactoryExternalSyntheticLambda12 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return lottieCompositionFactoryExternalSyntheticLambda12;
    }

    public final LottieCompositionFactoryExternalSyntheticLambda12 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.onNavigationEvent;
        int i5 = i2 + 109;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return lottieCompositionFactoryExternalSyntheticLambda12;
    }

    public final LottieCompositionFactoryExternalSyntheticLambda12 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        LottieCompositionFactoryExternalSyntheticLambda12 lottieCompositionFactoryExternalSyntheticLambda12 = this.IAuthTabCallbackDefault;
        int i5 = i3 + 71;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return lottieCompositionFactoryExternalSyntheticLambda12;
    }
}
