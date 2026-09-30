package im.toss.features.benefit.dto;

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
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AdMobConfig$$serializer implements aeu2<AdMobConfig> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AdMobConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 27;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AdMobConfig$$serializer adMobConfig$$serializer = new AdMobConfig$$serializer();
        INSTANCE = adMobConfig$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.AdMobConfig", adMobConfig$$serializer, 4);
        setanimationsloop.onWarmupCompleted("enable", true);
        setanimationsloop.onWarmupCompleted("retryCount", true);
        setanimationsloop.onWarmupCompleted("timeoutMillis", true);
        setanimationsloop.onWarmupCompleted("ratio", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 13;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private AdMobConfig$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, getDynamicHeight.onWarmupCompleted, oty1.onExtraCallback, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobConfig deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        boolean z;
        String str;
        int i2;
        long j;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i4 % 128;
        String str2 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            str2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 0;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 15;
            z = zOnExtraCallbackWithResult;
            i2 = iOnTransact;
            j = jIAuthTabCallbackDefault;
        } else {
            long jIAuthTabCallbackDefault2 = 0;
            int i6 = 1;
            int i7 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            int iOnTransact2 = 0;
            while (i6 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    i6 = i5;
                } else if (iOnNavigationEvent != 0) {
                    if (iOnNavigationEvent != 1) {
                        int i8 = onNavigationEvent;
                        int i9 = i8 + 77;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 4) {
                            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 2);
                            i7 |= 4;
                        } else {
                            int i10 = i8 + 37;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str2);
                            i7 |= 8;
                        }
                    } else {
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i7 |= 2;
                    }
                    i5 = 0;
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5);
                    i7 |= 1;
                    int i12 = onExtraCallbackWithResult + 125;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            i = i7;
            z = zOnExtraCallbackWithResult2;
            str = str2;
            i2 = iOnTransact2;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobConfig(i, z, i2, j, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m82deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AdMobConfig adMobConfigDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return adMobConfigDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobConfig adMobConfig) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adMobConfig, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdMobConfig.onWarmupCompleted(adMobConfig, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobConfig, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AdMobConfig.onWarmupCompleted(adMobConfig, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 76 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobConfig) obj);
        int i4 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
