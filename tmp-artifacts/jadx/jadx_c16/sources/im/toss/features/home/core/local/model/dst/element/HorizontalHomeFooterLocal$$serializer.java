package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HorizontalHomeFooterLocal$$serializer implements aeu2<HorizontalHomeFooterLocal> {
    private static int IAuthTabCallback = 1;
    public static final HorizontalHomeFooterLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 81;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        HorizontalHomeFooterLocal$$serializer horizontalHomeFooterLocal$$serializer = new HorizontalHomeFooterLocal$$serializer();
        INSTANCE = horizontalHomeFooterLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HorizontalHomeFooterLocal", horizontalHomeFooterLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("footerItems", false);
        setanimationsloop.onWarmupCompleted("padding", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 33;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HorizontalHomeFooterLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{HorizontalHomeFooterLocal.onExtraCallbackWithResult()[0].getValue(), sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        kSerializerArr[0] = HorizontalHomeFooterLocal.onExtraCallbackWithResult()[1].getValue();
        kSerializerArr[1] = sp.IAuthTabCallback(PaddingLocal$$serializer.INSTANCE);
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HorizontalHomeFooterLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        PaddingLocal paddingLocal;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = HorizontalHomeFooterLocal.onExtraCallbackWithResult();
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallbackWithResult[0].getValue(), (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PaddingLocal$$serializer.INSTANCE, (Object) null);
        } else {
            int i3 = onWarmupCompleted + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            List list2 = null;
            PaddingLocal paddingLocal2 = null;
            int i5 = 0;
            boolean z = true;
            while (!(!z)) {
                int i6 = onExtraCallback + 3;
                onWarmupCompleted = i6 % 128;
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
                    paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, PaddingLocal$$serializer.INSTANCE, paddingLocal2);
                    i5 |= 2;
                    int i8 = onExtraCallback + 55;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            list = list2;
            paddingLocal = paddingLocal2;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HorizontalHomeFooterLocal horizontalHomeFooterLocal = new HorizontalHomeFooterLocal(i2, list, paddingLocal, (okycx) null);
        int i10 = onWarmupCompleted + 85;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        return horizontalHomeFooterLocal;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m393deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        HorizontalHomeFooterLocal horizontalHomeFooterLocalDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return horizontalHomeFooterLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HorizontalHomeFooterLocal horizontalHomeFooterLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(horizontalHomeFooterLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HorizontalHomeFooterLocal.onExtraCallbackWithResult(horizontalHomeFooterLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(horizontalHomeFooterLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HorizontalHomeFooterLocal.onExtraCallbackWithResult(horizontalHomeFooterLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 63 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HorizontalHomeFooterLocal) obj);
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
