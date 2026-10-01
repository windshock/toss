package im.toss.features.home.core.remote.model;

import im.toss.features.home.core.remote.model.OverviewResponse;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class OverviewResponse$ExchangeRateResponse$$serializer implements aeu2<OverviewResponse.ExchangeRateResponse> {
    private static int IAuthTabCallback = 0;
    public static final OverviewResponse$ExchangeRateResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        OverviewResponse$ExchangeRateResponse$$serializer overviewResponse$ExchangeRateResponse$$serializer = new OverviewResponse$ExchangeRateResponse$$serializer();
        INSTANCE = overviewResponse$ExchangeRateResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.OverviewResponse.ExchangeRateResponse", overviewResponse$ExchangeRateResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("currencies", true);
        setanimationsloop.onWarmupCompleted("ctaButtonInfos", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 17;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    private OverviewResponse$ExchangeRateResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnExtraCallback = OverviewResponse.ExchangeRateResponse.onExtraCallback();
            return new KSerializer[]{sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[0].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[1].getValue())};
        }
        Lazy[] lazyArrOnExtraCallback2 = OverviewResponse.ExchangeRateResponse.onExtraCallback();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback2[1].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback2[1].getValue());
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[1] = kSerializerIAuthTabCallback;
        kSerializerArr[1] = kSerializerIAuthTabCallback2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewResponse.ExchangeRateResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = OverviewResponse.ExchangeRateResponse.onExtraCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            i = 3;
        } else {
            List list3 = null;
            List list4 = null;
            int i3 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i4 = onExtraCallback;
                    int i5 = i4 + 1;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list3);
                        i3 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i7 = i4 + 33;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list4);
                            i3 |= 5;
                        } else {
                            list4 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list4);
                            i3 |= 2;
                        }
                        int i8 = onExtraCallback + 17;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } else {
                    z = false;
                }
            }
            list = list3;
            list2 = list4;
            i = i3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewResponse.ExchangeRateResponse(i, list, list2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m545deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        OverviewResponse.ExchangeRateResponse exchangeRateResponseDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return exchangeRateResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewResponse.ExchangeRateResponse exchangeRateResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exchangeRateResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewResponse.ExchangeRateResponse.onWarmupCompleted(exchangeRateResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 103;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewResponse.ExchangeRateResponse) obj);
        int i4 = onExtraCallback + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
