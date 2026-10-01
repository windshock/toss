package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.StateCheckAccount$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StateCheckAccount {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountNumber;
    private final String accountType;
    private final String bankCode;
    private final String depositSequence;

    static {
        int i = IAuthTabCallback + 69;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof StateCheckAccount)) {
            return false;
        }
        StateCheckAccount stateCheckAccount = (StateCheckAccount) obj;
        if (!Intrinsics.areEqual(this.bankCode, stateCheckAccount.bankCode)) {
            int i4 = onExtraCallback;
            int i5 = i4 + 53;
            onNavigationEvent = i5 % 128;
            boolean z = i5 % 2 != 0;
            int i6 = i4 + 39;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 9 / 0;
            }
            return z;
        }
        if (!Intrinsics.areEqual(this.accountNumber, stateCheckAccount.accountNumber)) {
            int i8 = onNavigationEvent + 69;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.depositSequence, stateCheckAccount.depositSequence)) {
            return Intrinsics.areEqual(this.accountType, stateCheckAccount.accountType);
        }
        int i10 = onExtraCallback + 19;
        onNavigationEvent = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.bankCode.hashCode();
        int iHashCode2 = this.accountNumber.hashCode();
        String str = this.depositSequence;
        if (str == null) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i8 = onNavigationEvent + 45;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i = iHashCode3;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + this.accountType.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateCheckAccount(bankCode=" + this.bankCode + ", accountNumber=" + this.accountNumber + ", depositSequence=" + this.depositSequence + ", accountType=" + this.accountType + ")";
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ StateCheckAccount(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 15;
        if (15 != (i & 15)) {
            int i3 = onNavigationEvent + 121;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                descriptor = StateCheckAccount$.serializer.INSTANCE.getDescriptor();
                i2 = 48;
            } else {
                descriptor = StateCheckAccount$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.bankCode = str;
        this.accountNumber = str2;
        this.depositSequence = str3;
        this.accountType = str4;
    }

    public StateCheckAccount(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.bankCode = str;
        this.accountNumber = str2;
        this.depositSequence = str3;
        this.accountType = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(StateCheckAccount stateCheckAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, stateCheckAccount.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 1, stateCheckAccount.accountNumber);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, stateCheckAccount.depositSequence);
        vylVar.onExtraCallback(serialDescriptor, 3, stateCheckAccount.accountType);
        int i4 = onExtraCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }
}
