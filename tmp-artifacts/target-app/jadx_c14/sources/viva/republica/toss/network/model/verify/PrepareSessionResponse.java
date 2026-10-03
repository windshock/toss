package viva.republica.toss.network.model.verify;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.PrepareSessionResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PrepareSessionResponse {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String idCardNotificationConsentCode;
    private final long idCardNotificationTermsId;
    private final boolean reusableSession;
    private final ReusedSessionScreenType reusedSessionScreenType;
    private final long sessionId;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.PrepareSessionResponse$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerIAuthTabCallback = PrepareSessionResponse.IAuthTabCallback();
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return kSerializerIAuthTabCallback;
        }
    }), null, null};

    public PrepareSessionResponse() {
        this(0L, false, (ReusedSessionScreenType) null, 0L, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStub();
            throw null;
        }
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<ReusedSessionScreenType> kSerializerSerializer = ReusedSessionScreenType.Companion.serializer();
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepareSessionResponse)) {
            int i2 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PrepareSessionResponse prepareSessionResponse = (PrepareSessionResponse) obj;
        if (this.sessionId != prepareSessionResponse.sessionId) {
            return false;
        }
        if (this.reusableSession != prepareSessionResponse.reusableSession) {
            int i4 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.reusedSessionScreenType != prepareSessionResponse.reusedSessionScreenType) {
            int i6 = onExtraCallbackWithResult + 23;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.idCardNotificationTermsId != prepareSessionResponse.idCardNotificationTermsId) {
            return false;
        }
        if (Intrinsics.areEqual(this.idCardNotificationConsentCode, prepareSessionResponse.idCardNotificationConsentCode)) {
            return true;
        }
        int i7 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Long.hashCode(this.sessionId) * 31) + Boolean.hashCode(this.reusableSession)) * 31) + this.reusedSessionScreenType.hashCode()) * 31) + Long.hashCode(this.idCardNotificationTermsId)) * 31) + this.idCardNotificationConsentCode.hashCode();
        int i4 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareSessionResponse(sessionId=" + this.sessionId + ", reusableSession=" + this.reusableSession + ", reusedSessionScreenType=" + this.reusedSessionScreenType + ", idCardNotificationTermsId=" + this.idCardNotificationTermsId + ", idCardNotificationConsentCode=" + this.idCardNotificationConsentCode + ")";
        int i2 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepareSessionResponse> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PrepareSessionResponse$.serializer serializerVar = PrepareSessionResponse$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 85;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 55;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ PrepareSessionResponse(int i, long j, boolean z, ReusedSessionScreenType reusedSessionScreenType, long j2, String str, okycx okycxVar) {
        this.sessionId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.reusableSession = false;
        } else {
            this.reusableSession = z;
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 5;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            reusedSessionScreenType = ReusedSessionScreenType.FULL_SCREEN;
            int i5 = 2 % 2;
        }
        this.reusedSessionScreenType = reusedSessionScreenType;
        if ((i & 8) == 0) {
            int i6 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i6 % 128;
            this.idCardNotificationTermsId = i6 % 2 != 0 ? 1L : 0L;
        } else {
            this.idCardNotificationTermsId = j2;
        }
        if ((i & 16) != 0) {
            this.idCardNotificationConsentCode = str;
            return;
        }
        this.idCardNotificationConsentCode = "";
        int i7 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PrepareSessionResponse(long j, boolean z, @NotNull ReusedSessionScreenType reusedSessionScreenType, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(reusedSessionScreenType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = j;
        this.reusableSession = z;
        this.reusedSessionScreenType = reusedSessionScreenType;
        this.idCardNotificationTermsId = j2;
        this.idCardNotificationConsentCode = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallback(viva.republica.toss.network.model.verify.PrepareSessionResponse r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.verify.PrepareSessionResponse.$childSerializers
            r2 = 0
            boolean r3 = r10.onWarmupCompleted(r11, r2)
            r4 = 3
            if (r3 != 0) goto L15
            long r5 = r9.sessionId
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L26
        L15:
            long r5 = r9.sessionId
            r10.onExtraCallback(r11, r2, r5)
            int r2 = viva.republica.toss.network.model.verify.PrepareSessionResponse.onWarmupCompleted
            int r2 = r2 + r4
            int r3 = r2 % 128
            viva.republica.toss.network.model.verify.PrepareSessionResponse.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            r2 = 4
            int r2 = r2 / r4
        L26:
            r2 = 1
            boolean r3 = r10.onWarmupCompleted(r11, r2)
            if (r3 != 0) goto L31
            boolean r3 = r9.reusableSession
            if (r3 == 0) goto L36
        L31:
            boolean r3 = r9.reusableSession
            r10.onNavigationEvent(r11, r2, r3)
        L36:
            boolean r3 = r10.onWarmupCompleted(r11, r0)
            if (r3 != 0) goto L42
            viva.republica.toss.network.model.verify.ReusedSessionScreenType r3 = r9.reusedSessionScreenType
            viva.republica.toss.network.model.verify.ReusedSessionScreenType r5 = viva.republica.toss.network.model.verify.ReusedSessionScreenType.FULL_SCREEN
            if (r3 == r5) goto L4f
        L42:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.verify.ReusedSessionScreenType r3 = r9.reusedSessionScreenType
            r10.onNavigationEvent(r11, r0, r1, r3)
        L4f:
            boolean r1 = r10.onWarmupCompleted(r11, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L57
            goto L5f
        L57:
            long r1 = r9.idCardNotificationTermsId
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L64
        L5f:
            long r1 = r9.idCardNotificationTermsId
            r10.onExtraCallback(r11, r4, r1)
        L64:
            r1 = 4
            boolean r2 = r10.onWarmupCompleted(r11, r1)
            if (r2 != 0) goto L7e
            int r2 = viva.republica.toss.network.model.verify.PrepareSessionResponse.onWarmupCompleted
            int r2 = r2 + 17
            int r3 = r2 % 128
            viva.republica.toss.network.model.verify.PrepareSessionResponse.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            java.lang.String r2 = r9.idCardNotificationConsentCode
            java.lang.String r3 = ""
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L83
        L7e:
            java.lang.String r9 = r9.idCardNotificationConsentCode
            r10.onExtraCallback(r11, r1, r9)
        L83:
            int r9 = viva.republica.toss.network.model.verify.PrepareSessionResponse.onExtraCallbackWithResult
            int r9 = r9 + 27
            int r10 = r9 % 128
            viva.republica.toss.network.model.verify.PrepareSessionResponse.onWarmupCompleted = r10
            int r9 = r9 % r0
            if (r9 == 0) goto L8f
            return
        L8f:
            r9 = 0
            r9.hashCode()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.PrepareSessionResponse.onExtraCallback(viva.republica.toss.network.model.verify.PrepareSessionResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 77;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return lazyArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PrepareSessionResponse(long j, boolean z, ReusedSessionScreenType reusedSessionScreenType, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        long j3;
        String str2;
        long j4 = (i & 1) != 0 ? -1L : j;
        if ((i & 2) != 0) {
            int i2 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        ReusedSessionScreenType reusedSessionScreenType2 = (i & 4) != 0 ? ReusedSessionScreenType.FULL_SCREEN : reusedSessionScreenType;
        if ((i & 8) != 0) {
            int i5 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j2;
        }
        if ((i & 16) != 0) {
            int i6 = onExtraCallbackWithResult + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = "";
        } else {
            str2 = str;
        }
        this(j4, z2, reusedSessionScreenType2, j3, str2);
    }

    public final long asBinder() {
        long j;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.sessionId;
            int i4 = 48 / 0;
        } else {
            j = this.sessionId;
        }
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.reusableSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReusedSessionScreenType onTransact() {
        ReusedSessionScreenType reusedSessionScreenType;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            reusedSessionScreenType = this.reusedSessionScreenType;
            int i4 = 43 / 0;
        } else {
            reusedSessionScreenType = this.reusedSessionScreenType;
        }
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return reusedSessionScreenType;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.idCardNotificationTermsId;
        if (i4 != 0) {
            int i5 = 46 / 0;
        }
        int i6 = i3 + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return j;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idCardNotificationConsentCode;
        int i5 = i2 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
