package im.toss.ads_sdk.remote.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SspSdkAdOption$$serializer implements aeu2<SspSdkAdOption> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final SspSdkAdOption$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        SspSdkAdOption$$serializer sspSdkAdOption$$serializer = new SspSdkAdOption$$serializer();
        INSTANCE = sspSdkAdOption$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SspSdkAdOption", sspSdkAdOption$$serializer, 3);
        setanimationsloop.onWarmupCompleted("adBadgeEnabled", true);
        setanimationsloop.onWarmupCompleted("skippableOffsetSeconds", true);
        setanimationsloop.onWarmupCompleted("refetchSeconds", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 1;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SspSdkAdOption$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, sp.IAuthTabCallback(getdynamicheight), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SspSdkAdOption deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i;
        Integer num;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Integer num2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            Integer num3 = null;
            i = 0;
            zOnExtraCallbackWithResult = false;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i |= 1;
                    int i3 = onExtraCallbackWithResult + 31;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                } else if (iOnNavigationEvent == 1) {
                    num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num3);
                    i |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getDynamicHeight.onWarmupCompleted, num2);
                    i |= 4;
                    int i5 = onWarmupCompleted + 57;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            num = num3;
        } else {
            int i7 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getdynamicheight, (Object) null);
            int i9 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            i = 7;
            num = num4;
        }
        Integer num5 = num2;
        int i11 = i;
        boolean z2 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SspSdkAdOption(i11, z2, num, num5, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m62deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SspSdkAdOption sspSdkAdOptionDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return sspSdkAdOptionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SspSdkAdOption sspSdkAdOption) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(sspSdkAdOption, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            SspSdkAdOption.onNavigationEvent(sspSdkAdOption, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sspSdkAdOption, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        SspSdkAdOption.onNavigationEvent(sspSdkAdOption, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SspSdkAdOption) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onWarmupCompleted + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }
}
