package viva.republica.toss.network.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.InitSessionKeyRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InitSessionKeyRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String origin;
    private final String referrer;

    static {
        int i = IAuthTabCallback + 93;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InitSessionKeyRequest() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof InitSessionKeyRequest)) {
            int i6 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        InitSessionKeyRequest initSessionKeyRequest = (InitSessionKeyRequest) obj;
        if (Intrinsics.areEqual(this.origin, initSessionKeyRequest.origin)) {
            return Intrinsics.areEqual(this.referrer, initSessionKeyRequest.referrer);
        }
        int i8 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i2 % 128;
        int iHashCode = 0;
        int iHashCode2 = (i2 % 2 == 0 ? (str = this.origin) != null : (str = this.origin) != null) ? str.hashCode() : 0;
        String str2 = this.referrer;
        if (str2 != null) {
            int i3 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
                iHashCode = str2.hashCode();
            } else {
                iHashCode = str2.hashCode();
            }
        }
        int i5 = (iHashCode2 * 31) + iHashCode;
        int i6 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InitSessionKeyRequest(origin=" + this.origin + ", referrer=" + this.referrer + ")";
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitSessionKeyRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                InitSessionKeyRequest$.serializer serializerVar = InitSessionKeyRequest$.serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            InitSessionKeyRequest$.serializer serializerVar2 = InitSessionKeyRequest$.serializer.INSTANCE;
            int i3 = IAuthTabCallback + 101;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return serializerVar2;
        }
    }

    public /* synthetic */ InitSessionKeyRequest(int i, String str, String str2, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.origin = null;
        } else {
            this.origin = str;
            int i2 = 2 % 2;
        }
        if ((i & 2) != 0) {
            this.referrer = str2;
            int i3 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.referrer = null;
        if (i6 != 0) {
            int i7 = 50 / 0;
        }
    }

    public InitSessionKeyRequest(@Nullable String str, @Nullable String str2) {
        this.origin = str;
        this.referrer = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.transfer.InitSessionKeyRequest r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onWarmupCompleted
            int r1 = r1 + 125
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 == r3) goto L21
            goto L1d
        L17:
            boolean r1 = r6.onWarmupCompleted(r7, r2)
            if (r1 != 0) goto L21
        L1d:
            java.lang.String r1 = r5.origin
            if (r1 == 0) goto L28
        L21:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r5.origin
            r6.onExtraCallbackWithResult(r7, r2, r1, r4)
        L28:
            boolean r1 = r6.onWarmupCompleted(r7, r3)
            if (r1 != 0) goto L3b
            int r1 = viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onWarmupCompleted
            int r1 = r1 + 91
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r1 = r5.referrer
            if (r1 == 0) goto L4b
        L3b:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.referrer
            r6.onExtraCallbackWithResult(r7, r3, r1, r5)
            int r5 = viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onExtraCallbackWithResult
            int r5 = r5 + 13
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onWarmupCompleted = r6
            int r5 = r5 % r0
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.InitSessionKeyRequest.onNavigationEvent(viva.republica.toss.network.model.transfer.InitSessionKeyRequest, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InitSessionKeyRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }
}
