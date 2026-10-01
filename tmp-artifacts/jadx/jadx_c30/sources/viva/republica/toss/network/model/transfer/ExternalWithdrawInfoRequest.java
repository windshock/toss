package viva.republica.toss.network.model.transfer;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ExternalWithdrawInfoRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final TransferAccountDto withdrawAccount;

    static {
        int i = onWarmupCompleted + 17;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = r1 + 13;
        viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.withdrawAccount, ((viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest) r6).withdrawAccount) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r6 = viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest.onExtraCallback + 123;
        viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest.onExtraCallbackWithResult = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 43;
        viva.republica.toss.network.model.transfer.ExternalWithdrawInfoRequest.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.withdrawAccount.hashCode();
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExternalWithdrawInfoRequest(withdrawAccount=" + this.withdrawAccount + ")";
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ExternalWithdrawInfoRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                ExternalWithdrawInfoRequest$$serializer externalWithdrawInfoRequest$$serializer = ExternalWithdrawInfoRequest$$serializer.INSTANCE;
                throw null;
            }
            ExternalWithdrawInfoRequest$$serializer externalWithdrawInfoRequest$$serializer2 = ExternalWithdrawInfoRequest$$serializer.INSTANCE;
            int i3 = onNavigationEvent + 73;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return externalWithdrawInfoRequest$$serializer2;
        }
    }

    public /* synthetic */ ExternalWithdrawInfoRequest(int i, TransferAccountDto transferAccountDto, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, ExternalWithdrawInfoRequest$$serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this.withdrawAccount = transferAccountDto;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ExternalWithdrawInfoRequest externalWithdrawInfoRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, TransferAccountDto$.serializer.INSTANCE, externalWithdrawInfoRequest.withdrawAccount);
        int i4 = onExtraCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
