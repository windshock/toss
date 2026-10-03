package viva.republica.toss.network.model.electronicdocument.univ;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UnivExternalUrlResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String externalUrl;
    private final String requestBody;

    static {
        int i = IAuthTabCallback + 35;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnivExternalUrlResp() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof UnivExternalUrlResp)) {
            int i4 = onExtraCallback + 15;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        UnivExternalUrlResp univExternalUrlResp = (UnivExternalUrlResp) obj;
        if (Intrinsics.areEqual(this.externalUrl, univExternalUrlResp.externalUrl)) {
            return Intrinsics.areEqual(this.requestBody, univExternalUrlResp.requestBody);
        }
        int i6 = onExtraCallback + 99;
        onWarmupCompleted = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.externalUrl.hashCode() * 31) + this.requestBody.hashCode();
        int i4 = onExtraCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnivExternalUrlResp(externalUrl=" + this.externalUrl + ", requestBody=" + this.requestBody + ")";
        int i2 = onExtraCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UnivExternalUrlResp> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            UnivExternalUrlResp$.serializer serializerVar = UnivExternalUrlResp$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ UnivExternalUrlResp(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.externalUrl = "";
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.externalUrl = str;
        }
        if ((i & 2) != 0) {
            this.requestBody = str2;
            return;
        }
        int i4 = onExtraCallback + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.requestBody = "";
    }

    public UnivExternalUrlResp(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.externalUrl = str;
        this.requestBody = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onWarmupCompleted
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onExtraCallback = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            r4 = 1
            if (r1 != 0) goto L19
            boolean r1 = r7.onWarmupCompleted(r8, r4)
            if (r1 != 0) goto L3a
            goto L1f
        L19:
            boolean r1 = r7.onWarmupCompleted(r8, r2)
            if (r1 != 0) goto L3a
        L1f:
            int r1 = viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onExtraCallback
            int r1 = r1 + 23
            int r5 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onWarmupCompleted = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L33
            java.lang.String r1 = r6.externalUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L48
            goto L3a
        L33:
            java.lang.String r6 = r6.externalUrl
            kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            r6 = 0
            throw r6
        L3a:
            java.lang.String r1 = r6.externalUrl
            r7.onExtraCallback(r8, r2, r1)
            int r1 = viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onExtraCallback
            int r1 = r1 + 17
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.onWarmupCompleted = r2
            int r1 = r1 % r0
        L48:
            boolean r0 = r7.onWarmupCompleted(r8, r4)
            r0 = r0 ^ r4
            if (r0 == r4) goto L50
            goto L58
        L50:
            java.lang.String r0 = r6.requestBody
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L5d
        L58:
            java.lang.String r6 = r6.requestBody
            r7.onExtraCallback(r8, r4, r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.univ.UnivExternalUrlResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnivExternalUrlResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 85 / 0;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 29;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 3;
            } else {
                int i6 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.externalUrl;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.requestBody;
        }
        throw null;
    }
}
