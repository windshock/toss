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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardBillListContainerLocal$$serializer implements aeu2<CardBillListContainerLocal> {
    private static int IAuthTabCallback = 0;
    public static final CardBillListContainerLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        CardBillListContainerLocal$$serializer cardBillListContainerLocal$$serializer = new CardBillListContainerLocal$$serializer();
        INSTANCE = cardBillListContainerLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.CardBillListContainerLocal", cardBillListContainerLocal$$serializer, 1);
        setanimationsloop.onWarmupCompleted("contents", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private CardBillListContainerLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return new KSerializer[]{CardBillListContainerLocal.onWarmupCompleted()[0].getValue()};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[1];
        kSerializerArr[1] = CardBillListContainerLocal.onWarmupCompleted()[1].getValue();
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052 A[PHI: r1 r2 r12
      0x0052: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r2v4 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r12v5 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r1 r2 r12
      0x003a: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v5 kotlin.Lazy[]) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r12v2 o.yw) = (r12v1 o.yw), (r12v7 o.yw) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardBillListContainerLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnWarmupCompleted;
        List list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = 1;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CardBillListContainerLocal.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i4 = IAuthTabCallback + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            } else {
                boolean z = true;
                List list2 = null;
                int i6 = 0;
                while (z) {
                    int i7 = IAuthTabCallback + 63;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        obj.hashCode();
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list2);
                        i6 = 1;
                    }
                }
                list = list2;
                i3 = i6;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnWarmupCompleted = CardBillListContainerLocal.onWarmupCompleted();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CardBillListContainerLocal(i3, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m317deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardBillListContainerLocal cardBillListContainerLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 7;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return cardBillListContainerLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CardBillListContainerLocal cardBillListContainerLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cardBillListContainerLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CardBillListContainerLocal.onExtraCallback(cardBillListContainerLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CardBillListContainerLocal) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
