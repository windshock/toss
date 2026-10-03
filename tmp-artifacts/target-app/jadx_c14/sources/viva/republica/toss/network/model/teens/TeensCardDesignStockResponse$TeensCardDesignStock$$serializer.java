package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.teens.TeensCardDesignStockResponse;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TeensCardDesignStockResponse$TeensCardDesignStock$$serializer implements aeu2<TeensCardDesignStockResponse.TeensCardDesignStock> {
    private static int IAuthTabCallback = 1;
    public static final TeensCardDesignStockResponse$TeensCardDesignStock$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TeensCardDesignStockResponse$TeensCardDesignStock$$serializer teensCardDesignStockResponse$TeensCardDesignStock$$serializer = new TeensCardDesignStockResponse$TeensCardDesignStock$$serializer();
        INSTANCE = teensCardDesignStockResponse$TeensCardDesignStock$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.TeensCardDesignStockResponse.TeensCardDesignStock", teensCardDesignStockResponse$TeensCardDesignStock$$serializer, 2);
        setanimationsloop.onWarmupCompleted("design", false);
        setanimationsloop.onWarmupCompleted("stock", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 63;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TeensCardDesignStockResponse$TeensCardDesignStock$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArr = new KSerializer[5];
            kSerializerArr[0] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getDynamicHeight.onWarmupCompleted;
        } else {
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent, getDynamicHeight.onWarmupCompleted};
        }
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TeensCardDesignStockResponse.TeensCardDesignStock teensCardDesignStockM73deserialize = m73deserialize(decoder);
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return teensCardDesignStockM73deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047 A[PHI: r1 r14
      0x0047: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r1 r14
      0x0035: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.teens.TeensCardDesignStockResponse.TeensCardDesignStock m73deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r14) throws kotlinx.serialization.UnknownFieldException {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.IAuthTabCallback
            r2 = 3
            int r1 = r1 + r2
            int r3 = r1 % 128
            viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.onWarmupCompleted = r3
            int r1 = r1 % r0
            r3 = 0
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.descriptor
            o.yw r14 = r14.onWarmupCompleted(r1)
            boolean r4 = r14.extraCallbackWithResult()
            r7 = 87
            int r7 = r7 / r6
            if (r4 == 0) goto L47
            goto L35
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.descriptor
            o.yw r14 = r14.onWarmupCompleted(r1)
            boolean r4 = r14.extraCallbackWithResult()
            if (r4 == 0) goto L47
        L35:
            int r4 = viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.onWarmupCompleted
            int r4 = r4 + 79
            int r7 = r4 % 128
            viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.IAuthTabCallback = r7
            int r4 = r4 % r0
            java.lang.String r0 = r14.asInterface(r1, r6)
            int r4 = r14.onTransact(r1, r5)
            goto L86
        L47:
            r2 = r3
            r8 = r5
            r4 = r6
            r7 = r4
        L4b:
            if (r8 == 0) goto L83
            int r9 = r14.onNavigationEvent(r1)
            r10 = -1
            if (r9 == r10) goto L81
            int r10 = viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.IAuthTabCallback
            int r11 = r10 + 83
            int r12 = r11 % 128
            viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.onWarmupCompleted = r12
            int r11 = r11 % r0
            if (r9 == 0) goto L7a
            int r10 = r10 + 77
            int r7 = r10 % 128
            viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.onWarmupCompleted = r7
            int r10 = r10 % r0
            if (r10 == 0) goto L6b
            if (r9 != r5) goto L74
            goto L6d
        L6b:
            if (r9 != r5) goto L74
        L6d:
            int r7 = r14.onTransact(r1, r5)
            r4 = r4 | 2
            goto L4b
        L74:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r9)
            throw r14
        L7a:
            java.lang.String r2 = r14.asInterface(r1, r6)
            r4 = r4 | 1
            goto L4b
        L81:
            r8 = r6
            goto L4b
        L83:
            r0 = r2
            r2 = r4
            r4 = r7
        L86:
            r14.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock r14 = new viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock
            r14.<init>(r2, r0, r4, r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock$$serializer.m73deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.teens.TeensCardDesignStockResponse$TeensCardDesignStock");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TeensCardDesignStockResponse.TeensCardDesignStock) obj);
        int i4 = IAuthTabCallback + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TeensCardDesignStockResponse.TeensCardDesignStock teensCardDesignStock) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(teensCardDesignStock, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TeensCardDesignStockResponse.TeensCardDesignStock.onNavigationEvent(teensCardDesignStock, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(teensCardDesignStock, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TeensCardDesignStockResponse.TeensCardDesignStock.onNavigationEvent(teensCardDesignStock, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 47 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
