package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletExternalUrlResp {
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String externalUrl;
    private final long requestId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 105;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public DocumentWalletExternalUrlResp() {
        this((String) null, 0L, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentWalletExternalUrlResp)) {
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        DocumentWalletExternalUrlResp documentWalletExternalUrlResp = (DocumentWalletExternalUrlResp) obj;
        if (!Intrinsics.areEqual(this.externalUrl, documentWalletExternalUrlResp.externalUrl)) {
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.requestId == documentWalletExternalUrlResp.requestId) {
            return true;
        }
        int i6 = IAuthTabCallback + 107;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r1
      0x0023: PHI (r1v6 java.lang.String) = (r1v4 java.lang.String), (r1v7 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.IAuthTabCallback = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L17
            java.lang.String r1 = r5.externalUrl
            r4 = 99
            int r4 = r4 / r3
            if (r1 != 0) goto L23
            goto L1b
        L17:
            java.lang.String r1 = r5.externalUrl
            if (r1 != 0) goto L23
        L1b:
            int r2 = r2 + 31
            int r1 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted = r1
            int r2 = r2 % r0
            goto L27
        L23:
            int r3 = r1.hashCode()
        L27:
            int r3 = r3 * 31
            long r0 = r5.requestId
            int r0 = java.lang.Long.hashCode(r0)
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletExternalUrlResp(externalUrl=" + this.externalUrl + ", requestId=" + this.requestId + ")";
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DocumentWalletExternalUrlResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletExternalUrlResp$.serializer serializerVar = DocumentWalletExternalUrlResp$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ DocumentWalletExternalUrlResp(int i, String str, long j, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        this.externalUrl = str;
        if ((i & 2) == 0) {
            this.requestId = 0L;
            int i5 = onWarmupCompleted + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.requestId = j;
        int i7 = IAuthTabCallback + 47;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public DocumentWalletExternalUrlResp(@Nullable String str, long j) {
        this.externalUrl = str;
        this.requestId = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L21
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.IAuthTabCallback
            int r2 = r2 + 97
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1d
            java.lang.String r2 = r6.externalUrl
            r3 = 28
            int r3 = r3 / r1
            if (r2 == 0) goto L35
            goto L21
        L1d:
            java.lang.String r2 = r6.externalUrl
            if (r2 == 0) goto L35
        L21:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r3 = r6.externalUrl
            r7.onExtraCallbackWithResult(r8, r1, r2, r3)
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted
            int r1 = r1 + 41
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L35
            int r1 = r0 / r0
        L35:
            r1 = 1
            boolean r2 = r7.onWarmupCompleted(r8, r1)
            if (r2 != 0) goto L44
            long r2 = r6.requestId
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L52
        L44:
            long r2 = r6.requestId
            r7.onExtraCallback(r8, r1, r2)
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted
            int r6 = r6 + 9
            int r7 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.IAuthTabCallback = r7
            int r6 = r6 % r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp.onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletExternalUrlResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletExternalUrlResp(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 123;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str, (i & 2) != 0 ? 0L : j);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.externalUrl;
        int i4 = i2 + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.requestId;
        int i5 = i2 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }
}
