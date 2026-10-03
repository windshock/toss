package viva.republica.toss.network.model.loan;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DisbursementContent$$serializer implements aeu2<DisbursementContent> {
    private static int IAuthTabCallback = 1;
    public static final DisbursementContent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        DisbursementContent$$serializer disbursementContent$$serializer = new DisbursementContent$$serializer();
        INSTANCE = disbursementContent$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.loan.DisbursementContent", disbursementContent$$serializer, 3);
        setanimationsloop.onWarmupCompleted("iconUrl", false);
        setanimationsloop.onWarmupCompleted("mainText", false);
        setanimationsloop.onWarmupCompleted("timeText", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 107;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DisbursementContent$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onNavigationEvent + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DisbursementContent disbursementContentM27deserialize = m27deserialize(decoder);
        int i4 = onNavigationEvent + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return disbursementContentM27deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.loan.DisbursementContent m27deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r18) throws kotlinx.serialization.UnknownFieldException {
        /*
            r17 = this;
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.IAuthTabCallback
            r3 = 1
            int r2 = r2 + r3
            int r4 = r2 % 128
            viva.republica.toss.network.model.loan.DisbursementContent$$serializer.onNavigationEvent = r4
            int r2 = r2 % r1
            java.lang.String r4 = ""
            r5 = 0
            if (r2 != 0) goto La0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r4 = r0.extraCallbackWithResult()
            r6 = 0
            if (r4 == 0) goto L36
            java.lang.String r4 = r0.asInterface(r2, r6)
            java.lang.String r3 = r0.asInterface(r2, r3)
            java.lang.String r1 = r0.asInterface(r2, r1)
            r5 = 7
            r15 = r1
            r14 = r3
            r13 = r4
            r12 = r5
            goto L94
        L36:
            r9 = r3
            r7 = r5
            r8 = r7
            r4 = r6
        L3a:
            if (r9 == 0) goto L90
            int r10 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.IAuthTabCallback
            int r10 = r10 + 55
            int r11 = r10 % 128
            viva.republica.toss.network.model.loan.DisbursementContent$$serializer.onNavigationEvent = r11
            int r10 = r10 % r1
            int r10 = r0.onNavigationEvent(r2)
            r11 = -1
            if (r10 == r11) goto L8e
            int r11 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.IAuthTabCallback
            int r12 = r11 + 15
            int r13 = r12 % 128
            viva.republica.toss.network.model.loan.DisbursementContent$$serializer.onNavigationEvent = r13
            int r12 = r12 % r1
            if (r12 == 0) goto L5d
            r12 = 20
            int r12 = r12 / r6
            if (r10 == 0) goto L7e
            goto L5f
        L5d:
            if (r10 == 0) goto L7e
        L5f:
            if (r10 == r3) goto L77
            if (r10 != r1) goto L71
            int r11 = r11 + 81
            int r8 = r11 % 128
            viva.republica.toss.network.model.loan.DisbursementContent$$serializer.onNavigationEvent = r8
            int r11 = r11 % r1
            java.lang.String r8 = r0.asInterface(r2, r1)
            r4 = r4 | 4
            goto L3a
        L71:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L77:
            java.lang.String r5 = r0.asInterface(r2, r3)
            r4 = r4 | 2
            goto L3a
        L7e:
            java.lang.String r7 = r0.asInterface(r2, r6)
            r4 = r4 | 1
            int r10 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.IAuthTabCallback
            int r10 = r10 + 17
            int r11 = r10 % 128
            viva.republica.toss.network.model.loan.DisbursementContent$$serializer.onNavigationEvent = r11
            int r10 = r10 % r1
            goto L3a
        L8e:
            r9 = r6
            goto L3a
        L90:
            r12 = r4
            r14 = r5
            r13 = r7
            r15 = r8
        L94:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.loan.DisbursementContent r0 = new viva.republica.toss.network.model.loan.DisbursementContent
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            return r0
        La0:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.loan.DisbursementContent$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r1)
            r0.extraCallbackWithResult()
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.DisbursementContent$$serializer.m27deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.loan.DisbursementContent");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DisbursementContent) obj);
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DisbursementContent disbursementContent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(disbursementContent, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DisbursementContent.onNavigationEvent(disbursementContent, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
