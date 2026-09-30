package im.toss.ads_sdk.remote.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class AdMobPaidAdValue$$serializer implements aeu2<AdMobPaidAdValue> {
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AdMobPaidAdValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AdMobPaidAdValue$$serializer adMobPaidAdValue$$serializer = new AdMobPaidAdValue$$serializer();
        INSTANCE = adMobPaidAdValue$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.AdMobPaidAdValue", adMobPaidAdValue$$serializer, 3);
        setanimationsloop.onWarmupCompleted("valueMicros", true);
        setanimationsloop.onWarmupCompleted("currencyCode", false);
        setanimationsloop.onWarmupCompleted("precisionType", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private AdMobPaidAdValue$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(oty1.onExtraCallback), getwrigglelayout, getwrigglelayout};
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AdMobPaidAdValue deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Long l;
        String str;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Long l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            l = l2;
            str = strAsInterface3;
            i = 7;
        } else {
            int i5 = 0;
            Long l3 = null;
            String strAsInterface4 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = onExtraCallback + 21;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, oty1.onExtraCallback, l3);
                    i5 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i8 = onExtraCallbackWithResult + 51;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i5 |= 4;
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                    int i9 = onExtraCallback + 53;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            int i11 = onExtraCallbackWithResult + 3;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            l = l3;
            str = strAsInterface2;
            strAsInterface = strAsInterface4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AdMobPaidAdValue(i, l, str, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        AdMobPaidAdValue adMobPaidAdValueDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 115;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return adMobPaidAdValueDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AdMobPaidAdValue adMobPaidAdValue) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(adMobPaidAdValue, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AdMobPaidAdValue.onWarmupCompleted(adMobPaidAdValue, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(adMobPaidAdValue, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AdMobPaidAdValue.onWarmupCompleted(adMobPaidAdValue, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 13;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AdMobPaidAdValue) obj);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
