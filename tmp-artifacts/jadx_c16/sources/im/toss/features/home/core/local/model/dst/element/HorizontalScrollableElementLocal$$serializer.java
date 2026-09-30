package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.LayoutLocal;
import im.toss.features.home.core.local.model.dst.property.LayoutLocal$$serializer;
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
public final /* synthetic */ class HorizontalScrollableElementLocal$$serializer implements aeu2<HorizontalScrollableElementLocal> {
    private static int IAuthTabCallback = 0;
    public static final HorizontalScrollableElementLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        HorizontalScrollableElementLocal$$serializer horizontalScrollableElementLocal$$serializer = new HorizontalScrollableElementLocal$$serializer();
        INSTANCE = horizontalScrollableElementLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HorizontalScrollableElementLocal", horizontalScrollableElementLocal$$serializer, 3);
        setanimationsloop.onWarmupCompleted("layout", false);
        setanimationsloop.onWarmupCompleted("elements", false);
        setanimationsloop.onWarmupCompleted("space", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HorizontalScrollableElementLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnNavigationEvent = HorizontalScrollableElementLocal.onNavigationEvent();
            ?? r5 = new KSerializer[3];
            r5[0] = LayoutLocal$$serializer.INSTANCE;
            r5[1] = lazyArrOnNavigationEvent[1].getValue();
            r5[3] = dj3.onWarmupCompleted;
            kSerializerArr = r5;
        } else {
            kSerializerArr = new KSerializer[]{LayoutLocal$$serializer.INSTANCE, HorizontalScrollableElementLocal.onNavigationEvent()[1].getValue(), dj3.onWarmupCompleted};
        }
        int i3 = onNavigationEvent + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HorizontalScrollableElementLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        float fOnWarmupCompleted;
        int i;
        List list;
        LayoutLocal layoutLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = HorizontalScrollableElementLocal.onNavigationEvent();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            LayoutLocal layoutLocal2 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, (Object) null);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), (Object) null);
            fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
            list = list2;
            layoutLocal = layoutLocal2;
            i = 7;
        } else {
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            float fOnWarmupCompleted2 = 0.0f;
            List list3 = null;
            LayoutLocal layoutLocal3 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    layoutLocal3 = (LayoutLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, LayoutLocal$$serializer.INSTANCE, layoutLocal3);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnNavigationEvent[1].getValue(), list3);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = IAuthTabCallback + 73;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 3);
                        i5 |= 3;
                    } else {
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 2);
                        i5 |= 4;
                    }
                }
            }
            fOnWarmupCompleted = fOnWarmupCompleted2;
            i = i5;
            list = list3;
            layoutLocal = layoutLocal3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HorizontalScrollableElementLocal(i, layoutLocal, list, fOnWarmupCompleted, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m395deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HorizontalScrollableElementLocal horizontalScrollableElementLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 5;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return horizontalScrollableElementLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HorizontalScrollableElementLocal horizontalScrollableElementLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(horizontalScrollableElementLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HorizontalScrollableElementLocal.onWarmupCompleted(horizontalScrollableElementLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 99;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HorizontalScrollableElementLocal) obj);
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
