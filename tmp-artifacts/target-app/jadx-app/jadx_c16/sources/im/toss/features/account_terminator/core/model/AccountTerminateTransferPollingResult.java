package im.toss.features.account_terminator.core.model;

import im.toss.features.account_terminator.core.model.AccountTerminateTransferPollingResult$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountTerminateTransferPollingResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final boolean isFinish;

    static {
        Object obj = null;
        int i = onExtraCallbackWithResult + 111;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof AccountTerminateTransferPollingResult) {
            return this.isFinish == ((AccountTerminateTransferPollingResult) obj).isFinish;
        }
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.isFinish);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountTerminateTransferPollingResult(isFinish=" + this.isFinish + ")";
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ AccountTerminateTransferPollingResult(int i, boolean z, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 1;
        if (1 != (i & 1)) {
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = AccountTerminateTransferPollingResult$.serializer.INSTANCE.getDescriptor();
                i2 = 0;
            } else {
                descriptor = AccountTerminateTransferPollingResult$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        this.isFinish = z;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(AccountTerminateTransferPollingResult accountTerminateTransferPollingResult, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, accountTerminateTransferPollingResult.isFinish);
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.isFinish;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
