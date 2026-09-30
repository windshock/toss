package im.toss.securities.widget.data.model.watchlists;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetMiniCharts$ProductMiniChart$$serializer implements aeu2<WidgetMiniCharts.ProductMiniChart> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final WidgetMiniCharts$ProductMiniChart$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        WidgetMiniCharts$ProductMiniChart$$serializer widgetMiniCharts$ProductMiniChart$$serializer = new WidgetMiniCharts$ProductMiniChart$$serializer();
        INSTANCE = widgetMiniCharts$ProductMiniChart$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.ProductMiniChart", widgetMiniCharts$ProductMiniChart$$serializer, 7);
        setanimationsloop.onWarmupCompleted("base", true);
        setanimationsloop.onWarmupCompleted("close", true);
        setanimationsloop.onWarmupCompleted("baseWithoutAfter", true);
        setanimationsloop.onWarmupCompleted("closeWithoutAfter", true);
        setanimationsloop.onWarmupCompleted("code", false);
        setanimationsloop.onWarmupCompleted("miniChart", true);
        Object[] objArr = new Object[1];
        a(new char[]{17275, 17173, 38523, 16573, 37000, 52807, 19956, 56724}, View.resolveSizeAndState(0, 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 53;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private WidgetMiniCharts$ProductMiniChart$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(price$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(price$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(price$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(price$$serializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, getwrigglelayout, kSerializerIAuthTabCallback5, getwrigglelayout};
        int i4 = IAuthTabCallback + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final WidgetMiniCharts.ProductMiniChart deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Price price;
        Price price2;
        Price price3;
        Price price4;
        String strAsInterface;
        WidgetMiniCharts.ProductMiniChart.MiniChart miniChart;
        String str;
        int i;
        char c;
        char c2;
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Price price5 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = onWarmupCompleted + 15;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Price$$serializer price$$serializer = Price$$serializer.INSTANCE;
            Price price6 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, price$$serializer, (Object) null);
            Price price7 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, price$$serializer, (Object) null);
            Price price8 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, price$$serializer, (Object) null);
            Price price9 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, price$$serializer, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            WidgetMiniCharts.ProductMiniChart.MiniChart miniChart2 = (WidgetMiniCharts.ProductMiniChart.MiniChart) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE, (Object) null);
            price = price8;
            price4 = price9;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            miniChart = miniChart2;
            str = strAsInterface2;
            i = 127;
            price3 = price6;
            price2 = price7;
        } else {
            int i6 = 0;
            boolean z = true;
            Price price10 = null;
            Price price11 = null;
            Price price12 = null;
            String strAsInterface3 = null;
            WidgetMiniCharts.ProductMiniChart.MiniChart miniChart3 = null;
            String strAsInterface4 = null;
            while (!(!z)) {
                int i7 = IAuthTabCallback + 119;
                onWarmupCompleted = i7 % 128;
                if (i7 % i2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 3;
                        z = false;
                        i2 = 2;
                    case 0:
                        c = 3;
                        price5 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, Price$$serializer.INSTANCE, price5);
                        i6 |= 1;
                        i2 = 2;
                    case 1:
                        price11 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, Price$$serializer.INSTANCE, price11);
                        i6 |= 2;
                        i2 = 2;
                    case 2:
                        c2 = 3;
                        price10 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i2, Price$$serializer.INSTANCE, price10);
                        i6 |= 4;
                    case 3:
                        c2 = 3;
                        price12 = (Price) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, Price$$serializer.INSTANCE, price12);
                        i6 |= 8;
                    case 4:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        miniChart3 = (WidgetMiniCharts.ProductMiniChart.MiniChart) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, WidgetMiniCharts$ProductMiniChart$MiniChart$$serializer.INSTANCE, miniChart3);
                        i6 |= 32;
                    case 6:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i6 |= 64;
                        int i8 = onWarmupCompleted + 23;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % i2;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            price = price10;
            price2 = price11;
            price3 = price5;
            price4 = price12;
            strAsInterface = strAsInterface3;
            miniChart = miniChart3;
            str = strAsInterface4;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetMiniCharts.ProductMiniChart(i, price3, price2, price, price4, str, miniChart, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m59deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        WidgetMiniCharts.ProductMiniChart productMiniChartDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return productMiniChartDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.ProductMiniChart productMiniChart) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(productMiniChart, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WidgetMiniCharts.ProductMiniChart.IAuthTabCallback(productMiniChart, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 6 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(productMiniChart, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            WidgetMiniCharts.ProductMiniChart.IAuthTabCallback(productMiniChart, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetMiniCharts.ProductMiniChart) obj);
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 5;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 49;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 84 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21232, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14184), 18 - TextUtils.indexOf((CharSequence) "", '0', 0), 8808 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onExtraCallback = -1384927494146327138L;
    }
}
