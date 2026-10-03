package viva.republica.toss.network.model.loan;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.BizRefinancePreScreenRetryRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BizRefinancePreScreenRetryRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long accountId;
    private final long groupId;

    static {
        int i = onExtraCallback + 93;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 61;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof BizRefinancePreScreenRetryRequest)) {
            int i7 = i4 + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        BizRefinancePreScreenRetryRequest bizRefinancePreScreenRetryRequest = (BizRefinancePreScreenRetryRequest) obj;
        if (this.groupId == bizRefinancePreScreenRetryRequest.groupId) {
            return this.accountId == bizRefinancePreScreenRetryRequest.accountId;
        }
        int i9 = i2 + 35;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Long.hashCode(this.groupId) * 31) + Long.hashCode(this.accountId);
        int i4 = onWarmupCompleted + 115;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BizRefinancePreScreenRetryRequest(groupId=" + this.groupId + ", accountId=" + this.accountId + ")";
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BizRefinancePreScreenRetryRequest> serializer() {
            BizRefinancePreScreenRetryRequest$.serializer serializerVar;
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                serializerVar = BizRefinancePreScreenRetryRequest$.serializer.INSTANCE;
                int i3 = 2 / 0;
            } else {
                serializerVar = BizRefinancePreScreenRetryRequest$.serializer.INSTANCE;
            }
            int i4 = onExtraCallback + 119;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ BizRefinancePreScreenRetryRequest(int i, long j, long j2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onWarmupCompleted + 67;
            onNavigationEvent = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 3, (i2 % 2 == 0 ? BizRefinancePreScreenRetryRequest$.serializer.INSTANCE : BizRefinancePreScreenRetryRequest$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.groupId = j;
        this.accountId = j2;
    }

    public BizRefinancePreScreenRetryRequest(long j, long j2) {
        this.groupId = j;
        this.accountId = j2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(BizRefinancePreScreenRetryRequest bizRefinancePreScreenRetryRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, bizRefinancePreScreenRetryRequest.groupId);
        vylVar.onExtraCallback(serialDescriptor, 1, bizRefinancePreScreenRetryRequest.accountId);
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
