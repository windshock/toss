package im.toss.features.benefit.dto;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PointBackRewardResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int rewardAmount;
    private final String rewardText;
    private final boolean showToast;

    static {
        int i = IAuthTabCallback + 39;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public PointBackRewardResult() {
        this(0, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointBackRewardResult)) {
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PointBackRewardResult pointBackRewardResult = (PointBackRewardResult) obj;
        if (this.rewardAmount != pointBackRewardResult.rewardAmount) {
            return false;
        }
        if (this.showToast != pointBackRewardResult.showToast) {
            int i4 = onExtraCallbackWithResult + 95;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.rewardText, pointBackRewardResult.rewardText)) {
            int i6 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i7 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 71 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(this.rewardAmount);
        int iHashCode2 = Boolean.hashCode(this.showToast);
        String str = this.rewardText;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PointBackRewardResult(rewardAmount=" + this.rewardAmount + ", showToast=" + this.showToast + ", rewardText=" + this.rewardText + ")";
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ PointBackRewardResult(int i, int i2, boolean z, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.rewardAmount = 0;
            int i3 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } else {
            this.rewardAmount = i2;
        }
        if ((i & 2) == 0) {
            int i6 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                this.showToast = true;
            } else {
                this.showToast = false;
            }
            int i7 = 2 % 2;
        } else {
            this.showToast = z;
        }
        if ((i & 4) == 0) {
            this.rewardText = null;
        } else {
            this.rewardText = str;
        }
    }

    public PointBackRewardResult(int i, boolean z, @Nullable String str) {
        this.rewardAmount = i;
        this.showToast = z;
        this.rewardText = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(PointBackRewardResult pointBackRewardResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
                if (pointBackRewardResult.rewardAmount != 0) {
                    vylVar.onExtraCallback(serialDescriptor, 0, pointBackRewardResult.rewardAmount);
                    int i6 = onNavigationEvent + 107;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else if (pointBackRewardResult.rewardAmount != 0) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || pointBackRewardResult.showToast) {
            vylVar.onNavigationEvent(serialDescriptor, 1, pointBackRewardResult.showToast);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i8 = onNavigationEvent + 7;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                String str = pointBackRewardResult.rewardText;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (pointBackRewardResult.rewardText == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, pointBackRewardResult.rewardText);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PointBackRewardResult(int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onNavigationEvent + 87;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        if ((i2 & 2) != 0) {
            int i9 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            z = false;
        }
        if ((i2 & 4) != 0) {
            int i12 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
            str = null;
        }
        this(i, z, str);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.rewardAmount;
        int i5 = i3 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.rewardText;
            int i4 = 75 / 0;
        } else {
            str = this.rewardText;
        }
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
