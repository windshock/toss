package im.toss.features.benefit.ui;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class KoreaBenefitTabViewModel$asInterface {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KoreaBenefitTabViewModel$asInterface)) {
            return false;
        }
        KoreaBenefitTabViewModel$asInterface koreaBenefitTabViewModel$asInterface = (KoreaBenefitTabViewModel$asInterface) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, koreaBenefitTabViewModel$asInterface.onExtraCallbackWithResult)) {
            return this.IAuthTabCallback == koreaBenefitTabViewModel$asInterface.IAuthTabCallback && Intrinsics.areEqual(this.onNavigationEvent, koreaBenefitTabViewModel$asInterface.onNavigationEvent);
        }
        int i4 = onWarmupCompleted + 39;
        onExtraCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.onExtraCallbackWithResult.hashCode();
            Integer.hashCode(this.IAuthTabCallback);
            throw null;
        }
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = Integer.hashCode(this.IAuthTabCallback);
        String str = this.onNavigationEvent;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i4 = onExtraCallback + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PointBackRewardEvent(transactionId=" + this.onExtraCallbackWithResult + ", rewardAmount=" + this.IAuthTabCallback + ", rewardText=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = this.IAuthTabCallback;
        int i6 = i3 + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }
}
