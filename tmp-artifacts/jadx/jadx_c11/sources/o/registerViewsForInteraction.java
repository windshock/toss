package o;

import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class registerViewsForInteraction {
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult IAuthTabCallback;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 103;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof registerViewsForInteraction)) {
            int i7 = i4 + 1;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        registerViewsForInteraction registerviewsforinteraction = (registerViewsForInteraction) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, registerviewsforinteraction.onExtraCallback) || this.IAuthTabCallback != registerviewsforinteraction.IAuthTabCallback || !Intrinsics.areEqual(this.onNavigationEvent, registerviewsforinteraction.onNavigationEvent)) {
            return false;
        }
        if (this.onExtraCallbackWithResult == registerviewsforinteraction.onExtraCallbackWithResult) {
            return true;
        }
        int i8 = asBinder + 93;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? (((((this.onExtraCallback.hashCode() / 95) << this.IAuthTabCallback.hashCode()) * 2) >> this.onNavigationEvent.hashCode()) - 15) >> Boolean.hashCode(this.onExtraCallbackWithResult) : (((((this.onExtraCallback.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AnimationRequest(text=" + this.onExtraCallback + ", rollingDirection=" + this.IAuthTabCallback + ", mode=" + this.onNavigationEvent + ", rollAllDigits=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public registerViewsForInteraction(@NotNull String str, @NotNull r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult, @NotNull r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onExtraCallback = str;
        this.IAuthTabCallback = onextracallbackwithresult;
        this.onNavigationEvent = onextracallback;
        this.onExtraCallbackWithResult = z;
    }

    public final String onExtraCallback() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onExtraCallback;
            int i4 = 38 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 119;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
        int i4 = i2 + 93;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public final r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback IAuthTabCallback() {
        r8lambdaXpTnjXyjqx0_oDT5pgmrh8ng6MI.onExtraCallback onextracallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 49;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            onextracallback = this.onNavigationEvent;
            int i4 = 6 / 0;
        } else {
            onextracallback = this.onNavigationEvent;
        }
        int i5 = i2 + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.onExtraCallbackWithResult;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }
}
