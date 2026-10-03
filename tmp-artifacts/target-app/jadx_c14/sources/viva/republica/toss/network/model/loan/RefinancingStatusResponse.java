package viva.republica.toss.network.model.loan;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.RefinancingStatusResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingStatusResponse {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("groupId")
    private final long groupId;

    static {
        int i = onNavigationEvent + 35;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public RefinancingStatusResponse() {
        this(0L, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof RefinancingStatusResponse) {
            return this.groupId == ((RefinancingStatusResponse) obj).groupId;
        }
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.groupId);
        }
        int i3 = 97 / 0;
        return Long.hashCode(this.groupId);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefinancingStatusResponse(groupId=" + this.groupId + ")";
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RefinancingStatusResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            RefinancingStatusResponse$.serializer serializerVar = RefinancingStatusResponse$.serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ RefinancingStatusResponse(int i, long j, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.groupId = 0L;
            int i2 = onExtraCallback + 71;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.groupId = j;
        int i4 = onExtraCallbackWithResult + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public RefinancingStatusResponse(long j) {
        this.groupId = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.RefinancingStatusResponse r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.loan.RefinancingStatusResponse.onExtraCallback
            int r1 = r1 + 7
            int r2 = r1 % 128
            viva.republica.toss.network.model.loan.RefinancingStatusResponse.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            r1 = 1
            boolean r1 = r8.onWarmupCompleted(r9, r1)
            if (r1 != 0) goto L25
            goto L1d
        L17:
            boolean r1 = r8.onWarmupCompleted(r9, r2)
            if (r1 != 0) goto L25
        L1d:
            long r3 = r7.groupId
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2a
        L25:
            long r3 = r7.groupId
            r8.onExtraCallback(r9, r2, r3)
        L2a:
            int r7 = viva.republica.toss.network.model.loan.RefinancingStatusResponse.onExtraCallback
            int r7 = r7 + 69
            int r8 = r7 % 128
            viva.republica.toss.network.model.loan.RefinancingStatusResponse.onExtraCallbackWithResult = r8
            int r7 = r7 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingStatusResponse.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.RefinancingStatusResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RefinancingStatusResponse(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            j = 0;
        }
        this(j);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.groupId;
        int i4 = i2 + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }
}
