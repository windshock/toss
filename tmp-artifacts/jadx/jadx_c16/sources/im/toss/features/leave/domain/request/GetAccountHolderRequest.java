package im.toss.features.leave.domain.request;

import im.toss.features.leave.domain.request.GetAccountHolderRequest$;
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
public final class GetAccountHolderRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountNo;
    private final long bankCode;

    static {
        int i = onExtraCallback + 17;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 81;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof GetAccountHolderRequest)) {
            int i8 = i2 + 97;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        GetAccountHolderRequest getAccountHolderRequest = (GetAccountHolderRequest) obj;
        if (!Intrinsics.areEqual(this.accountNo, getAccountHolderRequest.accountNo)) {
            int i10 = IAuthTabCallback + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.bankCode == getAccountHolderRequest.bankCode) {
            return true;
        }
        int i12 = IAuthTabCallback + 33;
        int i13 = i12 % 128;
        onWarmupCompleted = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 119;
        IAuthTabCallback = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.accountNo.hashCode() * 31) + Long.hashCode(this.bankCode);
        int i4 = IAuthTabCallback + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetAccountHolderRequest(accountNo=" + this.accountNo + ", bankCode=" + this.bankCode + ")";
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ GetAccountHolderRequest(int i, String str, long j, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? GetAccountHolderRequest$.serializer.INSTANCE : GetAccountHolderRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.accountNo = str;
        this.bankCode = j;
    }

    public GetAccountHolderRequest(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountNo = str;
        this.bankCode = j;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(GetAccountHolderRequest getAccountHolderRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, getAccountHolderRequest.accountNo);
        vylVar.onExtraCallback(serialDescriptor, 1, getAccountHolderRequest.bankCode);
    }
}
