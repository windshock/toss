package viva.republica.toss.network.model.transfer;

import im.toss.network.throwable.TossApiCallException;
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
import viva.republica.toss.network.model.transfer.GetNavigationResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GetNavigationResp {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String ERROR_CODE_INVALID_SESSION_KEY = "TE_INVALID_SESSION_KEY";
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final DestinationType destinationType;
    private final NavigationType navigationType;
    private final String tossBankWebUrl;

    public GetNavigationResp() {
        this((DestinationType) null, (NavigationType) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<NavigationType> kSerializerSerializer = NavigationType.Companion.serializer();
        int i4 = onExtraCallbackWithResult + 73;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    private static final /* synthetic */ KSerializer asInterface() {
        KSerializer<DestinationType> kSerializerSerializer;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerSerializer = DestinationType.Companion.serializer();
            int i3 = 49 / 0;
        } else {
            kSerializerSerializer = DestinationType.Companion.serializer();
        }
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface();
        }
        asInterface();
        throw null;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return kSerializerIAuthTabCallbackStub;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNavigationResp)) {
            return false;
        }
        GetNavigationResp getNavigationResp = (GetNavigationResp) obj;
        if (this.destinationType != getNavigationResp.destinationType) {
            int i2 = onExtraCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.navigationType != getNavigationResp.navigationType) {
            int i3 = onExtraCallback + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.tossBankWebUrl, getNavigationResp.tossBankWebUrl))) {
            return true;
        }
        int i5 = onExtraCallback + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
      0x001c: PHI (r1v11 viva.republica.toss.network.model.transfer.DestinationType) = 
      (r1v4 viva.republica.toss.network.model.transfer.DestinationType)
      (r1v13 viva.republica.toss.network.model.transfer.DestinationType)
     binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r3v8 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
      0x001a: PHI (r3v1 int) = (r3v0 int), (r3v9 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r1 = r1 + 63
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            viva.republica.toss.network.model.transfer.DestinationType r1 = r6.destinationType
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            viva.republica.toss.network.model.transfer.DestinationType r1 = r6.destinationType
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            viva.republica.toss.network.model.transfer.NavigationType r4 = r6.navigationType
            if (r4 != 0) goto L2e
            int r4 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r4 = r4 + 105
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            goto L32
        L2e:
            int r2 = r4.hashCode()
        L32:
            java.lang.String r4 = r6.tossBankWebUrl
            if (r4 == 0) goto L58
            int r3 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r3 = r3 + 19
            int r5 = r3 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L53
            int r3 = r4.hashCode()
            int r4 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r4 = r4 + 61
            int r5 = r4 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L58
            r0 = 4
            int r0 = r0 % r0
            goto L58
        L53:
            r4.hashCode()
            r0 = 0
            throw r0
        L58:
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.GetNavigationResp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetNavigationResp(destinationType=" + this.destinationType + ", navigationType=" + this.navigationType + ", tossBankWebUrl=" + this.tossBankWebUrl + ")";
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    public /* synthetic */ GetNavigationResp(int i, DestinationType destinationType, NavigationType navigationType, String str, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.destinationType = null;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } else {
            this.destinationType = destinationType;
        }
        if ((i & 2) == 0) {
            this.navigationType = null;
        } else {
            this.navigationType = navigationType;
        }
        if ((i & 4) == 0) {
            this.tossBankWebUrl = null;
            return;
        }
        this.tossBankWebUrl = str;
        int i5 = onExtraCallbackWithResult + 105;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public GetNavigationResp(@Nullable DestinationType destinationType, @Nullable NavigationType navigationType, @Nullable String str) {
        this.destinationType = destinationType;
        this.navigationType = navigationType;
        this.tossBankWebUrl = str;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.transfer.GetNavigationResp r5, o.vyl r6, kotlinx.serialization.descriptors.SerialDescriptor r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r1 = r1 + 65
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.transfer.GetNavigationResp.$childSerializers
            r2 = 0
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L29
            int r3 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r3 = r3 + 53
            int r4 = r3 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L25
            viva.republica.toss.network.model.transfer.DestinationType r3 = r5.destinationType
            if (r3 == 0) goto L36
            goto L29
        L25:
            viva.republica.toss.network.model.transfer.DestinationType r5 = r5.destinationType
            r5 = 0
            throw r5
        L29:
            r3 = r1[r2]
            java.lang.Object r3 = r3.getValue()
            o.py r3 = (o.py) r3
            viva.republica.toss.network.model.transfer.DestinationType r4 = r5.destinationType
            r6.onExtraCallbackWithResult(r7, r2, r3, r4)
        L36:
            r2 = 1
            boolean r3 = r6.onWarmupCompleted(r7, r2)
            if (r3 != 0) goto L41
            viva.republica.toss.network.model.transfer.NavigationType r3 = r5.navigationType
            if (r3 == 0) goto L4e
        L41:
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.transfer.NavigationType r3 = r5.navigationType
            r6.onExtraCallbackWithResult(r7, r2, r1, r3)
        L4e:
            boolean r1 = r6.onWarmupCompleted(r7, r0)
            if (r1 != 0) goto L61
            int r1 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r1 = r1 + 29
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            java.lang.String r1 = r5.tossBankWebUrl
            if (r1 == 0) goto L68
        L61:
            o.getWriggleLayout r1 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r5.tossBankWebUrl
            r6.onExtraCallbackWithResult(r7, r0, r1, r5)
        L68:
            int r5 = viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallback
            int r5 = r5 + 9
            int r6 = r5 % 128
            viva.republica.toss.network.model.transfer.GetNavigationResp.onExtraCallbackWithResult = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.GetNavigationResp.onWarmupCompleted(viva.republica.toss.network.model.transfer.GetNavigationResp, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetNavigationResp(DestinationType destinationType, NavigationType navigationType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 17;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            destinationType = null;
        }
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
            navigationType = null;
        }
        if ((i & 4) != 0) {
            int i8 = onExtraCallback + 85;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            str = null;
        }
        this(destinationType, navigationType, str);
    }

    public final DestinationType onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DestinationType destinationType = this.destinationType;
        int i4 = i3 + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return destinationType;
        }
        obj.hashCode();
        throw null;
    }

    public final NavigationType IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        NavigationType navigationType = this.navigationType;
        int i5 = i3 + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return navigationType;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.tossBankWebUrl;
        int i4 = i3 + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNavigationResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            GetNavigationResp$.serializer serializerVar = GetNavigationResp$.serializer.INSTANCE;
            int i4 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return serializerVar;
        }

        public final boolean onExtraCallbackWithResult(@NotNull Throwable th) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if ((th instanceof TossApiCallException.ApiError) && Intrinsics.areEqual(((TossApiCallException.ApiError) th).asBinder(), GetNavigationResp.ERROR_CODE_INVALID_SESSION_KEY)) {
                int i2 = onExtraCallbackWithResult + 5;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.GetNavigationResp$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = GetNavigationResp.onExtraCallbackWithResult();
                int i4 = onExtraCallback + 113;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.GetNavigationResp$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 75;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnWarmupCompleted = GetNavigationResp.onWarmupCompleted();
                int i4 = IAuthTabCallback + 1;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerOnWarmupCompleted;
                }
                throw null;
            }
        }), null};
        int i = IAuthTabCallback + 83;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
