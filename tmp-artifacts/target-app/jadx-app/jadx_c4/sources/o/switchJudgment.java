package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class switchJudgment {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof switchJudgment)) {
            return false;
        }
        switchJudgment switchjudgment = (switchJudgment) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, switchjudgment.onWarmupCompleted)) {
            int i4 = asBinder + 95;
            asInterface = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, switchjudgment.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, switchjudgment.onExtraCallback)) {
            int i5 = asBinder + 65;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, switchjudgment.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, switchjudgment.onExtraCallbackWithResult)) {
            int i7 = asInterface + 17;
            asBinder = i7 % 128;
            return i7 % 2 != 0;
        }
        int i8 = asBinder + 123;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = asInterface + 87;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditOverdueDeleteNudge(title=" + this.onWarmupCompleted + ", imageUrl=" + this.IAuthTabCallback + ", darkImageUrl=" + this.onExtraCallback + ", ctaText=" + this.onNavigationEvent + ", ctaUrl=" + this.onExtraCallbackWithResult + ")";
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 51;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallback;
        int i5 = i3 + 55;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 89;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 115;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
