package viva.republica.toss.network.model.transfer;

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

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAgreementAccount {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final SignDoc agreementSignDoc;
    private final String bankAccountNo;
    private final int bankCode;

    static {
        int i = onExtraCallback + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 53;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof WithdrawAgreementAccount)) {
            return false;
        }
        WithdrawAgreementAccount withdrawAgreementAccount = (WithdrawAgreementAccount) obj;
        if (this.bankCode == withdrawAgreementAccount.bankCode) {
            return Intrinsics.areEqual(this.bankAccountNo, withdrawAgreementAccount.bankAccountNo) && Intrinsics.areEqual(this.agreementSignDoc, withdrawAgreementAccount.agreementSignDoc);
        }
        int i8 = i2 + 1;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.bankCode);
        int iHashCode2 = this.bankAccountNo.hashCode();
        SignDoc signDoc = this.agreementSignDoc;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (signDoc == null ? 0 : signDoc.hashCode());
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawAgreementAccount(bankCode=" + this.bankCode + ", bankAccountNo=" + this.bankAccountNo + ", agreementSignDoc=" + this.agreementSignDoc + ")";
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WithdrawAgreementAccount> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            WithdrawAgreementAccount$$serializer withdrawAgreementAccount$$serializer = WithdrawAgreementAccount$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return withdrawAgreementAccount$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ WithdrawAgreementAccount(int i, int i2, String str, SignDoc signDoc, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i3 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 7, WithdrawAgreementAccount$$serializer.INSTANCE.getDescriptor());
            int i5 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this.bankCode = i2;
        this.bankAccountNo = str;
        this.agreementSignDoc = signDoc;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(WithdrawAgreementAccount withdrawAgreementAccount, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, withdrawAgreementAccount.bankCode);
        vylVar.onExtraCallback(serialDescriptor, 1, withdrawAgreementAccount.bankAccountNo);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, SignDoc$$serializer.INSTANCE, withdrawAgreementAccount.agreementSignDoc);
        int i4 = onExtraCallbackWithResult + 61;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    public final SignDoc onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SignDoc signDoc = this.agreementSignDoc;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return signDoc;
    }
}
