package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw;
import o.unregisterViewsForInteraction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ {
    private static int asInterface = 1;
    private static int onExtraCallback;
    private final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw IAuthTabCallback;
    private final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final unregisterViewsForInteraction onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 115;
            asInterface = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ)) {
            return false;
        }
        r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq = (r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq.onWarmupCompleted)) {
            int i6 = asInterface + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq.onExtraCallbackWithResult)) {
            int i8 = asInterface + 39;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq.IAuthTabCallback)) {
            int i10 = asInterface + 63;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.onNavigationEvent == r8lambdaod8fmrrtr4qxtfmbw4l0pn3rkoq.onNavigationEvent) {
            return true;
        }
        int i12 = asInterface + 99;
        onExtraCallback = i12 % 128;
        return i12 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        return i3 == 0 ? (((((iHashCode / 40) / this.onExtraCallbackWithResult.hashCode()) % 46) >>> this.IAuthTabCallback.hashCode()) >>> 15) * Integer.hashCode(this.onNavigationEvent) : (((((iHashCode * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallback.hashCode()) * 31) + Integer.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsRollingNumberV2CharTransition(char=" + this.onWarmupCompleted + ", position=" + this.onExtraCallbackWithResult + ", alpha=" + this.IAuthTabCallback + ", index=" + this.onNavigationEvent + ")";
        int i2 = asInterface + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(@NotNull unregisterViewsForInteraction unregisterviewsforinteraction, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw2, int i) {
        Intrinsics.checkNotNullParameter(unregisterviewsforinteraction, "");
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw, "");
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw2, "");
        this.onWarmupCompleted = unregisterviewsforinteraction;
        this.onExtraCallbackWithResult = r8lambdajiejzypzivhzor4bdnudk7fd5lw;
        this.IAuthTabCallback = r8lambdajiejzypzivhzor4bdnudk7fd5lw2;
        this.onNavigationEvent = i;
    }

    public final unregisterViewsForInteraction onExtraCallback() {
        unregisterViewsForInteraction unregisterviewsforinteraction;
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 == 0) {
            unregisterviewsforinteraction = this.onWarmupCompleted;
            int i4 = 82 / 0;
        } else {
            unregisterviewsforinteraction = this.onWarmupCompleted;
        }
        int i5 = i3 + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unregisterviewsforinteraction;
    }

    public final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw = this.onExtraCallbackWithResult;
        int i5 = i2 + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return r8lambdajiejzypzivhzor4bdnudk7fd5lw;
    }

    public /* synthetic */ r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(unregisterViewsForInteraction unregisterviewsforinteraction, r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            r8lambdajiejzypzivhzor4bdnudk7fd5lw2 = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onExtraCallback(1.0f);
            int i3 = onExtraCallback + 69;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        this(unregisterviewsforinteraction, r8lambdajiejzypzivhzor4bdnudk7fd5lw, r8lambdajiejzypzivhzor4bdnudk7fd5lw2, i);
    }

    public final r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw = this.IAuthTabCallback;
        int i4 = i3 + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return r8lambdajiejzypzivhzor4bdnudk7fd5lw;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 125;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i2 + 73;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public /* synthetic */ r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(char c, r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            r8lambdajiejzypzivhzor4bdnudk7fd5lw2 = new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onExtraCallback(1.0f);
            int i3 = asInterface + 1;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
        }
        this(c, r8lambdajiejzypzivhzor4bdnudk7fd5lw, r8lambdajiejzypzivhzor4bdnudk7fd5lw2, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(char c, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw2, int i) {
        this(new unregisterViewsForInteraction.onWarmupCompleted(c), r8lambdajiejzypzivhzor4bdnudk7fd5lw, r8lambdajiejzypzivhzor4bdnudk7fd5lw2, i);
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw, "");
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(char c, float f, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, int i) {
        this(new unregisterViewsForInteraction.onWarmupCompleted(c), new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onExtraCallback(f), r8lambdajiejzypzivhzor4bdnudk7fd5lw, i);
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaoD8fmrRtr4qxTFMbw4l0pN3RKoQ(@NotNull unregisterViewsForInteraction unregisterviewsforinteraction, float f, @NotNull r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw r8lambdajiejzypzivhzor4bdnudk7fd5lw, int i) {
        this(unregisterviewsforinteraction, new r8lambdaJIEJzyPZivHzor4BdnUdk7Fd5Lw.onExtraCallback(f), r8lambdajiejzypzivhzor4bdnudk7fd5lw, i);
        Intrinsics.checkNotNullParameter(unregisterviewsforinteraction, "");
        Intrinsics.checkNotNullParameter(r8lambdajiejzypzivhzor4bdnudk7fd5lw, "");
    }
}
