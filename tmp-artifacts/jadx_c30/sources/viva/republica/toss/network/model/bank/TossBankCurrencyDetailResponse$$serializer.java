package viva.republica.toss.network.model.bank;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.aeu2;
import o.getDynamicHeight;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankCurrencyDetailResponse$$serializer implements aeu2<TossBankCurrencyDetailResponse> {
    private static int IAuthTabCallback = 1;
    public static final TossBankCurrencyDetailResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 61;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 71 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TossBankCurrencyDetailResponse$$serializer tossBankCurrencyDetailResponse$$serializer = new TossBankCurrencyDetailResponse$$serializer();
        INSTANCE = tossBankCurrencyDetailResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.TossBankCurrencyDetailResponse", tossBankCurrencyDetailResponse$$serializer, 4);
        setanimationsloop.onWarmupCompleted("base", true);
        setanimationsloop.onWarmupCompleted("exchangeRate", true);
        setanimationsloop.onWarmupCompleted("exchangeRateScale", true);
        setanimationsloop.onWarmupCompleted("differenceFromComparisonDate", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 111;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossBankCurrencyDetailResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            return new KSerializer[]{TossBankCurrency$$serializer.INSTANCE, setvideolistener, getDynamicHeight.onWarmupCompleted, setvideolistener};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[1] = TossBankCurrency$$serializer.INSTANCE;
        setVideoListener setvideolistener2 = setVideoListener.onWarmupCompleted;
        kSerializerArr[1] = setvideolistener2;
        kSerializerArr[2] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[2] = setvideolistener2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossBankCurrencyDetailResponse tossBankCurrencyDetailResponseM32deserialize = m32deserialize(decoder);
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tossBankCurrencyDetailResponseM32deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossBankCurrencyDetailResponse m32deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        TossBankCurrency tossBankCurrency;
        double dIAuthTabCallback;
        int iOnTransact;
        double dIAuthTabCallback2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            dIAuthTabCallback2 = 0.0d;
            boolean z = true;
            dIAuthTabCallback = 0.0d;
            iOnTransact = 0;
            i = 0;
            tossBankCurrency = null;
            while (z) {
                int i5 = onExtraCallback + 11;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onNavigationEvent + 33;
                    int i7 = i6 % 128;
                    onExtraCallback = i7;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        tossBankCurrency = (TossBankCurrency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TossBankCurrency$$serializer.INSTANCE, tossBankCurrency);
                        i |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i8 = i7 + 43;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                            i |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                            i |= 8;
                        }
                    } else {
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
                        i |= 4;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i9 = onNavigationEvent + 39;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            tossBankCurrency = (TossBankCurrency) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, TossBankCurrency$$serializer.INSTANCE, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 2);
            dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            i = 15;
        }
        double d = dIAuthTabCallback;
        int i11 = iOnTransact;
        int i12 = i;
        TossBankCurrency tossBankCurrency2 = tossBankCurrency;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankCurrencyDetailResponse(i12, tossBankCurrency2, d, i11, dIAuthTabCallback2, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossBankCurrencyDetailResponse) obj);
        int i4 = onNavigationEvent + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankCurrencyDetailResponse tossBankCurrencyDetailResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(tossBankCurrencyDetailResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankCurrencyDetailResponse.IAuthTabCallback(tossBankCurrencyDetailResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
