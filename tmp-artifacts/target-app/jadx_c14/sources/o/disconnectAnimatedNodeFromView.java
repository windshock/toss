package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class disconnectAnimatedNodeFromView {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("airPremium")
    private final long airPremium;

    @SerializedName("backwoodsPremium")
    private final long backwoodsPremium;

    @SerializedName("baseCost")
    private final long baseCost;

    @SerializedName("discount")
    private final long discount;

    @SerializedName("expensivePremium")
    private final long expensivePremium;

    @SerializedName("otherRegionPremium")
    private final long otherRegionPremium;

    @SerializedName("totalCost")
    private final long totalCost;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 23;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof disconnectAnimatedNodeFromView)) {
            int i7 = i2 + 65;
            onWarmupCompleted = i7 % 128;
            return i7 % 2 == 0;
        }
        disconnectAnimatedNodeFromView disconnectanimatednodefromview = (disconnectAnimatedNodeFromView) obj;
        if (this.airPremium != disconnectanimatednodefromview.airPremium) {
            int i8 = i2 + 29;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.backwoodsPremium != disconnectanimatednodefromview.backwoodsPremium) {
            int i10 = i4 + 41;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.baseCost != disconnectanimatednodefromview.baseCost) {
            return false;
        }
        if (this.discount != disconnectanimatednodefromview.discount) {
            int i12 = i2 + 51;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.expensivePremium == disconnectanimatednodefromview.expensivePremium) {
            return this.otherRegionPremium == disconnectanimatednodefromview.otherRegionPremium && this.totalCost == disconnectanimatednodefromview.totalCost;
        }
        int i14 = i4 + 11;
        onNavigationEvent = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Long.hashCode(this.airPremium) * 31) + Long.hashCode(this.backwoodsPremium)) * 31) + Long.hashCode(this.baseCost)) * 31) + Long.hashCode(this.discount)) * 31) + Long.hashCode(this.expensivePremium)) * 31) + Long.hashCode(this.otherRegionPremium)) * 31) + Long.hashCode(this.totalCost);
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsDeliveryCost(airPremium=" + this.airPremium + ", backwoodsPremium=" + this.backwoodsPremium + ", baseCost=" + this.baseCost + ", discount=" + this.discount + ", expensivePremium=" + this.expensivePremium + ", otherRegionPremium=" + this.otherRegionPremium + ", totalCost=" + this.totalCost + ")";
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.airPremium;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.backwoodsPremium;
        int i4 = i3 + 79;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.baseCost;
        int i5 = i2 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.discount;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = i3 + 5;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.expensivePremium;
        int i4 = i3 + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.otherRegionPremium;
        int i5 = i2 + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalCost;
        }
        int i3 = 16 / 0;
        return this.totalCost;
    }
}
