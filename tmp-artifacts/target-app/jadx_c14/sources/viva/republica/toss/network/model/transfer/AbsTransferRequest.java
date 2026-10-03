package viva.republica.toss.network.model.transfer;

import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import o.NativeAnimatedModuleExternalSyntheticLambda3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypeUtils2;
import o.giw;
import o.liq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SignatureRequest;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public abstract class AbsTransferRequest extends SignatureRequest {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("clientLog")
    private TransferClientLog clientLog;

    @SerializedName("location")
    private TransferLocation location;

    @SerializedName("signingMethod")
    private TransferSigningMethod signingMethod;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnNavigationEvent = onNavigationEvent();
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return kSerializerOnNavigationEvent;
    }

    private static final /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            TransferSigningMethod.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<TransferSigningMethod> kSerializerSerializer = TransferSigningMethod.Companion.serializer();
        int i3 = onExtraCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer IAuthTabCallback() {
            KSerializer kSerializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializer = (KSerializer) AbsTransferRequest.onExtraCallbackWithResult().getValue();
                int i3 = 66 / 0;
            } else {
                kSerializer = (KSerializer) AbsTransferRequest.onExtraCallbackWithResult().getValue();
            }
            int i4 = onExtraCallbackWithResult + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer;
            }
            throw null;
        }

        public final KSerializer<AbsTransferRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<AbsTransferRequest> kSerializerIAuthTabCallback = IAuthTabCallback();
            int i4 = onExtraCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.AbsTransferRequest$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 7;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = AbsTransferRequest.onExtraCallback();
                int i4 = onExtraCallback + 105;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null};
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.transfer.AbsTransferRequest$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 27;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return AbsTransferRequest.onWarmupCompleted();
                }
                AbsTransferRequest.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = IAuthTabCallback + 85;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public AbsTransferRequest() {
        this.signingMethod = TransferSigningMethod.SKIP;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbsTransferRequest(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, viva.republica.toss.network.model.transfer.TransferLocation r14, viva.republica.toss.network.model.transfer.TransferSigningMethod r15, viva.republica.toss.network.model.transfer.TransferClientLog r16, o.okycx r17) {
        /*
            r8 = this;
            r7 = r8
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r9 & 16
            r1 = 0
            if (r0 != 0) goto L14
            r7.location = r1
            goto L17
        L14:
            r0 = r14
            r7.location = r0
        L17:
            r0 = r9 & 32
            r2 = 2
            if (r0 != 0) goto L36
            int r0 = viva.republica.toss.network.model.transfer.AbsTransferRequest.onExtraCallback
            int r0 = r0 + 73
            int r3 = r0 % 128
            viva.republica.toss.network.model.transfer.AbsTransferRequest.onWarmupCompleted = r3
            int r0 = r0 % r2
            if (r0 == 0) goto L30
            viva.republica.toss.network.model.transfer.TransferSigningMethod r0 = viva.republica.toss.network.model.transfer.TransferSigningMethod.SKIP
            r7.signingMethod = r0
            r0 = 22
            int r0 = r0 / 0
            goto L34
        L30:
            viva.republica.toss.network.model.transfer.TransferSigningMethod r0 = viva.republica.toss.network.model.transfer.TransferSigningMethod.SKIP
            r7.signingMethod = r0
        L34:
            int r2 = r2 % r2
            goto L44
        L36:
            r0 = r15
            r7.signingMethod = r0
            int r0 = viva.republica.toss.network.model.transfer.AbsTransferRequest.onExtraCallback
            int r0 = r0 + 117
            int r3 = r0 % 128
            viva.republica.toss.network.model.transfer.AbsTransferRequest.onWarmupCompleted = r3
            int r0 = r0 % r2
            if (r0 == 0) goto L34
        L44:
            r0 = r9 & 64
            if (r0 != 0) goto L4b
            r7.clientLog = r1
            return
        L4b:
            r0 = r16
            r7.clientLog = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.AbsTransferRequest.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, viva.republica.toss.network.model.transfer.TransferLocation, viva.republica.toss.network.model.transfer.TransferSigningMethod, viva.republica.toss.network.model.transfer.TransferClientLog, o.okycx):void");
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        giw giwVar = new giw(Reflection.getOrCreateKotlinClass(AbsTransferRequest.class), new Annotation[0]);
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return giwVar;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 == 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 16 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i3 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public final void onExtraCallbackWithResult(@Nullable TransferClientLog transferClientLog) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        this.clientLog = transferClientLog;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 1;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
    }

    @Override // viva.republica.toss.network.model.SignatureRequest
    public void onExtraCallbackWithResult(@NotNull TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(typeUtils2, "");
            super.onExtraCallbackWithResult(typeUtils2);
            this.signingMethod = NativeAnimatedModuleExternalSyntheticLambda3.onNavigationEvent(typeUtils2.IAuthTabCallback());
        } else {
            Intrinsics.checkNotNullParameter(typeUtils2, "");
            super.onExtraCallbackWithResult(typeUtils2);
            this.signingMethod = NativeAnimatedModuleExternalSyntheticLambda3.onNavigationEvent(typeUtils2.IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
