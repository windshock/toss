package im.toss.features.leave.domain.request;

import im.toss.features.leave.domain.request.PostRefundAccountRequest$;
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
public final class PostRefundAccountRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String accountNo;
    private final int bankCode;

    static {
        Object obj = null;
        int i = onNavigationEvent + 35;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PostRefundAccountRequest)) {
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        PostRefundAccountRequest postRefundAccountRequest = (PostRefundAccountRequest) obj;
        if (!Intrinsics.areEqual(this.accountNo, postRefundAccountRequest.accountNo)) {
            return false;
        }
        if (this.bankCode == postRefundAccountRequest.bankCode) {
            return true;
        }
        int i6 = IAuthTabCallback + 73;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 113;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.accountNo.hashCode();
        return (i3 != 0 ? iHashCode % 7 : iHashCode * 31) + Integer.hashCode(this.bankCode);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostRefundAccountRequest(accountNo=" + this.accountNo + ", bankCode=" + this.bankCode + ")";
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ PostRefundAccountRequest(int i, String str, int i2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i3 = 3;
        if (3 != (i & 3)) {
            int i4 = onExtraCallback + 65;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                descriptor = PostRefundAccountRequest$.serializer.INSTANCE.getDescriptor();
                i3 = 5;
            } else {
                descriptor = PostRefundAccountRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i3, descriptor);
            int i5 = 2 % 2;
        }
        this.accountNo = str;
        this.bankCode = i2;
    }

    public PostRefundAccountRequest(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountNo = str;
        this.bankCode = i;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(PostRefundAccountRequest postRefundAccountRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, postRefundAccountRequest.accountNo);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, postRefundAccountRequest.accountNo);
        }
        vylVar.onExtraCallback(serialDescriptor, 1, postRefundAccountRequest.bankCode);
    }
}
