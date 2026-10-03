package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocPasswordForWebResp {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String pinNo;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallback + 69;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocPasswordForWebResp() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 7;
        viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.pinNo, ((viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp) r6).pinNo) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult + 21;
        viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
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
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback
            int r2 = r1 + 19
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 29
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp
            if (r2 == r3) goto L25
            int r1 = r1 + 7
            int r6 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult = r6
            int r1 = r1 % r0
            return r4
        L25:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp r6 = (viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp) r6
            java.lang.String r1 = r5.pinNo
            java.lang.String r6 = r6.pinNo
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L32
            return r4
        L32:
            int r6 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult
            int r6 = r6 + 21
            int r1 = r6 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        String str = this.pinNo;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocPasswordForWebResp(pinNo=" + this.pinNo + ")";
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
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

        public final KSerializer<EDocPasswordForWebResp> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocPasswordForWebResp$.serializer serializerVar = EDocPasswordForWebResp$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    public /* synthetic */ EDocPasswordForWebResp(int i, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.pinNo = null;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.pinNo = str;
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public EDocPasswordForWebResp(@Nullable String str) {
        this.pinNo = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            boolean r2 = r5.onWarmupCompleted(r6, r1)
            if (r2 == 0) goto Lb
            goto L18
        Lb:
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback
            int r2 = r2 + 1
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            java.lang.String r2 = r4.pinNo
            if (r2 == 0) goto L1f
        L18:
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.pinNo
            r5.onExtraCallbackWithResult(r6, r1, r2, r4)
        L1f:
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback
            int r4 = r4 + 5
            int r5 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocPasswordForWebResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocPasswordForWebResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            str = this.pinNo;
            int i4 = 70 / 0;
        } else {
            str = this.pinNo;
        }
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
