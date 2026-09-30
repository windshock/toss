package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.AmountTopLocal;
import im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.FullTooltipAttributeLocal$$serializer;
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
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AmountTopLocal$FullTooltipWithTarget$$serializer implements aeu2<AmountTopLocal.FullTooltipWithTarget> {
    public static final AmountTopLocal$FullTooltipWithTarget$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        AmountTopLocal$FullTooltipWithTarget$$serializer amountTopLocal$FullTooltipWithTarget$$serializer = new AmountTopLocal$FullTooltipWithTarget$$serializer();
        INSTANCE = amountTopLocal$FullTooltipWithTarget$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.AmountTopLocal.FullTooltipWithTarget", amountTopLocal$FullTooltipWithTarget$$serializer, 2);
        setanimationsloop.onWarmupCompleted("fullTooltip", false);
        setanimationsloop.onWarmupCompleted("target", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 49;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private AmountTopLocal$FullTooltipWithTarget$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {FullTooltipAttributeLocal$$serializer.INSTANCE, AmountTopLocal.FullTooltipWithTarget.onExtraCallback()[1].getValue()};
        int i4 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[PHI: r1 r2 r13
      0x0056: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r2v10 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r13
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v12 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AmountTopLocal.FullTooltipWithTarget deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        FullTooltipAttributeLocal fullTooltipAttributeLocal;
        AmountTopLocal.FullTooltipWithTarget.onExtraCallback onextracallback;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = AmountTopLocal.FullTooltipWithTarget.onExtraCallback();
            int i4 = 23 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                fullTooltipAttributeLocal = (FullTooltipAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, FullTooltipAttributeLocal$$serializer.INSTANCE, (Object) null);
                onextracallback = (AmountTopLocal.FullTooltipWithTarget.onExtraCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
                i = 3;
            } else {
                int i5 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                FullTooltipAttributeLocal fullTooltipAttributeLocal2 = null;
                AmountTopLocal.FullTooltipWithTarget.onExtraCallback onextracallback2 = null;
                int i7 = 0;
                boolean z = true;
                while (z) {
                    int i8 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        fullTooltipAttributeLocal2 = (FullTooltipAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, FullTooltipAttributeLocal$$serializer.INSTANCE, fullTooltipAttributeLocal2);
                        i7 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i10 = onWarmupCompleted + 47;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            onextracallback2 = (AmountTopLocal.FullTooltipWithTarget.onExtraCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), onextracallback2);
                            i7 |= 4;
                        } else {
                            onextracallback2 = (AmountTopLocal.FullTooltipWithTarget.onExtraCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), onextracallback2);
                            i7 |= 2;
                        }
                    }
                }
                fullTooltipAttributeLocal = fullTooltipAttributeLocal2;
                onextracallback = onextracallback2;
                i = i7;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = AmountTopLocal.FullTooltipWithTarget.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new AmountTopLocal.FullTooltipWithTarget(i, fullTooltipAttributeLocal, onextracallback, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m268deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        AmountTopLocal.FullTooltipWithTarget fullTooltipWithTargetDeserialize = deserialize(decoder);
        int i3 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 87 / 0;
        }
        return fullTooltipWithTargetDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AmountTopLocal.FullTooltipWithTarget fullTooltipWithTarget) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(fullTooltipWithTarget, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AmountTopLocal.FullTooltipWithTarget.onExtraCallback(fullTooltipWithTarget, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(fullTooltipWithTarget, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AmountTopLocal.FullTooltipWithTarget.onExtraCallback(fullTooltipWithTarget, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (AmountTopLocal.FullTooltipWithTarget) obj);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
