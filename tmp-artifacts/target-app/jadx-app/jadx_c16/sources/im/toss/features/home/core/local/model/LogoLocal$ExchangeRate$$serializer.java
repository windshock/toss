package im.toss.features.home.core.local.model;

import im.toss.features.home.core.local.model.LogoLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal;
import im.toss.features.home.core.local.model.dst.eventlog.ImpressionEventLogLocal$;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogoLocal$ExchangeRate$$serializer implements aeu2<LogoLocal.ExchangeRate> {
    private static int IAuthTabCallback = 1;
    public static final LogoLocal$ExchangeRate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        LogoLocal$ExchangeRate$$serializer logoLocal$ExchangeRate$$serializer = new LogoLocal$ExchangeRate$$serializer();
        INSTANCE = logoLocal$ExchangeRate$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.LogoLocal.ExchangeRate", logoLocal$ExchangeRate$$serializer, 4);
        setanimationsloop.onWarmupCompleted("currencies", false);
        setanimationsloop.onWarmupCompleted("ctaButtonInfos", false);
        setanimationsloop.onWarmupCompleted("impressionEventLog", false);
        setanimationsloop.onWarmupCompleted("handler", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 115;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
    }

    private LogoLocal$ExchangeRate$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = LogoLocal.ExchangeRate.onWarmupCompleted();
        KSerializer<?>[] kSerializerArr = {lazyArrOnWarmupCompleted[0].getValue(), lazyArrOnWarmupCompleted[1].getValue(), sp.IAuthTabCallback(ImpressionEventLogLocal$.serializer.INSTANCE), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onWarmupCompleted + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074 A[PHI: r0 r2 r3
      0x0074: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r3v11 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[PHI: r0 r2 r3
      0x0040: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v8 o.yw) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v13 kotlin.Lazy[]) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LogoLocal.ExchangeRate deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        int i;
        HandlerLocal handlerLocal;
        List list;
        List list2;
        ImpressionEventLogLocal impressionEventLogLocal;
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = 0;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = LogoLocal.ExchangeRate.onWarmupCompleted();
            int i6 = 98 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                List list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
                List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
                ImpressionEventLogLocal impressionEventLogLocal2 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, (Object) null);
                i = 15;
                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, (Object) null);
                list = list4;
                list2 = list3;
                impressionEventLogLocal = impressionEventLogLocal2;
            } else {
                int i7 = 0;
                int i8 = 1;
                ImpressionEventLogLocal impressionEventLogLocal3 = null;
                List list5 = null;
                handlerLocal = null;
                List list6 = null;
                while (i8 != 0) {
                    int i9 = onExtraCallback + 69;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        i8 = i5;
                    } else if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i10 = onWarmupCompleted;
                            int i11 = i10 + 49;
                            onExtraCallback = i11 % 128;
                            int i12 = i11 % 2;
                            if (iOnNavigationEvent != 2) {
                                int i13 = i10 + 39;
                                int i14 = i13 % 128;
                                onExtraCallback = i14;
                                if (i13 % 2 != 0) {
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    i2 = i14 + 9;
                                    onWarmupCompleted = i2 % 128;
                                    if (i2 % 2 != 0) {
                                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                                        i7 |= 57;
                                    } else {
                                        handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                                        i7 |= 8;
                                    }
                                } else {
                                    if (iOnNavigationEvent != 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    i2 = i14 + 9;
                                    onWarmupCompleted = i2 % 128;
                                    if (i2 % 2 != 0) {
                                    }
                                }
                            } else {
                                impressionEventLogLocal3 = (ImpressionEventLogLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, ImpressionEventLogLocal$.serializer.INSTANCE, impressionEventLogLocal3);
                                i7 |= 4;
                                int i15 = onExtraCallback + 97;
                                onWarmupCompleted = i15 % 128;
                                int i16 = i15 % 2;
                            }
                        } else {
                            list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list5);
                            i7 |= 2;
                        }
                        i5 = 0;
                    } else {
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i5, (jp) lazyArrOnWarmupCompleted[i5].getValue(), list6);
                        i7 |= 1;
                        int i17 = onExtraCallback + 113;
                        onWarmupCompleted = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 2 % 5;
                        }
                    }
                }
                impressionEventLogLocal = impressionEventLogLocal3;
                list = list5;
                list2 = list6;
                i = i7;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = LogoLocal.ExchangeRate.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new LogoLocal.ExchangeRate(i, list2, list, impressionEventLogLocal, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m252deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LogoLocal.ExchangeRate exchangeRateDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 13;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return exchangeRateDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull LogoLocal.ExchangeRate exchangeRate) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(exchangeRate, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            LogoLocal.ExchangeRate.IAuthTabCallback(exchangeRate, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(exchangeRate, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        LogoLocal.ExchangeRate.IAuthTabCallback(exchangeRate, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (LogoLocal.ExchangeRate) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
