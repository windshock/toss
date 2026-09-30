package viva.republica.toss.network.model.bank;

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
import o.dj3;
import o.jp;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer implements aeu2<TossBankCurrencyTrendResponse$TossBankCurrencyTrend> {
    private static int IAuthTabCallback = 0;
    public static final TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer tossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer = new TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer();
        INSTANCE = tossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.bank.TossBankCurrencyTrendResponse.TossBankCurrencyTrend", tossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer, 4);
        setanimationsloop.onWarmupCompleted("minRate", true);
        setanimationsloop.onWarmupCompleted("maxRate", true);
        setanimationsloop.onWarmupCompleted("dots", true);
        setanimationsloop.onWarmupCompleted("graphEntries", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private TossBankCurrencyTrendResponse$TossBankCurrencyTrend$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrOnExtraCallback = TossBankCurrencyTrendResponse$TossBankCurrencyTrend.onExtraCallback();
            ?? r5 = new KSerializer[5];
            dj3 dj3Var = dj3.onWarmupCompleted;
            r5[1] = dj3Var;
            r5[0] = dj3Var;
            r5[5] = lazyArrOnExtraCallback[5].getValue();
            r5[2] = lazyArrOnExtraCallback[2].getValue();
            kSerializerArr = r5;
        } else {
            Lazy[] lazyArrOnExtraCallback2 = TossBankCurrencyTrendResponse$TossBankCurrencyTrend.onExtraCallback();
            dj3 dj3Var2 = dj3.onWarmupCompleted;
            kSerializerArr = new KSerializer[]{dj3Var2, dj3Var2, lazyArrOnExtraCallback2[2].getValue(), lazyArrOnExtraCallback2[3].getValue()};
        }
        int i3 = onExtraCallback + 115;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            m34deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend tossBankCurrencyTrendResponse$TossBankCurrencyTrendM34deserialize = m34deserialize(decoder);
        int i3 = IAuthTabCallback + 121;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return tossBankCurrencyTrendResponse$TossBankCurrencyTrendM34deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final TossBankCurrencyTrendResponse$TossBankCurrencyTrend m34deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        List list2;
        float f;
        int i;
        float f2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = TossBankCurrencyTrendResponse$TossBankCurrencyTrend.onExtraCallback();
        int i3 = 0;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            int i4 = IAuthTabCallback + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            float fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), (Object) null);
            f = fOnWarmupCompleted;
            f2 = fOnWarmupCompleted2;
            i = 15;
        } else {
            float fOnWarmupCompleted3 = 0.0f;
            float fOnWarmupCompleted4 = 0.0f;
            int i6 = 1;
            int i7 = 0;
            List list3 = null;
            List list4 = null;
            while (i6 != 0) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallback + 43;
                    int i9 = i8 % 128;
                    IAuthTabCallback = i9;
                    if (i8 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i10 = i9 + 13;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            if (iOnNavigationEvent != 2) {
                                int i12 = i9 + 75;
                                onExtraCallback = i12 % 128;
                                if (i12 % 2 == 0) {
                                    if (iOnNavigationEvent != 5) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i13 = i9 + 121;
                                    onExtraCallback = i13 % 128;
                                    int i14 = i13 % 2;
                                    list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), list4);
                                    i7 |= 8;
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    int i132 = i9 + 121;
                                    onExtraCallback = i132 % 128;
                                    int i142 = i132 % 2;
                                    list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrOnExtraCallback[3].getValue(), list4);
                                    i7 |= 8;
                                }
                            } else {
                                list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), list3);
                                i7 |= 4;
                            }
                        } else {
                            fOnWarmupCompleted4 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                            i7 |= 2;
                        }
                        i3 = 0;
                    } else {
                        fOnWarmupCompleted3 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, i3);
                        i7 |= 1;
                    }
                } else {
                    i6 = i3;
                }
            }
            list = list3;
            list2 = list4;
            float f3 = fOnWarmupCompleted4;
            f = fOnWarmupCompleted3;
            i = i7;
            f2 = f3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossBankCurrencyTrendResponse$TossBankCurrencyTrend(i, f, f2, list, list2, null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossBankCurrencyTrendResponse$TossBankCurrencyTrend) obj);
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossBankCurrencyTrendResponse$TossBankCurrencyTrend tossBankCurrencyTrendResponse$TossBankCurrencyTrend) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(tossBankCurrencyTrendResponse$TossBankCurrencyTrend, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TossBankCurrencyTrendResponse$TossBankCurrencyTrend.onExtraCallbackWithResult(tossBankCurrencyTrendResponse$TossBankCurrencyTrend, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
