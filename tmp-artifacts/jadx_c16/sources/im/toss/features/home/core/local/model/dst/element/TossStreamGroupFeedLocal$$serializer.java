package im.toss.features.home.core.local.model.dst.element;

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
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossStreamGroupFeedLocal$$serializer implements aeu2<TossStreamGroupFeedLocal> {
    public static final TossStreamGroupFeedLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        TossStreamGroupFeedLocal$$serializer tossStreamGroupFeedLocal$$serializer = new TossStreamGroupFeedLocal$$serializer();
        INSTANCE = tossStreamGroupFeedLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.TossStreamGroupFeedLocal", tossStreamGroupFeedLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("thumbnails", false);
        setanimationsloop.onWarmupCompleted("horizontalPadding", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 59;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private TossStreamGroupFeedLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{TossStreamGroupFeedLocal.onExtraCallbackWithResult()[0].getValue(), dj3.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[0] = TossStreamGroupFeedLocal.onExtraCallbackWithResult()[0].getValue();
        kSerializerArr[0] = dj3.onWarmupCompleted;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[PHI: r1 r2 r13
      0x0051: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r2v6 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v8 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r13v5 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r13
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v8 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r13v2 o.yw) = (r13v1 o.yw), (r13v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TossStreamGroupFeedLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallbackWithResult;
        List list;
        float fOnWarmupCompleted;
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = TossStreamGroupFeedLocal.onExtraCallbackWithResult();
            int i4 = 52 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                i = 3;
            } else {
                boolean z = true;
                int i5 = 0;
                float fOnWarmupCompleted2 = 0.0f;
                List list2 = null;
                while (z) {
                    int i6 = onWarmupCompleted + 85;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent == 0) {
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), list2);
                        i5 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i5 |= 2;
                    }
                }
                list = list2;
                fOnWarmupCompleted = fOnWarmupCompleted2;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallbackWithResult = TossStreamGroupFeedLocal.onExtraCallbackWithResult();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TossStreamGroupFeedLocal(i, list, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m416deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TossStreamGroupFeedLocal tossStreamGroupFeedLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(tossStreamGroupFeedLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            TossStreamGroupFeedLocal.onExtraCallbackWithResult(tossStreamGroupFeedLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tossStreamGroupFeedLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        TossStreamGroupFeedLocal.onExtraCallbackWithResult(tossStreamGroupFeedLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TossStreamGroupFeedLocal) obj);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
