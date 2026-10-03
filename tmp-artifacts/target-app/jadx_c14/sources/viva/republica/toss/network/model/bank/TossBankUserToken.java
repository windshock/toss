package viva.republica.toss.network.model.bank;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import viva.republica.toss.network.model.bank.TossBankUserToken$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TossBankUserToken {
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String bankAuth;
    private final String tempAESKey;
    private final String tempIV;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 61;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof viva.republica.toss.network.model.bank.TossBankUserToken) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (viva.republica.toss.network.model.bank.TossBankUserToken) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.bankAuth, r6.bankAuth) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.tempAESKey, r6.tempAESKey) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.tempIV, r6.tempIV)) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 97;
        viva.republica.toss.network.model.bank.TossBankUserToken.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
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
            int r1 = viva.republica.toss.network.model.bank.TossBankUserToken.onExtraCallbackWithResult
            int r2 = r1 + 39
            int r3 = r2 % 128
            viva.republica.toss.network.model.bank.TossBankUserToken.onExtraCallback = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 53
            int r2 = r2 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 97
            int r6 = r1 % 128
            viva.republica.toss.network.model.bank.TossBankUserToken.onExtraCallback = r6
            int r1 = r1 % r0
            return r3
        L20:
            boolean r0 = r6 instanceof viva.republica.toss.network.model.bank.TossBankUserToken
            if (r0 != 0) goto L25
            return r4
        L25:
            viva.republica.toss.network.model.bank.TossBankUserToken r6 = (viva.republica.toss.network.model.bank.TossBankUserToken) r6
            java.lang.String r0 = r5.bankAuth
            java.lang.String r1 = r6.bankAuth
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L32
            return r4
        L32:
            java.lang.String r0 = r5.tempAESKey
            java.lang.String r1 = r6.tempAESKey
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L3d
            return r4
        L3d:
            java.lang.String r0 = r5.tempIV
            java.lang.String r6 = r6.tempIV
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            r6 = r6 ^ r3
            if (r6 == r3) goto L49
            return r3
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.bank.TossBankUserToken.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.bankAuth.hashCode() * 31) + this.tempAESKey.hashCode()) * 31) + this.tempIV.hashCode();
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankUserToken(bankAuth=" + this.bankAuth + ", tempAESKey=" + this.tempAESKey + ", tempIV=" + this.tempIV + ")";
        int i2 = onExtraCallback + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TossBankUserToken> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            TossBankUserToken$.serializer serializerVar = TossBankUserToken$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 9;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ TossBankUserToken(int i, String str, String str2, String str3, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = onExtraCallbackWithResult + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, TossBankUserToken$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.bankAuth = str;
        this.tempAESKey = str2;
        this.tempIV = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TossBankUserToken tossBankUserToken, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, tossBankUserToken.bankAuth);
        vylVar.onExtraCallback(serialDescriptor, 1, tossBankUserToken.tempAESKey);
        vylVar.onExtraCallback(serialDescriptor, 2, tossBankUserToken.tempIV);
        int i4 = onExtraCallbackWithResult + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.bankAuth;
        int i5 = i3 + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tempAESKey;
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tempIV;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return str;
    }
}
