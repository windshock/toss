package viva.republica.toss.network.model.account;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.account.WithdrawalAccount$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawalAccount {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String account;
    private final int bankCode;
    private final String displayName;
    private final long id;

    static {
        int i = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 103;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof WithdrawalAccount)) {
            return false;
        }
        WithdrawalAccount withdrawalAccount = (WithdrawalAccount) obj;
        if (this.id != withdrawalAccount.id || this.bankCode != withdrawalAccount.bankCode || !Intrinsics.areEqual(this.account, withdrawalAccount.account)) {
            return false;
        }
        if (Intrinsics.areEqual(this.displayName, withdrawalAccount.displayName)) {
            return true;
        }
        int i3 = onWarmupCompleted + 103;
        onNavigationEvent = i3 % 128;
        return !(i3 % 2 != 0);
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((Long.hashCode(this.id) + 107) - Integer.hashCode(this.bankCode)) - 51) + this.account.hashCode()) % 20) * this.displayName.hashCode() : (((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.bankCode)) * 31) + this.account.hashCode()) * 31) + this.displayName.hashCode();
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawalAccount(id=" + this.id + ", bankCode=" + this.bankCode + ", account=" + this.account + ", displayName=" + this.displayName + ")";
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WithdrawalAccount> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            WithdrawalAccount$.serializer serializerVar = WithdrawalAccount$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ WithdrawalAccount(int i, long j, int i2, String str, String str2, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i3 = onNavigationEvent + 125;
            onWarmupCompleted = i3 % 128;
            htf31.onExtraCallbackWithResult(i, 15, (i3 % 2 != 0 ? WithdrawalAccount$.serializer.INSTANCE : WithdrawalAccount$.serializer.INSTANCE).getDescriptor());
            int i4 = onWarmupCompleted + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.id = j;
        this.bankCode = i2;
        this.account = str;
        this.displayName = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(WithdrawalAccount withdrawalAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, withdrawalAccount.id);
            vylVar.onExtraCallback(serialDescriptor, 1, withdrawalAccount.bankCode);
            vylVar.onExtraCallback(serialDescriptor, 4, withdrawalAccount.account);
            vylVar.onExtraCallback(serialDescriptor, 4, withdrawalAccount.displayName);
            return;
        }
        vylVar.onExtraCallback(serialDescriptor, 0, withdrawalAccount.id);
        vylVar.onExtraCallback(serialDescriptor, 1, withdrawalAccount.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 2, withdrawalAccount.account);
        vylVar.onExtraCallback(serialDescriptor, 3, withdrawalAccount.displayName);
    }

    public final long onNavigationEvent() {
        long j;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.id;
            int i4 = 10 / 0;
        } else {
            j = this.id;
        }
        int i5 = i2 + 103;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int IAuthTabCallback() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 == 0) {
            i = this.bankCode;
            int i5 = 68 / 0;
        } else {
            i = this.bankCode;
        }
        int i6 = i4 + 79;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.account;
        int i5 = i3 + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.displayName;
        }
        throw null;
    }
}
