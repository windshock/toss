package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletTrxIdResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String trxId;

    static {
        int i = IAuthTabCallback + 67;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocumentWalletTrxIdResp() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 115;
        viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.trxId, ((viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp) r6).trxId) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onNavigationEvent + 115;
        viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onExtraCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onNavigationEvent
            int r2 = r1 + 57
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 98
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp
            if (r2 != 0) goto L25
            int r1 = r1 + 115
            int r6 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onExtraCallback = r6
            int r1 = r1 % r0
            return r4
        L25:
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp r6 = (viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp) r6
            java.lang.String r1 = r5.trxId
            java.lang.String r6 = r6.trxId
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L3b
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onNavigationEvent
            int r6 = r6 + 115
            int r1 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.onExtraCallback = r1
            int r6 = r6 % r0
            return r4
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.trxId;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i3 + 13;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletTrxIdResp(trxId=" + this.trxId + ")";
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DocumentWalletTrxIdResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletTrxIdResp$.serializer serializerVar = DocumentWalletTrxIdResp$.serializer.INSTANCE;
            int i4 = onExtraCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ DocumentWalletTrxIdResp(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.trxId = null;
            int i2 = onExtraCallback + 37;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
                return;
            }
            return;
        }
        this.trxId = str;
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public DocumentWalletTrxIdResp(@Nullable String str) {
        this.trxId = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(DocumentWalletTrxIdResp documentWalletTrxIdResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || documentWalletTrxIdResp.trxId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, documentWalletTrxIdResp.trxId);
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 4;
            }
        }
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletTrxIdResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.trxId;
        int i5 = i3 + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
