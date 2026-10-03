package viva.republica.toss.network.model.visitor;

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
import viva.republica.toss.network.model.visitor.VisitorTossMoneyAccount$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorTossMoneyAccount {
    public static final Companion Companion;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String accountNumber;
    private final int bankCode;
    private final String bankName;
    private final long depositAmount;
    private final long depositLimit;
    private final boolean isCloseToLimit;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 103;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisitorTossMoneyAccount)) {
            int i2 = onNavigationEvent + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        VisitorTossMoneyAccount visitorTossMoneyAccount = (VisitorTossMoneyAccount) obj;
        if (!Intrinsics.areEqual(this.accountNumber, visitorTossMoneyAccount.accountNumber) || this.bankCode != visitorTossMoneyAccount.bankCode || !Intrinsics.areEqual(this.bankName, visitorTossMoneyAccount.bankName) || this.depositAmount != visitorTossMoneyAccount.depositAmount) {
            return false;
        }
        if (this.depositLimit == visitorTossMoneyAccount.depositLimit) {
            return this.isCloseToLimit == visitorTossMoneyAccount.isCloseToLimit;
        }
        int i4 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.accountNumber.hashCode() * 31) + Integer.hashCode(this.bankCode)) * 31) + this.bankName.hashCode()) * 31) + Long.hashCode(this.depositAmount)) * 31) + Long.hashCode(this.depositLimit)) * 31) + Boolean.hashCode(this.isCloseToLimit);
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorTossMoneyAccount(accountNumber=" + this.accountNumber + ", bankCode=" + this.bankCode + ", bankName=" + this.bankName + ", depositAmount=" + this.depositAmount + ", depositLimit=" + this.depositLimit + ", isCloseToLimit=" + this.isCloseToLimit + ")";
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VisitorTossMoneyAccount> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            VisitorTossMoneyAccount$.serializer serializerVar = VisitorTossMoneyAccount$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ VisitorTossMoneyAccount(int i, String str, int i2, String str2, long j, long j2, boolean z, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i3 = onNavigationEvent + 57;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 63, VisitorTossMoneyAccount$.serializer.INSTANCE.getDescriptor());
            int i5 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this.accountNumber = str;
        this.bankCode = i2;
        this.bankName = str2;
        this.depositAmount = j;
        this.depositLimit = j2;
        this.isCloseToLimit = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(VisitorTossMoneyAccount visitorTossMoneyAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, visitorTossMoneyAccount.accountNumber);
        vylVar.onExtraCallback(serialDescriptor, 1, visitorTossMoneyAccount.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 2, visitorTossMoneyAccount.bankName);
        vylVar.onExtraCallback(serialDescriptor, 3, visitorTossMoneyAccount.depositAmount);
        vylVar.onExtraCallback(serialDescriptor, 4, visitorTossMoneyAccount.depositLimit);
        vylVar.onNavigationEvent(serialDescriptor, 5, visitorTossMoneyAccount.isCloseToLimit);
        int i4 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.accountNumber;
        int i5 = i3 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bankName;
        int i5 = i2 + 15;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return str;
    }
}
