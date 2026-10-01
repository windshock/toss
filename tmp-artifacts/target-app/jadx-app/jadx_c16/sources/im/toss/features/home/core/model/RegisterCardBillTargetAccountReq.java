package im.toss.features.home.core.model;

import im.toss.features.home.core.model.RegisterCardBillTargetAccountReq$;
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
public final class RegisterCardBillTargetAccountReq {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String cardBillId;
    private final String referenceId;

    static {
        int i = onNavigationEvent + 11;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCardBillTargetAccountReq)) {
            int i2 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 == 0;
        }
        RegisterCardBillTargetAccountReq registerCardBillTargetAccountReq = (RegisterCardBillTargetAccountReq) obj;
        if (!Intrinsics.areEqual(this.cardBillId, registerCardBillTargetAccountReq.cardBillId)) {
            int i3 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.referenceId, registerCardBillTargetAccountReq.referenceId)) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.cardBillId.hashCode() % 34) / this.referenceId.hashCode() : (this.cardBillId.hashCode() * 31) + this.referenceId.hashCode();
        int i3 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegisterCardBillTargetAccountReq(cardBillId=" + this.cardBillId + ", referenceId=" + this.referenceId + ")";
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ RegisterCardBillTargetAccountReq(int i, String str, String str2, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = RegisterCardBillTargetAccountReq$.serializer.INSTANCE.getDescriptor();
                i2 = 5;
            } else {
                descriptor = RegisterCardBillTargetAccountReq$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.cardBillId = str;
        this.referenceId = str2;
    }

    public RegisterCardBillTargetAccountReq(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cardBillId = str;
        this.referenceId = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(RegisterCardBillTargetAccountReq registerCardBillTargetAccountReq, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, registerCardBillTargetAccountReq.cardBillId);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, registerCardBillTargetAccountReq.cardBillId);
            i3 = 1;
        }
        vylVar.onExtraCallback(serialDescriptor, i3, registerCardBillTargetAccountReq.referenceId);
    }
}
