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
import o.dj3;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse$TossBankCurrencyTrend;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer implements aeu2<TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot> {
    private static int IAuthTabCallback = 0;
    public static final TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer tossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer = new TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer();
        INSTANCE = tossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse.TossBankCurrencyTrend.Dot", tossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer, 1);
        setanimationsloop.onWarmupCompleted("rate", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 11;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TossBankCurrencyTrendResponse$TossBankCurrencyTrend$Dot$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{dj3.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = dj3.onWarmupCompleted;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return m35deserialize(decoder);
        }
        m35deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot m35deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            int i5 = 0;
            boolean z = true;
            while (!(!z)) {
                int i6 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = IAuthTabCallback + 15;
                    int i8 = i7 % 128;
                    onExtraCallbackWithResult = i8;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i9 = i8 + 57;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
                    i5 = 1;
                } else {
                    int i11 = IAuthTabCallback + 71;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 3 / 4;
                    }
                    z = false;
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i4 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot(i4, fOnWarmupCompleted, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot dot) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(dot, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend.Dot.onExtraCallback(dot, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
