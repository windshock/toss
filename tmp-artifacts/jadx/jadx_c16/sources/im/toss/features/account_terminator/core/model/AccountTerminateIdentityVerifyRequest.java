package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateIdentityVerifyRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateIdentityVerifyRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String certTxId;
    private final String identityNumber;

    static {
        int i = IAuthTabCallback + 17;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTerminateIdentityVerifyRequest)) {
            return false;
        }
        AccountTerminateIdentityVerifyRequest accountTerminateIdentityVerifyRequest = (AccountTerminateIdentityVerifyRequest) obj;
        if (Intrinsics.areEqual(this.identityNumber, accountTerminateIdentityVerifyRequest.identityNumber)) {
            return Intrinsics.areEqual(this.certTxId, accountTerminateIdentityVerifyRequest.certTxId);
        }
        int i4 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.identityNumber.hashCode() * 31) + this.certTxId.hashCode();
        int i4 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateIdentityVerifyRequest(identityNumber=" + this.identityNumber + ", certTxId=" + this.certTxId + ")";
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
        return str;
    }

    public /* synthetic */ AccountTerminateIdentityVerifyRequest(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 3, AccountTerminateIdentityVerifyRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.identityNumber = str;
        this.certTxId = str2;
    }

    public AccountTerminateIdentityVerifyRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.identityNumber = str;
        this.certTxId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AccountTerminateIdentityVerifyRequest accountTerminateIdentityVerifyRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateIdentityVerifyRequest.identityNumber);
        vylVar.onExtraCallback(serialDescriptor, 1, accountTerminateIdentityVerifyRequest.certTxId);
        int i4 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
