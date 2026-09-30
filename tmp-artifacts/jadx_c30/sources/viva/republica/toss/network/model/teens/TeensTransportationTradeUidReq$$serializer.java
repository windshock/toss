package viva.republica.toss.network.model.teens;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.ReactNativeHostExternalSyntheticLambda0;
import o.aeu2;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TeensTransportationTradeUidReq$$serializer implements aeu2<TeensTransportationTradeUidReq> {
    private static int IAuthTabCallback = 0;
    public static final TeensTransportationTradeUidReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 3;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        TeensTransportationTradeUidReq$$serializer teensTransportationTradeUidReq$$serializer = new TeensTransportationTradeUidReq$$serializer();
        INSTANCE = teensTransportationTradeUidReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.teens.TeensTransportationTradeUidReq", teensTransportationTradeUidReq$$serializer, 2);
        setanimationsloop.onWarmupCompleted("amount", false);
        setanimationsloop.onWarmupCompleted("tradeType", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TeensTransportationTradeUidReq$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Lazy[] lazyArrIAuthTabCallback = TeensTransportationTradeUidReq.IAuthTabCallback();
            ?? r4 = new KSerializer[3];
            r4[0] = oty1.onExtraCallback;
            r4[1] = lazyArrIAuthTabCallback[1].getValue();
            kSerializerArr = r4;
        } else {
            kSerializerArr = new KSerializer[]{oty1.onExtraCallback, TeensTransportationTradeUidReq.IAuthTabCallback()[1].getValue()};
        }
        int i3 = onNavigationEvent + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TeensTransportationTradeUidReq teensTransportationTradeUidReqM81deserialize = m81deserialize(decoder);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        int i5 = onNavigationEvent + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return teensTransportationTradeUidReqM81deserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[PHI: r1 r2 r14
      0x0052: PHI (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r2v7 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v9 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r14v5 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r14
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v9 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r14v2 o.yw) = (r14v1 o.yw), (r14v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TeensTransportationTradeUidReq m81deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        long jIAuthTabCallbackDefault;
        int i;
        ReactNativeHostExternalSyntheticLambda0 reactNativeHostExternalSyntheticLambda0;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = TeensTransportationTradeUidReq.IAuthTabCallback();
            int i4 = 29 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                ReactNativeHostExternalSyntheticLambda0 reactNativeHostExternalSyntheticLambda02 = (ReactNativeHostExternalSyntheticLambda0) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
                i = 3;
                reactNativeHostExternalSyntheticLambda0 = reactNativeHostExternalSyntheticLambda02;
            } else {
                boolean z = true;
                long jIAuthTabCallbackDefault2 = 0;
                ReactNativeHostExternalSyntheticLambda0 reactNativeHostExternalSyntheticLambda03 = null;
                int i5 = 0;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i6 = onExtraCallback + 49;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            if (iOnNavigationEvent != 0) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            reactNativeHostExternalSyntheticLambda03 = (ReactNativeHostExternalSyntheticLambda0) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), reactNativeHostExternalSyntheticLambda03);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent != 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            reactNativeHostExternalSyntheticLambda03 = (ReactNativeHostExternalSyntheticLambda0) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), reactNativeHostExternalSyntheticLambda03);
                            i5 |= 2;
                        }
                    } else {
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i5 |= 1;
                    }
                }
                i = i5;
                reactNativeHostExternalSyntheticLambda0 = reactNativeHostExternalSyntheticLambda03;
                jIAuthTabCallbackDefault = jIAuthTabCallbackDefault2;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = TeensTransportationTradeUidReq.IAuthTabCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TeensTransportationTradeUidReq(i, jIAuthTabCallbackDefault, reactNativeHostExternalSyntheticLambda0, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TeensTransportationTradeUidReq) obj);
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TeensTransportationTradeUidReq teensTransportationTradeUidReq) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(teensTransportationTradeUidReq, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TeensTransportationTradeUidReq.IAuthTabCallback(teensTransportationTradeUidReq, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(teensTransportationTradeUidReq, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TeensTransportationTradeUidReq.IAuthTabCallback(teensTransportationTradeUidReq, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
