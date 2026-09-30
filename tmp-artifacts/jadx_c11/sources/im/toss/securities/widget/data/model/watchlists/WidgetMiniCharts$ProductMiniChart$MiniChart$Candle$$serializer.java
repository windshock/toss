package im.toss.securities.widget.data.model.watchlists;

import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import im.toss.tosssecurities.core.base.model.SessionType;
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
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer implements aeu2<WidgetMiniCharts.ProductMiniChart.MiniChart.Candle> {
    private static int IAuthTabCallback = 0;
    public static final WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 57;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return serialDescriptor;
    }

    static {
        WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer = new WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer();
        INSTANCE = widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.ProductMiniChart.MiniChart.Candle", widgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer, 8);
        setanimationsloop.onWarmupCompleted("base", true);
        setanimationsloop.onWarmupCompleted("close", false);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted("high", true);
        setanimationsloop.onWarmupCompleted("low", true);
        setanimationsloop.onWarmupCompleted("open", true);
        setanimationsloop.onWarmupCompleted("startDate", false);
        setanimationsloop.onWarmupCompleted("sessionType", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 63;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private WidgetMiniCharts$ProductMiniChart$MiniChart$Candle$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = WidgetMiniCharts.ProductMiniChart.MiniChart.Candle.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = setVideoListener.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[7].getValue());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializer, getwrigglelayout, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, getwrigglelayout, kSerializerIAuthTabCallback5};
        int i4 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetMiniCharts.ProductMiniChart.MiniChart.Candle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        double dIAuthTabCallback;
        String strAsInterface;
        Double d;
        Double d2;
        Double d3;
        String strAsInterface2;
        Double d4;
        SessionType sessionType;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = WidgetMiniCharts.ProductMiniChart.MiniChart.Candle.onExtraCallbackWithResult();
        int i3 = 7;
        Double d5 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            String strAsInterface3 = null;
            SessionType sessionType2 = null;
            strAsInterface = null;
            Double d6 = null;
            dIAuthTabCallback = 0.0d;
            int i4 = 0;
            d2 = null;
            d = null;
            while (z) {
                int i5 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i4 |= 1;
                        d6 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, d6);
                        i3 = 7;
                        break;
                    case 1:
                        dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, d);
                        i4 |= 8;
                        break;
                    case 4:
                        d5 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setVideoListener.onWarmupCompleted, d5);
                        i4 |= 16;
                        break;
                    case 5:
                        d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setVideoListener.onWarmupCompleted, d2);
                        i4 |= 32;
                        break;
                    case 6:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i4 |= 64;
                        int i7 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        break;
                    case 7:
                        sessionType2 = (SessionType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrOnExtraCallbackWithResult[i3].getValue(), sessionType2);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            strAsInterface2 = strAsInterface3;
            d4 = d6;
            sessionType = sessionType2;
            i = i4;
            d3 = d5;
        } else {
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            Double d7 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, setvideolistener, (Object) null);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            d = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setvideolistener, (Object) null);
            Double d8 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setvideolistener, (Object) null);
            d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setvideolistener, (Object) null);
            d3 = d8;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            d4 = d7;
            sessionType = (SessionType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrOnExtraCallbackWithResult[7].getValue(), (Object) null);
            i = 255;
        }
        Double d9 = d;
        String str = strAsInterface;
        double d10 = dIAuthTabCallback;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetMiniCharts.ProductMiniChart.MiniChart.Candle(i, d4, d10, str, d9, d3, d2, strAsInterface2, sessionType, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m61deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WidgetMiniCharts.ProductMiniChart.MiniChart.Candle candleDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return candleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.ProductMiniChart.MiniChart.Candle candle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(candle, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetMiniCharts.ProductMiniChart.MiniChart.Candle.onNavigationEvent(candle, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (WidgetMiniCharts.ProductMiniChart.MiniChart.Candle) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
