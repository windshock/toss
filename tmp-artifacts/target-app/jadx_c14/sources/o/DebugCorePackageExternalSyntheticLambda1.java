package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DebugCorePackageExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("tossMoneyBalance")
    private final long balance;

    @SerializedName("card")
    private final getNativeProtocolAudience card;

    @SerializedName("hasEverIssued")
    private final boolean hasEverIssued;

    @SerializedName("tossMoneyId")
    private final long tossMoneyId;

    @SerializedName("unregisteredCard")
    private final ReactInstanceManagerExternalSyntheticLambda6 unregisteredCard;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof DebugCorePackageExternalSyntheticLambda1)) {
            return false;
        }
        DebugCorePackageExternalSyntheticLambda1 debugCorePackageExternalSyntheticLambda1 = (DebugCorePackageExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.card, debugCorePackageExternalSyntheticLambda1.card)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.unregisteredCard, debugCorePackageExternalSyntheticLambda1.unregisteredCard)) {
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.balance != debugCorePackageExternalSyntheticLambda1.balance) {
            int i6 = onExtraCallback + 39;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.tossMoneyId == debugCorePackageExternalSyntheticLambda1.tossMoneyId) {
            return this.hasEverIssued == debugCorePackageExternalSyntheticLambda1.hasEverIssued;
        }
        int i8 = IAuthTabCallback + 75;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getNativeProtocolAudience getnativeprotocolaudience = this.card;
        int iHashCode = 0;
        int iHashCode2 = getnativeprotocolaudience == null ? 0 : getnativeprotocolaudience.hashCode();
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6 = this.unregisteredCard;
        if (reactInstanceManagerExternalSyntheticLambda6 != null) {
            int i4 = IAuthTabCallback + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = reactInstanceManagerExternalSyntheticLambda6.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + Long.hashCode(this.balance)) * 31) + Long.hashCode(this.tossMoneyId)) * 31) + Boolean.hashCode(this.hasEverIssued);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TeensCardTossMoneyResponse(card=" + this.card + ", unregisteredCard=" + this.unregisteredCard + ", balance=" + this.balance + ", tossMoneyId=" + this.tossMoneyId + ", hasEverIssued=" + this.hasEverIssued + ")";
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final getNativeProtocolAudience IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getNativeProtocolAudience getnativeprotocolaudience = this.card;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getnativeprotocolaudience;
    }

    public final ReactInstanceManagerExternalSyntheticLambda6 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        ReactInstanceManagerExternalSyntheticLambda6 reactInstanceManagerExternalSyntheticLambda6 = this.unregisteredCard;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return reactInstanceManagerExternalSyntheticLambda6;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.balance;
        int i4 = i3 + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.tossMoneyId;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
