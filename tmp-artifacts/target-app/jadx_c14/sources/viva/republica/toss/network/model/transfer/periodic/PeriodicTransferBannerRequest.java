package viva.republica.toss.network.model.transfer.periodic;

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
import viva.republica.toss.network.model.transfer.TransferAccountDto;
import viva.republica.toss.network.model.transfer.TransferAccountDto$;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PeriodicTransferBannerRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final TransferAccountDto filteringAccount;

    static {
        int i = onNavigationEvent + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PeriodicTransferBannerRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.filteringAccount, ((PeriodicTransferBannerRequest) obj).filteringAccount)) {
            return true;
        }
        int i4 = onExtraCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 119;
        viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest.onExtraCallback
            int r2 = r1 + 89
            int r3 = r2 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest.onWarmupCompleted = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L17
            viva.republica.toss.network.model.transfer.TransferAccountDto r2 = r5.filteringAccount
            r4 = 45
            int r4 = r4 / r3
            if (r2 != 0) goto L23
            goto L1b
        L17:
            viva.republica.toss.network.model.transfer.TransferAccountDto r2 = r5.filteringAccount
            if (r2 != 0) goto L23
        L1b:
            int r1 = r1 + 119
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest.onWarmupCompleted = r2
            int r1 = r1 % r0
            return r3
        L23:
            int r0 = r2.hashCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerRequest.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PeriodicTransferBannerRequest(filteringAccount=" + this.filteringAccount + ")";
        int i2 = onExtraCallback + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PeriodicTransferBannerRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            PeriodicTransferBannerRequest$.serializer serializerVar = PeriodicTransferBannerRequest$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ PeriodicTransferBannerRequest(int i, TransferAccountDto transferAccountDto, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 != 0 ? PeriodicTransferBannerRequest$.serializer.INSTANCE : PeriodicTransferBannerRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = onExtraCallback + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.filteringAccount = transferAccountDto;
    }

    public PeriodicTransferBannerRequest(@Nullable TransferAccountDto transferAccountDto) {
        this.filteringAccount = transferAccountDto;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(PeriodicTransferBannerRequest periodicTransferBannerRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        TransferAccountDto$.serializer serializerVar;
        TransferAccountDto transferAccountDto;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            serializerVar = TransferAccountDto$.serializer.INSTANCE;
            transferAccountDto = periodicTransferBannerRequest.filteringAccount;
            i = 1;
        } else {
            serializerVar = TransferAccountDto$.serializer.INSTANCE;
            transferAccountDto = periodicTransferBannerRequest.filteringAccount;
            i = 0;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, i, serializerVar, transferAccountDto);
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
