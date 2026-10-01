package im.toss.features.benefit.dto;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class BankCardCashbackRewardResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean alreadyRewarded;
    private final boolean rewarded;
    private final long totalAmount;

    static {
        int i = onWarmupCompleted + 15;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
    }

    public BankCardCashbackRewardResult() {
        this(false, 0L, false, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankCardCashbackRewardResult)) {
            return false;
        }
        BankCardCashbackRewardResult bankCardCashbackRewardResult = (BankCardCashbackRewardResult) obj;
        if (this.rewarded != bankCardCashbackRewardResult.rewarded) {
            return false;
        }
        if (this.totalAmount != bankCardCashbackRewardResult.totalAmount) {
            int i5 = i3 + 13;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.alreadyRewarded == bankCardCashbackRewardResult.alreadyRewarded) {
            return true;
        }
        int i6 = i3 + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 65 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Boolean.hashCode(this.rewarded) >> 44) / Long.hashCode(this.totalAmount)) << 102) / Boolean.hashCode(this.alreadyRewarded) : (((Boolean.hashCode(this.rewarded) * 31) + Long.hashCode(this.totalAmount)) * 31) + Boolean.hashCode(this.alreadyRewarded);
        int i3 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankCardCashbackRewardResult(rewarded=" + this.rewarded + ", totalAmount=" + this.totalAmount + ", alreadyRewarded=" + this.alreadyRewarded + ")";
        int i2 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BankCardCashbackRewardResult(int i, boolean z, long j, boolean z2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.rewarded = false;
        } else {
            this.rewarded = z;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 121;
            onNavigationEvent = i4 % 128;
            this.totalAmount = i4 % 2 != 0 ? 1L : 0L;
            int i5 = i3 + 1;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.totalAmount = j;
        }
        if ((i & 4) == 0) {
            this.alreadyRewarded = false;
        } else {
            this.alreadyRewarded = z2;
        }
    }

    public BankCardCashbackRewardResult(boolean z, long j, boolean z2) {
        this.rewarded = z;
        this.totalAmount = j;
        this.alreadyRewarded = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(BankCardCashbackRewardResult bankCardCashbackRewardResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onNavigationEvent(serialDescriptor, 0, bankCardCashbackRewardResult.rewarded);
        } else if (bankCardCashbackRewardResult.rewarded) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0 ? bankCardCashbackRewardResult.totalAmount != 0 : bankCardCashbackRewardResult.totalAmount != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, bankCardCashbackRewardResult.totalAmount);
            }
        }
        if ((!vylVar.onWarmupCompleted(serialDescriptor, 2)) && !bankCardCashbackRewardResult.alreadyRewarded) {
            return;
        }
        vylVar.onNavigationEvent(serialDescriptor, 2, bankCardCashbackRewardResult.alreadyRewarded);
        int i4 = onNavigationEvent + 93;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BankCardCashbackRewardResult(boolean z, long j, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 4;
            } else {
                int i7 = 2 % 2;
            }
            z = false;
        }
        if ((i & 2) != 0) {
            int i8 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            j = 0;
        }
        if ((i & 4) != 0) {
            int i11 = onExtraCallbackWithResult + 77;
            int i12 = i11 % 128;
            onNavigationEvent = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 11;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 % 3;
            } else {
                int i16 = 2 % 2;
            }
            z2 = false;
        }
        this(z, j, z2);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.totalAmount;
        int i5 = i3 + 19;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return j;
    }
}
