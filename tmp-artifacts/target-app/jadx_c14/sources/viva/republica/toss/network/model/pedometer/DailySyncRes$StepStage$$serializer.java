package viva.republica.toss.network.model.pedometer;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.pedometer.DailySyncRes;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DailySyncRes$StepStage$$serializer implements aeu2<DailySyncRes.StepStage> {
    private static int IAuthTabCallback = 0;
    public static final DailySyncRes$StepStage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 87;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DailySyncRes$StepStage$$serializer dailySyncRes$StepStage$$serializer = new DailySyncRes$StepStage$$serializer();
        INSTANCE = dailySyncRes$StepStage$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.pedometer.DailySyncRes.StepStage", dailySyncRes$StepStage$$serializer, 1);
        setanimationsloop.onWarmupCompleted("canFinish", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private DailySyncRes$StepStage$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getBgColor.IAuthTabCallback)};
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        DailySyncRes.StepStage stepStageM64deserialize = m64deserialize(decoder);
        int i4 = IAuthTabCallback + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return stepStageM64deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.pedometer.DailySyncRes.StepStage m64deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r12) throws kotlinx.serialization.UnknownFieldException {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.IAuthTabCallback
            int r1 = r1 + 35
            int r2 = r1 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.onNavigationEvent = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.descriptor
            o.yw r12 = r12.onWarmupCompleted(r1)
            boolean r2 = r12.extraCallbackWithResult()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L29
            o.getBgColor r2 = o.getBgColor.IAuthTabCallback
            java.lang.Object r2 = r12.onExtraCallbackWithResult(r1, r5, r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L5f
        L29:
            r2 = r3
            r6 = r4
            r7 = r5
        L2c:
            if (r6 == 0) goto L5e
            int r8 = viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.IAuthTabCallback
            int r8 = r8 + 121
            int r9 = r8 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.onNavigationEvent = r9
            int r8 = r8 % r0
            r9 = -1
            if (r8 != 0) goto L44
            int r8 = r12.onNavigationEvent(r1)
            r10 = 81
            int r10 = r10 / r5
            if (r8 == r9) goto L5c
            goto L4a
        L44:
            int r8 = r12.onNavigationEvent(r1)
            if (r8 == r9) goto L5c
        L4a:
            if (r8 != 0) goto L56
            o.getBgColor r7 = o.getBgColor.IAuthTabCallback
            java.lang.Object r2 = r12.onExtraCallbackWithResult(r1, r5, r7, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r7 = r4
            goto L2c
        L56:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r8)
            throw r12
        L5c:
            r6 = r5
            goto L2c
        L5e:
            r4 = r7
        L5f:
            r12.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage r12 = new viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage
            r12.<init>(r4, r2, r3)
            int r1 = viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.onNavigationEvent
            int r1 = r1 + 15
            int r2 = r1 % 128
            viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L75
            r0 = 74
            int r0 = r0 / r5
        L75:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage$$serializer.m64deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.pedometer.DailySyncRes$StepStage");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DailySyncRes.StepStage) obj);
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DailySyncRes.StepStage stepStage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(stepStage, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DailySyncRes.StepStage.onExtraCallback(stepStage, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stepStage, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DailySyncRes.StepStage.onExtraCallback(stepStage, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
