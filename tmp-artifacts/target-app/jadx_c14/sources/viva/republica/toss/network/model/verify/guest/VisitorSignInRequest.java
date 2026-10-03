package viva.republica.toss.network.model.verify.guest;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.oty1;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.guest.VisitorSignInRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VisitorSignInRequest {
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.verify.guest.VisitorSignInRequest$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return VisitorSignInRequest.onExtraCallback();
            }
            VisitorSignInRequest.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }), null};
    public static final Companion Companion;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String password;
    private final nativeReadByte passwordFormat;
    private final Long selfieSessionId;
    private final long sessionId;

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if ((r8 instanceof viva.republica.toss.network.model.verify.guest.VisitorSignInRequest) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r8 = (viva.republica.toss.network.model.verify.guest.VisitorSignInRequest) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r7.sessionId == r8.sessionId) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.password, r8.password) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r7.passwordFormat == r8.passwordFormat) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r8 = viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult + 41;
        viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onWarmupCompleted = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.selfieSessionId, r8.selfieSessionId) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r8 = viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult + 107;
        viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onWarmupCompleted = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 77;
        viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onWarmupCompleted
            int r2 = r1 + 79
            int r3 = r2 % 128
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 78
            int r2 = r2 / r4
            if (r7 != r8) goto L24
            goto L18
        L16:
            if (r7 != r8) goto L24
        L18:
            int r1 = r1 + 77
            int r8 = r1 % 128
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult = r8
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            return r3
        L22:
            r8 = 0
            throw r8
        L24:
            boolean r1 = r8 instanceof viva.republica.toss.network.model.verify.guest.VisitorSignInRequest
            if (r1 != 0) goto L29
            return r4
        L29:
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest r8 = (viva.republica.toss.network.model.verify.guest.VisitorSignInRequest) r8
            long r1 = r7.sessionId
            long r5 = r8.sessionId
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r4
        L34:
            java.lang.String r1 = r7.password
            java.lang.String r2 = r8.password
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3f
            return r4
        L3f:
            o.nativeReadByte r1 = r7.passwordFormat
            o.nativeReadByte r2 = r8.passwordFormat
            if (r1 == r2) goto L4f
            int r8 = viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult
            int r8 = r8 + 41
            int r1 = r8 % 128
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onWarmupCompleted = r1
            int r8 = r8 % r0
            return r4
        L4f:
            java.lang.Long r1 = r7.selfieSessionId
            java.lang.Long r8 = r8.selfieSessionId
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r8 != 0) goto L63
            int r8 = viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onExtraCallbackWithResult
            int r8 = r8 + 107
            int r1 = r8 % 128
            viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.onWarmupCompleted = r1
            int r8 = r8 % r0
            return r4
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.verify.guest.VisitorSignInRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.sessionId);
        int iHashCode3 = this.password.hashCode();
        int iHashCode4 = this.passwordFormat.hashCode();
        Long l = this.selfieSessionId;
        if (l == null) {
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i5 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VisitorSignInRequest(sessionId=" + this.sessionId + ", password=" + this.password + ", passwordFormat=" + this.passwordFormat + ", selfieSessionId=" + this.selfieSessionId + ")";
        int i2 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<VisitorSignInRequest> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            VisitorSignInRequest$.serializer serializerVar = VisitorSignInRequest$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onNavigationEvent + 119;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ VisitorSignInRequest(int i, long j, String str, nativeReadByte nativereadbyte, Long l, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = VisitorSignInRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 39;
            } else {
                descriptor = VisitorSignInRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.sessionId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        if ((i & 8) == 0) {
            this.selfieSessionId = null;
        } else {
            this.selfieSessionId = l;
        }
    }

    public VisitorSignInRequest(long j, @NotNull String str, @NotNull nativeReadByte nativereadbyte, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        this.sessionId = j;
        this.password = str;
        this.passwordFormat = nativereadbyte;
        this.selfieSessionId = l;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(VisitorSignInRequest visitorSignInRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, visitorSignInRequest.sessionId);
        vylVar.onExtraCallback(serialDescriptor, 1, visitorSignInRequest.password);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), visitorSignInRequest.passwordFormat);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (visitorSignInRequest.selfieSessionId == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 3, oty1.onExtraCallback, visitorSignInRequest.selfieSessionId);
        int i6 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VisitorSignInRequest(long j, String str, nativeReadByte nativereadbyte, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            l = null;
        }
        this(j, str, nativereadbyte, l);
    }
}
