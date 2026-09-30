package viva.republica.toss.network.model.teens;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TeensMinorChargingMethodResponse$$serializer implements aeu2<TeensMinorChargingMethodResponse> {
    private static int IAuthTabCallback = 0;
    public static final TeensMinorChargingMethodResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 27;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return serialDescriptor;
    }

    static {
        TeensMinorChargingMethodResponse$$serializer teensMinorChargingMethodResponse$$serializer = new TeensMinorChargingMethodResponse$$serializer();
        INSTANCE = teensMinorChargingMethodResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.TeensMinorChargingMethodResponse", teensMinorChargingMethodResponse$$serializer, 1);
        setanimationsloop.onWarmupCompleted("methods", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TeensMinorChargingMethodResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {TeensMinorChargingMethodResponse.onNavigationEvent()[0].getValue()};
        int i4 = IAuthTabCallback + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return m80deserialize(decoder);
        }
        m80deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TeensMinorChargingMethodResponse m80deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TeensMinorChargingMethodResponse.onNavigationEvent();
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = IAuthTabCallback + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
        } else {
            list = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 93;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), list);
                    i5 = 1;
                } else {
                    int i8 = onNavigationEvent + 61;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z = false;
                }
            }
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TeensMinorChargingMethodResponse(i2, list, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TeensMinorChargingMethodResponse) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TeensMinorChargingMethodResponse teensMinorChargingMethodResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(teensMinorChargingMethodResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TeensMinorChargingMethodResponse.IAuthTabCallback(teensMinorChargingMethodResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallback + 89;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
