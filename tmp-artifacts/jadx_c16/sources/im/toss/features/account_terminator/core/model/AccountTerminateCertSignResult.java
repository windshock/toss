package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateCertSignResult$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateCertSignResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String txId;

    static {
        int i = IAuthTabCallback + 19;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 95;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return true;
        }
        if (obj instanceof AccountTerminateCertSignResult) {
            return Intrinsics.areEqual(this.txId, ((AccountTerminateCertSignResult) obj).txId);
        }
        int i6 = i3 + 3;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.txId.hashCode();
        int i4 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateCertSignResult(txId=" + this.txId + ")";
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AccountTerminateCertSignResult(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, AccountTerminateCertSignResult$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.txId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(AccountTerminateCertSignResult accountTerminateCertSignResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, accountTerminateCertSignResult.txId);
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.txId;
        int i5 = i2 + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
