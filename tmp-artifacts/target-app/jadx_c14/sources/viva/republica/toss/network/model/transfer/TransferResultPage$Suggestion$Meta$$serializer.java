package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$Suggestion$Meta$$serializer implements aeu2<TransferResultPage.Suggestion.Meta> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final TransferResultPage$Suggestion$Meta$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 19;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 31;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return serialDescriptor;
    }

    static {
        TransferResultPage$Suggestion$Meta$$serializer transferResultPage$Suggestion$Meta$$serializer = new TransferResultPage$Suggestion$Meta$$serializer();
        INSTANCE = transferResultPage$Suggestion$Meta$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta", transferResultPage$Suggestion$Meta$$serializer, 1);
        setanimationsloop.onWarmupCompleted("withdrawalBankCode", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 77;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    private TransferResultPage$Suggestion$Meta$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)} : new KSerializer[]{sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted)};
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            m124deserialize(decoder);
            throw null;
        }
        TransferResultPage.Suggestion.Meta metaM124deserialize = m124deserialize(decoder);
        int i3 = onExtraCallback + 41;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return metaM124deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.Suggestion.Meta m124deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r12) throws kotlinx.serialization.UnknownFieldException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.descriptor
            o.yw r12 = r12.onWarmupCompleted(r1)
            boolean r2 = r12.extraCallbackWithResult()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            int r2 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallback
            int r2 = r2 + 117
            int r6 = r2 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallbackWithResult = r6
            int r2 = r2 % r0
            o.getDynamicHeight r2 = o.getDynamicHeight.onWarmupCompleted
            java.lang.Object r2 = r12.onExtraCallbackWithResult(r1, r5, r2, r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L71
        L29:
            r2 = r3
            r6 = r4
            r7 = r5
        L2c:
            if (r6 == 0) goto L70
            int r8 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallbackWithResult
            int r8 = r8 + 79
            int r9 = r8 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallback = r9
            int r8 = r8 % r0
            r9 = -1
            if (r8 == 0) goto L44
            int r8 = r12.onNavigationEvent(r1)
            r10 = 14
            int r10 = r10 / r5
            if (r8 == r9) goto L6e
            goto L4a
        L44:
            int r8 = r12.onNavigationEvent(r1)
            if (r8 == r9) goto L6e
        L4a:
            if (r8 != 0) goto L68
            int r7 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallbackWithResult
            int r7 = r7 + 99
            int r8 = r7 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallback = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L5e
            o.getDynamicHeight r7 = o.getDynamicHeight.onWarmupCompleted
            java.lang.Object r2 = r12.onExtraCallbackWithResult(r1, r4, r7, r2)
            goto L64
        L5e:
            o.getDynamicHeight r7 = o.getDynamicHeight.onWarmupCompleted
            java.lang.Object r2 = r12.onExtraCallbackWithResult(r1, r5, r7, r2)
        L64:
            java.lang.Integer r2 = (java.lang.Integer) r2
            r7 = r4
            goto L2c
        L68:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r8)
            throw r12
        L6e:
            r6 = r5
            goto L2c
        L70:
            r4 = r7
        L71:
            r12.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta r12 = new viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta
            r12.<init>(r4, r2, r3)
            int r1 = viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallback
            int r1 = r1 + 13
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.onExtraCallbackWithResult = r2
            int r1 = r1 % r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta$$serializer.m124deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$Suggestion$Meta");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.Suggestion.Meta) obj);
        int i4 = onExtraCallbackWithResult + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.Suggestion.Meta meta) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(meta, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TransferResultPage.Suggestion.Meta.onExtraCallback(meta, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(meta, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TransferResultPage.Suggestion.Meta.onExtraCallback(meta, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
