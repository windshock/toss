package im.toss.features.home.core.model;

import im.toss.features.home.core.model.TossStreamAdvertiseRequestDto;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossStreamAdvertiseRequestDto$Device$$serializer implements aeu2<TossStreamAdvertiseRequestDto.Device> {
    private static int IAuthTabCallback = 0;
    public static final TossStreamAdvertiseRequestDto$Device$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TossStreamAdvertiseRequestDto$Device$$serializer tossStreamAdvertiseRequestDto$Device$$serializer = new TossStreamAdvertiseRequestDto$Device$$serializer();
        INSTANCE = tossStreamAdvertiseRequestDto$Device$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.model.TossStreamAdvertiseRequestDto.Device", tossStreamAdvertiseRequestDto$Device$$serializer, 5);
        setanimationsloop.onWarmupCompleted("os", true);
        setanimationsloop.onWarmupCompleted("osVersion", false);
        setanimationsloop.onWarmupCompleted("model", false);
        setanimationsloop.onWarmupCompleted("ifa", false);
        setanimationsloop.onWarmupCompleted("carrier", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 67;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TossStreamAdvertiseRequestDto$Device$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {TossStreamAdvertiseRequestDto.Device.onNavigationEvent()[0].getValue(), getwrigglelayout, getwrigglelayout, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TossStreamAdvertiseRequestDto.Device deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        String str2;
        String str3;
        TossStreamAdvertiseRequestDto.Device.Os os;
        String str4;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = TossStreamAdvertiseRequestDto.Device.onNavigationEvent();
        int i3 = 1;
        String str5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            TossStreamAdvertiseRequestDto.Device.Os os2 = (TossStreamAdvertiseRequestDto.Device.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), (Object) null);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str3 = strAsInterface2;
            os = os2;
            str4 = strAsInterface;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            i = 31;
        } else {
            boolean z = true;
            int i4 = 0;
            String str6 = null;
            String strAsInterface3 = null;
            TossStreamAdvertiseRequestDto.Device.Os os3 = null;
            String strAsInterface4 = null;
            while (z) {
                int i5 = onExtraCallbackWithResult + 5;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    os3 = (TossStreamAdvertiseRequestDto.Device.Os) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnNavigationEvent[0].getValue(), os3);
                    i4 |= 1;
                } else if (iOnNavigationEvent != i3) {
                    int i7 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 2) {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i4 |= 4;
                    } else if (iOnNavigationEvent == 3) {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                        i4 |= 8;
                    } else {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                        i4 |= 16;
                    }
                    i3 = 1;
                } else {
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                    i4 |= 2;
                }
            }
            i = i4;
            str = str5;
            str2 = str6;
            str3 = strAsInterface3;
            os = os3;
            str4 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossStreamAdvertiseRequestDto.Device(i, os, str4, str3, str, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m517deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossStreamAdvertiseRequestDto.Device deviceDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 61;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deviceDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossStreamAdvertiseRequestDto.Device device) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(device, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TossStreamAdvertiseRequestDto.Device.IAuthTabCallback(device, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(device, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TossStreamAdvertiseRequestDto.Device.IAuthTabCallback(device, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossStreamAdvertiseRequestDto.Device) obj);
        int i4 = onExtraCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
