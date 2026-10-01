package im.toss.features.fx.model;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxRestrictionResponse$$serializer implements aeu2<FxRestrictionResponse> {
    private static int IAuthTabCallback = 0;
    public static final FxRestrictionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 93;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        FxRestrictionResponse$$serializer fxRestrictionResponse$$serializer = new FxRestrictionResponse$$serializer();
        INSTANCE = fxRestrictionResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.fx.model.FxRestrictionResponse", fxRestrictionResponse$$serializer, 2);
        setanimationsloop.onWarmupCompleted("isExchangeable", true);
        setanimationsloop.onWarmupCompleted("exchangeRestrictionInfo", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 63;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private FxRestrictionResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getBgColor.IAuthTabCallback, sp.IAuthTabCallback(ExchangeRestrictionInfo$$serializer.INSTANCE)};
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final FxRestrictionResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        ExchangeRestrictionInfo exchangeRestrictionInfo;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
            exchangeRestrictionInfo = (ExchangeRestrictionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ExchangeRestrictionInfo$$serializer.INSTANCE, (Object) null);
        } else {
            ExchangeRestrictionInfo exchangeRestrictionInfo2 = null;
            boolean zOnExtraCallbackWithResult2 = false;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = IAuthTabCallback + 49;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        exchangeRestrictionInfo2 = (ExchangeRestrictionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ExchangeRestrictionInfo$$serializer.INSTANCE, exchangeRestrictionInfo2);
                        i5 |= 2;
                        int i7 = onWarmupCompleted + 3;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        exchangeRestrictionInfo2 = (ExchangeRestrictionInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, ExchangeRestrictionInfo$$serializer.INSTANCE, exchangeRestrictionInfo2);
                        i5 |= 2;
                        int i72 = onWarmupCompleted + 3;
                        IAuthTabCallback = i72 % 128;
                        int i82 = i72 % 2;
                    }
                } else {
                    zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0);
                    i5 |= 1;
                    int i9 = onWarmupCompleted + 57;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            exchangeRestrictionInfo = exchangeRestrictionInfo2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new FxRestrictionResponse(i2, zOnExtraCallbackWithResult, exchangeRestrictionInfo, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m249deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FxRestrictionResponse fxRestrictionResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        int i5 = IAuthTabCallback + 63;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return fxRestrictionResponseDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull FxRestrictionResponse fxRestrictionResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fxRestrictionResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            FxRestrictionResponse.onExtraCallbackWithResult(fxRestrictionResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fxRestrictionResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        FxRestrictionResponse.onExtraCallbackWithResult(fxRestrictionResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 103;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (FxRestrictionResponse) obj);
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        int i5 = onWarmupCompleted + 75;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
