package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.DividerLocal;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DividerLocal$LinearGradient$$serializer implements aeu2<DividerLocal.LinearGradient> {
    public static final DividerLocal$LinearGradient$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 37;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DividerLocal$LinearGradient$$serializer dividerLocal$LinearGradient$$serializer = new DividerLocal$LinearGradient$$serializer();
        INSTANCE = dividerLocal$LinearGradient$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.DividerLocal.LinearGradient", dividerLocal$LinearGradient$$serializer, 7);
        setanimationsloop.onWarmupCompleted("lineWidth", false);
        setanimationsloop.onWarmupCompleted("backgroundColor", false);
        setanimationsloop.onWarmupCompleted("paddingTop", false);
        setanimationsloop.onWarmupCompleted("paddingLeft", false);
        setanimationsloop.onWarmupCompleted("paddingRight", false);
        setanimationsloop.onWarmupCompleted("paddingBottom", false);
        setanimationsloop.onWarmupCompleted("points", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 17;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DividerLocal$LinearGradient$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = DividerLocal.LinearGradient.onWarmupCompleted();
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {setvideolistener, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), setvideolistener, setvideolistener, setvideolistener, setvideolistener, lazyArrOnWarmupCompleted[6].getValue()};
        int i4 = onWarmupCompleted + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f A[PHI: r0 r2 r3
      0x007f: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r3v7 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v9 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r0 r2 r3
      0x0043: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r3v3 kotlin.Lazy[]) = (r3v2 kotlin.Lazy[]), (r3v9 kotlin.Lazy[]) binds: [B:8:0x0041, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DividerLocal.LinearGradient deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        int i;
        List list;
        String str;
        double d;
        double d2;
        double dIAuthTabCallback;
        double d3;
        double d4;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 103;
        onExtraCallback = i3 % 128;
        int i4 = 4;
        int i5 = 3;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = DividerLocal.LinearGradient.onWarmupCompleted();
            int i6 = 94 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                String str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
                double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                double dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                double dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                double dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), (Object) null);
                i = 127;
                list = list2;
                str = str2;
                d = dIAuthTabCallback3;
                d2 = dIAuthTabCallback4;
                dIAuthTabCallback = dIAuthTabCallback2;
                d3 = dIAuthTabCallback6;
                d4 = dIAuthTabCallback5;
            } else {
                double dIAuthTabCallback7 = 0.0d;
                boolean z = true;
                List list3 = null;
                String str3 = null;
                dIAuthTabCallback = 0.0d;
                double dIAuthTabCallback8 = 0.0d;
                double dIAuthTabCallback9 = 0.0d;
                double dIAuthTabCallback10 = 0.0d;
                int i7 = 0;
                while (z) {
                    int i8 = onExtraCallback + 125;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            int i10 = onWarmupCompleted + 25;
                            onExtraCallback = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 3 / 5;
                            }
                            z = false;
                            i4 = 4;
                            i5 = 3;
                        case 0:
                            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                            i7 |= 1;
                        case 1:
                            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str3);
                            i7 |= 2;
                        case 2:
                            dIAuthTabCallback8 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 2);
                            i7 |= 4;
                        case 3:
                            dIAuthTabCallback9 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i5);
                            i7 |= 8;
                        case 4:
                            dIAuthTabCallback7 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                            i7 |= 16;
                            int i12 = onExtraCallback + 93;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                        case 5:
                            dIAuthTabCallback10 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 5);
                            i7 |= 32;
                        case 6:
                            list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnWarmupCompleted[6].getValue(), list3);
                            i7 |= 64;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                i = i7;
                d4 = dIAuthTabCallback7;
                str = str3;
                d = dIAuthTabCallback8;
                d2 = dIAuthTabCallback9;
                list = list3;
                d3 = dIAuthTabCallback10;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = DividerLocal.LinearGradient.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DividerLocal.LinearGradient(i, dIAuthTabCallback, str, d, d2, d4, d3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m332deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DividerLocal.LinearGradient linearGradientDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return linearGradientDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DividerLocal.LinearGradient linearGradient) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(linearGradient, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DividerLocal.LinearGradient.onExtraCallback(linearGradient, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DividerLocal.LinearGradient) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
