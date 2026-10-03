package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocOpenOnceLinkResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String shareMessage;

    static {
        int i = onExtraCallback + 85;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocOpenOnceLinkResp() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocOpenOnceLinkResp)) {
            int i4 = i3 + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.shareMessage, ((EDocOpenOnceLinkResp) obj).shareMessage)) {
            return true;
        }
        int i6 = IAuthTabCallback + 63;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.shareMessage;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocOpenOnceLinkResp(shareMessage=" + this.shareMessage + ")";
        int i2 = onWarmupCompleted + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocOpenOnceLinkResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EDocOpenOnceLinkResp$.serializer serializerVar = EDocOpenOnceLinkResp$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ EDocOpenOnceLinkResp(int i, String str, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.shareMessage = null;
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.shareMessage = str;
        int i4 = onWarmupCompleted + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    public EDocOpenOnceLinkResp(@Nullable String str) {
        this.shareMessage = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp r4, o.vyl r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp.onWarmupCompleted
            int r1 = r1 + 67
            int r2 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            r1 = 1
            boolean r3 = r5.onWarmupCompleted(r6, r1)
            r1 = r1 ^ r3
            if (r1 == 0) goto L22
            goto L1e
        L18:
            boolean r1 = r5.onWarmupCompleted(r6, r2)
            if (r1 != 0) goto L22
        L1e:
            java.lang.String r1 = r4.shareMessage
            if (r1 == 0) goto L29
        L22:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r4.shareMessage
            r5.onExtraCallbackWithResult(r6, r2, r1, r4)
        L29:
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp.onWarmupCompleted
            int r4 = r4 + 65
            int r5 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp.IAuthTabCallback = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp.onExtraCallbackWithResult(viva.republica.toss.network.model.electronicdocument.wallet.EDocOpenOnceLinkResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocOpenOnceLinkResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 95;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 115;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.shareMessage;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return str;
    }
}
