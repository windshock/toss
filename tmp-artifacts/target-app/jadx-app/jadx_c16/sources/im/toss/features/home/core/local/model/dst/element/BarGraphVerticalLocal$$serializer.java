package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.element.BarGraphVerticalLocal;
import im.toss.features.home.core.local.model.dst.property.HorizontalMarginLocal;
import im.toss.features.home.core.local.model.dst.property.HorizontalMarginLocal$$serializer;
import im.toss.features.home.core.local.model.dst.property.MarginLocal;
import im.toss.features.home.core.local.model.dst.property.MarginLocal$$serializer;
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
import o.getBgColor;
import o.getWriggleLayout;
import o.isInterrupt;
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
public final /* synthetic */ class BarGraphVerticalLocal$$serializer implements aeu2<BarGraphVerticalLocal> {
    private static int IAuthTabCallback = 0;
    public static final BarGraphVerticalLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 51 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        BarGraphVerticalLocal$$serializer barGraphVerticalLocal$$serializer = new BarGraphVerticalLocal$$serializer();
        INSTANCE = barGraphVerticalLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.BarGraphVerticalLocal", barGraphVerticalLocal$$serializer, 7);
        setanimationsloop.onWarmupCompleted("graphItems", false);
        setanimationsloop.onWarmupCompleted("isDrawZeroLine", false);
        setanimationsloop.onWarmupCompleted("zeroLineStyle", false);
        setanimationsloop.onWarmupCompleted("zeroLineHorizontalMargin", false);
        setanimationsloop.onWarmupCompleted("zeroLineColor", false);
        setanimationsloop.onWarmupCompleted("graphMargin", false);
        setanimationsloop.onWarmupCompleted("graphHeight", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 1;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private BarGraphVerticalLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {BarGraphVerticalLocal.onExtraCallback()[0].getValue(), getBgColor.IAuthTabCallback, sp.IAuthTabCallback(isInterrupt.onWarmupCompleted), sp.IAuthTabCallback(HorizontalMarginLocal$$serializer.INSTANCE), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent), sp.IAuthTabCallback(MarginLocal$$serializer.INSTANCE), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted)};
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BarGraphVerticalLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        HorizontalMarginLocal horizontalMarginLocal;
        String str;
        Double d;
        int i;
        boolean z;
        MarginLocal marginLocal;
        List list;
        BarGraphVerticalLocal.ZeroLineStyle zeroLineStyle;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = BarGraphVerticalLocal.onExtraCallback();
        int i3 = 6;
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            BarGraphVerticalLocal.ZeroLineStyle zeroLineStyle2 = (BarGraphVerticalLocal.ZeroLineStyle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, isInterrupt.onWarmupCompleted, (Object) null);
            HorizontalMarginLocal horizontalMarginLocal2 = (HorizontalMarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HorizontalMarginLocal$$serializer.INSTANCE, (Object) null);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, (Object) null);
            MarginLocal marginLocal2 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, MarginLocal$$serializer.INSTANCE, (Object) null);
            Double d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, setVideoListener.onWarmupCompleted, (Object) null);
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            list = list2;
            z = zOnExtraCallbackWithResult;
            d = d2;
            marginLocal = marginLocal2;
            horizontalMarginLocal = horizontalMarginLocal2;
            str = str3;
            zeroLineStyle = zeroLineStyle2;
            i = 127;
        } else {
            boolean z2 = true;
            boolean zOnExtraCallbackWithResult2 = false;
            int i6 = 0;
            List list3 = null;
            BarGraphVerticalLocal.ZeroLineStyle zeroLineStyle3 = null;
            Double d3 = null;
            MarginLocal marginLocal3 = null;
            horizontalMarginLocal = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                    case 0:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list3);
                        i6 |= 1;
                        i3 = 6;
                    case 1:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i6 |= 2;
                        i3 = 6;
                    case 2:
                        zeroLineStyle3 = (BarGraphVerticalLocal.ZeroLineStyle) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, isInterrupt.onWarmupCompleted, zeroLineStyle3);
                        i6 |= 4;
                        i3 = 6;
                    case 3:
                        horizontalMarginLocal = (HorizontalMarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, HorizontalMarginLocal$$serializer.INSTANCE, horizontalMarginLocal);
                        i6 |= 8;
                        i3 = 6;
                    case 4:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str2);
                        i6 |= 16;
                        int i7 = onNavigationEvent + 81;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 6;
                    case 5:
                        marginLocal3 = (MarginLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, MarginLocal$$serializer.INSTANCE, marginLocal3);
                        i6 |= 32;
                    case 6:
                        d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, setVideoListener.onWarmupCompleted, d3);
                        i6 |= 64;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str2;
            d = d3;
            i = i6;
            z = zOnExtraCallbackWithResult2;
            marginLocal = marginLocal3;
            list = list3;
            zeroLineStyle = zeroLineStyle3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        BarGraphVerticalLocal barGraphVerticalLocal = new BarGraphVerticalLocal(i, list, z, zeroLineStyle, horizontalMarginLocal, str, marginLocal, d, (okycx) null);
        int i9 = onNavigationEvent + 31;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return barGraphVerticalLocal;
        }
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m286deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BarGraphVerticalLocal barGraphVerticalLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(barGraphVerticalLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BarGraphVerticalLocal.onExtraCallbackWithResult(barGraphVerticalLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BarGraphVerticalLocal) obj);
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
