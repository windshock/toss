package im.toss.tosssecurities.widget.watchlist.model;

import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.securities.widget.data.model.watchlists.ItemType;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
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
import o.jp;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$RowItem$$serializer implements aeu2<WatchlistWidgetState.RowItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final WatchlistWidgetState$RowItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        WatchlistWidgetState$RowItem$$serializer watchlistWidgetState$RowItem$$serializer = new WatchlistWidgetState$RowItem$$serializer();
        INSTANCE = watchlistWidgetState$RowItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.RowItem", watchlistWidgetState$RowItem$$serializer, 11);
        Object[] objArr = new Object[1];
        a(new char[]{57607, 7095, 3679, 46924, 57705, 2121, 10508, 36340}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("productCode", false);
        setanimationsloop.onWarmupCompleted("close", false);
        setanimationsloop.onWarmupCompleted("baseWithoutAfter", true);
        setanimationsloop.onWarmupCompleted("closeWithoutAfter", true);
        setanimationsloop.onWarmupCompleted("candles", false);
        setanimationsloop.onWarmupCompleted("profitRatio", false);
        setanimationsloop.onWarmupCompleted("ratio", true);
        setanimationsloop.onWarmupCompleted("tradingStart", false);
        setanimationsloop.onWarmupCompleted("tradingEnd", false);
        setanimationsloop.onWarmupCompleted("itemType", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 55;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private WatchlistWidgetState$RowItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnWarmupCompleted = WatchlistWidgetState.RowItem.onWarmupCompleted();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, setvideolistener, setvideolistener, lazyArrOnWarmupCompleted[5].getValue(), getwrigglelayout, setvideolistener, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnWarmupCompleted[10].getValue())};
        int i4 = onExtraCallbackWithResult + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.jp
    public final WatchlistWidgetState.RowItem deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        ItemType itemType;
        String str2;
        String str3;
        String str4;
        double d;
        String str5;
        String str6;
        double d2;
        List list;
        double d3;
        char c;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = WatchlistWidgetState.RowItem.onWarmupCompleted();
        int i3 = 9;
        int i4 = 7;
        ItemType itemType2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
            List list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
            double dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 7);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getwrigglelayout, null);
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, getwrigglelayout, null);
            i = 2047;
            str3 = strAsInterface4;
            list = list2;
            str5 = str7;
            d = dIAuthTabCallback;
            d3 = dIAuthTabCallback2;
            itemType = (ItemType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrOnWarmupCompleted[10].getValue(), null);
            str2 = strAsInterface;
            str6 = str8;
            str4 = strAsInterface2;
            d2 = dIAuthTabCallback3;
            str = strAsInterface3;
        } else {
            boolean z = true;
            String strAsInterface5 = null;
            List list3 = null;
            String str9 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            double dIAuthTabCallback4 = 0.0d;
            double dIAuthTabCallback5 = 0.0d;
            double dIAuthTabCallback6 = 0.0d;
            i = 0;
            String str10 = null;
            String strAsInterface8 = null;
            while (z) {
                int i5 = onExtraCallback + 125;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        c = 2;
                        z = false;
                        i3 = 9;
                    case 0:
                        c2 = 2;
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        i3 = 9;
                        i4 = 7;
                    case 1:
                        c2 = 2;
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i |= 2;
                        i3 = 9;
                        i4 = 7;
                    case 2:
                        c2 = 2;
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        int i6 = onExtraCallback + 65;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        c2 = 2;
                        dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 3);
                        i |= 8;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        c = 2;
                        dIAuthTabCallback5 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 4);
                        i |= 16;
                        i3 = 9;
                    case 5:
                        list3 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnWarmupCompleted[5].getValue(), list3);
                        i |= 32;
                        int i8 = onExtraCallback + 89;
                        onExtraCallbackWithResult = i8 % 128;
                        c = 2;
                        int i9 = i8 % 2;
                        i3 = 9;
                    case 6:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 6);
                        i |= 64;
                    case 7:
                        dIAuthTabCallback6 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, i4);
                        i |= 128;
                    case 8:
                        str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, str9);
                        i |= 256;
                    case 9:
                        str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, getWriggleLayout.onNavigationEvent, str10);
                        i |= Imgcodecs.IMWRITE_AVIF_QUALITY;
                    case 10:
                        itemType2 = (ItemType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, (jp) lazyArrOnWarmupCompleted[10].getValue(), itemType2);
                        i |= 1024;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface5;
            itemType = itemType2;
            str2 = strAsInterface8;
            str3 = strAsInterface6;
            str4 = strAsInterface7;
            d = dIAuthTabCallback4;
            str5 = str9;
            str6 = str10;
            d2 = dIAuthTabCallback6;
            list = list3;
            d3 = dIAuthTabCallback5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.RowItem(i, str2, str4, str, d, d3, list, str3, d2, str5, str6, itemType, null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WatchlistWidgetState.RowItem rowItemDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return rowItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.RowItem rowItem) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(rowItem, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WatchlistWidgetState.RowItem.onWarmupCompleted(rowItem, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rowItem, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WatchlistWidgetState.RowItem.onWarmupCompleted(rowItem, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.RowItem) obj);
        int i4 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 29;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 45812), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 83, 21233 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14185), 19 - (Process.myTid() >> 22), 8809 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 107;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 8549748368034719891L;
    }
}
