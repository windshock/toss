package im.toss.securities.widget.data.model.watchlists;

import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer implements aeu2<WidgetMiniCharts.IndexMiniChart.MiniChart.Candle> {
    private static int IAuthTabCallback = 0;
    public static final WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer widgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer = new WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer();
        INSTANCE = widgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.IndexMiniChart.MiniChart.Candle", widgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer, 3);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted("price", false);
        setanimationsloop.onWarmupCompleted("startDate", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 77;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private WidgetMiniCharts$IndexMiniChart$MiniChart$Candle$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, setVideoListener.onWarmupCompleted, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[1] = setVideoListener.onWarmupCompleted;
        kSerializerArr[2] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetMiniCharts.IndexMiniChart.MiniChart.Candle deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        double dIAuthTabCallback;
        String strAsInterface2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            i = 7;
        } else {
            double dIAuthTabCallback2 = 0.0d;
            int i5 = 0;
            boolean z = true;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            while (z) {
                int i6 = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i5 |= 4;
                }
            }
            strAsInterface = strAsInterface3;
            dIAuthTabCallback = dIAuthTabCallback2;
            strAsInterface2 = strAsInterface4;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        WidgetMiniCharts.IndexMiniChart.MiniChart.Candle candle = new WidgetMiniCharts.IndexMiniChart.MiniChart.Candle(i, strAsInterface, dIAuthTabCallback, strAsInterface2, null);
        int i7 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return candle;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m58deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WidgetMiniCharts.IndexMiniChart.MiniChart.Candle candleDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return candleDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.IndexMiniChart.MiniChart.Candle candle) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(candle, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetMiniCharts.IndexMiniChart.MiniChart.Candle.onExtraCallback(candle, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetMiniCharts.IndexMiniChart.MiniChart.Candle) obj);
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
