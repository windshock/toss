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
public final /* synthetic */ class WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer implements aeu2<WidgetMiniCharts.ProductMiniChart.MiniChart> {
    private static int IAuthTabCallback = 0;
    public static final WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer widgetMiniCharts$ProductMiniChart$MiniChart$$serializer = new WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer();
        INSTANCE = widgetMiniCharts$ProductMiniChart$MiniChart$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.ProductMiniChart.MiniChart", widgetMiniCharts$ProductMiniChart$MiniChart$$serializer, 5);
        setanimationsloop.onWarmupCompleted("candles", true);
        setanimationsloop.onWarmupCompleted("code", true);
        setanimationsloop.onWarmupCompleted("timezone", true);
        setanimationsloop.onWarmupCompleted("tradingEnd", true);
        setanimationsloop.onWarmupCompleted("tradingStart", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) WidgetMiniCharts.ProductMiniChart.MiniChart.onWarmupCompleted()[0].getValue());
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetMiniCharts.ProductMiniChart.MiniChart deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = WidgetMiniCharts.ProductMiniChart.MiniChart.onWarmupCompleted();
        int i3 = 1;
        char c2 = 4;
        String str5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str = str7;
            list = list2;
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str3 = str8;
            str4 = str6;
            i = 31;
        } else {
            boolean z = true;
            int i4 = 0;
            List list3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                    c2 = c2;
                    i3 = i3;
                } else if (iOnNavigationEvent == 0) {
                    list3 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), list3);
                    i4 |= 1;
                    c2 = c2;
                    i3 = i3;
                } else if (iOnNavigationEvent != i3) {
                    int i5 = onWarmupCompleted;
                    int i6 = i5 + 11;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 2) {
                        int i8 = i5 + 45;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 == 0 ? iOnNavigationEvent == 3 : iOnNavigationEvent == 2) {
                            c = 4;
                            str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str10);
                            i4 |= 8;
                        } else {
                            c = 4;
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i5 + 113;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str9);
                            i4 = i10 != 0 ? i4 | 3 : i4 | 16;
                        }
                    } else {
                        c = 4;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i4 |= 4;
                    }
                    c2 = c;
                    i3 = 1;
                } else {
                    char c3 = c2;
                    str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str11);
                    i4 |= 2;
                    int i11 = onWarmupCompleted + 23;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 4 % 2;
                    }
                    c2 = c3;
                    i3 = 1;
                }
            }
            i = i4;
            str = str5;
            list = list3;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetMiniCharts.ProductMiniChart.MiniChart(i, list, str4, str, str3, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m60deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            deserialize(decoder);
            throw null;
        }
        WidgetMiniCharts.ProductMiniChart.MiniChart miniChartDeserialize = deserialize(decoder);
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return miniChartDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.ProductMiniChart.MiniChart miniChart) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(miniChart, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WidgetMiniCharts.ProductMiniChart.MiniChart.onExtraCallback(miniChart, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(miniChart, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WidgetMiniCharts.ProductMiniChart.MiniChart.onExtraCallback(miniChart, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetMiniCharts.ProductMiniChart.MiniChart) obj);
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = onNavigationEvent + 41;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }
}
