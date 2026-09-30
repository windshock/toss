package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ANROptimizeSwitchOnANROptimizeSwitchCallback {
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final long onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ANROptimizeSwitchOnANROptimizeSwitchCallback)) {
            int i2 = onTransact + 3;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        ANROptimizeSwitchOnANROptimizeSwitchCallback aNROptimizeSwitchOnANROptimizeSwitchCallback = (ANROptimizeSwitchOnANROptimizeSwitchCallback) obj;
        if (!Intrinsics.areEqual(this.asBinder, aNROptimizeSwitchOnANROptimizeSwitchCallback.asBinder)) {
            int i3 = IAuthTabCallbackStub + 87;
            onTransact = i3 % 128;
            return i3 % 2 != 0;
        }
        if (this.onWarmupCompleted != aNROptimizeSwitchOnANROptimizeSwitchCallback.onWarmupCompleted || this.onExtraCallback != aNROptimizeSwitchOnANROptimizeSwitchCallback.onExtraCallback) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, aNROptimizeSwitchOnANROptimizeSwitchCallback.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, aNROptimizeSwitchOnANROptimizeSwitchCallback.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, aNROptimizeSwitchOnANROptimizeSwitchCallback.onNavigationEvent);
        }
        int i4 = onTransact + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.asBinder.hashCode();
        int iHashCode3 = Boolean.hashCode(this.onWarmupCompleted);
        int iHashCode4 = Long.hashCode(this.onExtraCallback);
        String str = this.IAuthTabCallback;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = IAuthTabCallbackStub + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = onTransact + 123;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        String str2 = this.onNavigationEvent;
        if (str2 != null) {
            int i6 = IAuthTabCallbackStub + 3;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            iHashCode5 = str2.hashCode();
        }
        int i8 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode5;
        int i9 = IAuthTabCallbackStub + 15;
        onTransact = i9 % 128;
        if (i9 % 2 == 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditTerm(title=" + this.asBinder + ", agreed=" + this.onWarmupCompleted + ", termsId=" + this.onExtraCallback + ", contentsUrl=" + this.IAuthTabCallback + ", notificationType=" + this.onExtraCallbackWithResult + ", attribute=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public ANROptimizeSwitchOnANROptimizeSwitchCallback(@NotNull String str, boolean z, long j, @Nullable String str2, @NotNull String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.asBinder = str;
        this.onWarmupCompleted = z;
        this.onExtraCallback = j;
        this.IAuthTabCallback = str2;
        this.onExtraCallbackWithResult = str3;
        this.onNavigationEvent = str4;
    }
}
