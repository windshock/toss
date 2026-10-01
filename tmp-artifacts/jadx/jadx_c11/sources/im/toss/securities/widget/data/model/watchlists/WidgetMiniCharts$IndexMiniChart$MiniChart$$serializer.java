package im.toss.securities.widget.data.model.watchlists;

import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer implements aeu2<WidgetMiniCharts.IndexMiniChart.MiniChart> {
    public static final WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 88 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer widgetMiniCharts$IndexMiniChart$MiniChart$$serializer = new WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer();
        INSTANCE = widgetMiniCharts$IndexMiniChart$MiniChart$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.IndexMiniChart.MiniChart", widgetMiniCharts$IndexMiniChart$MiniChart$$serializer, 5);
        setanimationsloop.onWarmupCompleted("candles", true);
        setanimationsloop.onWarmupCompleted("code", true);
        setanimationsloop.onWarmupCompleted("timezone", true);
        setanimationsloop.onWarmupCompleted("tradingEnd", true);
        setanimationsloop.onWarmupCompleted("tradingStart", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) WidgetMiniCharts.IndexMiniChart.MiniChart.IAuthTabCallback()[0].getValue());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetMiniCharts.IndexMiniChart.MiniChart deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        char c;
        char c2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = WidgetMiniCharts.IndexMiniChart.MiniChart.IAuthTabCallback();
        char c3 = 3;
        char c4 = 4;
        String str5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str = str7;
            list = list2;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str3 = str8;
            i = 31;
            str4 = str6;
        } else {
            int i5 = 0;
            boolean z = true;
            List list3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                    c4 = c4;
                    c3 = c3;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onNavigationEvent;
                    int i7 = i6 + 67;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0 ? iOnNavigationEvent == 1 : iOnNavigationEvent == 1) {
                        c = 4;
                        c2 = 3;
                        str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str11);
                        i5 |= 2;
                    } else {
                        int i8 = i6 + 53;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0 ? iOnNavigationEvent == 2 : iOnNavigationEvent == 2) {
                            c = 4;
                            c2 = 3;
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                            i5 |= 4;
                            int i9 = onNavigationEvent + 81;
                            onExtraCallback = i9 % 128;
                            int i10 = i9 % 2;
                        } else if (iOnNavigationEvent == 3) {
                            c = 4;
                            c2 = 3;
                            str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str10);
                            i5 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str9);
                            i5 |= 16;
                            c4 = 4;
                            c3 = 3;
                        }
                    }
                    c4 = c;
                    c3 = c2;
                } else {
                    list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list3);
                    i5 |= 1;
                    c4 = c4;
                    c3 = c3;
                }
            }
            i = i5;
            str = str5;
            list = list3;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetMiniCharts.IndexMiniChart.MiniChart(i, list, str4, str, str3, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m57deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WidgetMiniCharts.IndexMiniChart.MiniChart miniChartDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return miniChartDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.IndexMiniChart.MiniChart miniChart) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(miniChart, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetMiniCharts.IndexMiniChart.MiniChart.onWarmupCompleted(miniChart, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetMiniCharts.IndexMiniChart.MiniChart) obj);
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
