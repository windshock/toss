package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isDspAd {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> IAuthTabCallback;
    private final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onExtraCallback;
    private final List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 21;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof isDspAd)) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 51;
            onNavigationEvent = i5 % 128;
            boolean z = i5 % 2 == 0;
            int i6 = i4 + 41;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }
        isDspAd isdspad = (isDspAd) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, isdspad.onExtraCallback)) {
            int i8 = onNavigationEvent + 39;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, isdspad.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, isdspad.onExtraCallbackWithResult)) {
            return true;
        }
        int i10 = onWarmupCompleted + 1;
        onNavigationEvent = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.onExtraCallback.hashCode() - 45) + this.IAuthTabCallback.hashCode()) * 86) / this.onExtraCallbackWithResult.hashCode() : (((this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i3 = onNavigationEvent + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsRollingNumberV2Transition(width=" + this.onExtraCallback + ", digit=" + this.IAuthTabCallback + ", other=" + this.onExtraCallbackWithResult + ")";
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public isDspAd(@NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, @NotNull List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list, @NotNull List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list2) {
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.onExtraCallback = r8lambdajiejzypzivhzor4bdnudk7fd5lw;
        this.IAuthTabCallback = list;
        this.onExtraCallbackWithResult = list2;
    }

    public final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 107;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list = this.IAuthTabCallback;
        int i4 = i2 + 55;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        List<r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ> list = this.onExtraCallbackWithResult;
        int i5 = i2 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }
}
