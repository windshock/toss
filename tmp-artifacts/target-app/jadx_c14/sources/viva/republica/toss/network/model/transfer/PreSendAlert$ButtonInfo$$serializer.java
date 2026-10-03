package viva.republica.toss.network.model.transfer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.PreSendAlert;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PreSendAlert$ButtonInfo$$serializer implements aeu2<PreSendAlert.ButtonInfo> {
    private static int IAuthTabCallback = 0;
    public static final PreSendAlert$ButtonInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PreSendAlert$ButtonInfo$$serializer preSendAlert$ButtonInfo$$serializer = new PreSendAlert$ButtonInfo$$serializer();
        INSTANCE = preSendAlert$ButtonInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo", preSendAlert$ButtonInfo$$serializer, 2);
        setanimationsloop.onWarmupCompleted("primary", true);
        setanimationsloop.onWarmupCompleted("secondary", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 5;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private PreSendAlert$ButtonInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PreSendAlert$Button$$serializer preSendAlert$Button$$serializer = PreSendAlert$Button$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(preSendAlert$Button$$serializer), sp.IAuthTabCallback(preSendAlert$Button$$serializer)};
        int i4 = onNavigationEvent + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m90deserialize(decoder);
            throw null;
        }
        PreSendAlert.ButtonInfo buttonInfoM90deserialize = m90deserialize(decoder);
        int i3 = onExtraCallback + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return buttonInfoM90deserialize;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.PreSendAlert.ButtonInfo m90deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r13) throws kotlinx.serialization.UnknownFieldException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L30
            int r2 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onNavigationEvent
            int r2 = r2 + 121
            int r6 = r2 % 128
            viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onExtraCallback = r6
            int r2 = r2 % r0
            viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer r0 = viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer.INSTANCE
            java.lang.Object r2 = r13.onExtraCallbackWithResult(r1, r4, r0, r3)
            viva.republica.toss.network.model.transfer.PreSendAlert$Button r2 = (viva.republica.toss.network.model.transfer.PreSendAlert.Button) r2
            java.lang.Object r0 = r13.onExtraCallbackWithResult(r1, r5, r0, r3)
            viva.republica.toss.network.model.transfer.PreSendAlert$Button r0 = (viva.republica.toss.network.model.transfer.PreSendAlert.Button) r0
            r4 = 3
            goto L39
        L30:
            r2 = r3
            r6 = r2
            r7 = r4
            r8 = r5
        L34:
            if (r8 == r5) goto L42
            r0 = r2
            r2 = r6
            r4 = r7
        L39:
            r13.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo r13 = new viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo
            r13.<init>(r4, r2, r0, r3)
            return r13
        L42:
            int r9 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onExtraCallback
            int r9 = r9 + 9
            int r10 = r9 % 128
            viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onNavigationEvent = r10
            int r9 = r9 % r0
            r10 = -1
            if (r9 == 0) goto L58
            int r9 = r13.onNavigationEvent(r1)
            r11 = 75
            int r11 = r11 / r4
            if (r9 == r10) goto L8c
            goto L5e
        L58:
            int r9 = r13.onNavigationEvent(r1)
            if (r9 == r10) goto L8c
        L5e:
            if (r9 == 0) goto L81
            int r10 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onNavigationEvent
            int r10 = r10 + 119
            int r11 = r10 % 128
            viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onExtraCallback = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L6e
            if (r9 != 0) goto L7b
            goto L70
        L6e:
            if (r9 != r5) goto L7b
        L70:
            viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer r9 = viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer.INSTANCE
            java.lang.Object r2 = r13.onExtraCallbackWithResult(r1, r5, r9, r2)
            viva.republica.toss.network.model.transfer.PreSendAlert$Button r2 = (viva.republica.toss.network.model.transfer.PreSendAlert.Button) r2
            r7 = r7 | 2
            goto L34
        L7b:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L81:
            viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer r9 = viva.republica.toss.network.model.transfer.PreSendAlert$Button$$serializer.INSTANCE
            java.lang.Object r6 = r13.onExtraCallbackWithResult(r1, r4, r9, r6)
            viva.republica.toss.network.model.transfer.PreSendAlert$Button r6 = (viva.republica.toss.network.model.transfer.PreSendAlert.Button) r6
            r7 = r7 | 1
            goto L34
        L8c:
            int r8 = viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onExtraCallback
            int r8 = r8 + 61
            int r9 = r8 % 128
            viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.onNavigationEvent = r9
            int r8 = r8 % 2
            r8 = r4
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo$$serializer.m90deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.PreSendAlert$ButtonInfo");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PreSendAlert.ButtonInfo) obj);
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PreSendAlert.ButtonInfo buttonInfo) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(buttonInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PreSendAlert.ButtonInfo.onExtraCallback(buttonInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallback + 121;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
