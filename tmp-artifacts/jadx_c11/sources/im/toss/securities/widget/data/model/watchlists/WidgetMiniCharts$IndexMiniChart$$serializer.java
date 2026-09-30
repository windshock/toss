package im.toss.securities.widget.data.model.watchlists;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class WidgetMiniCharts$IndexMiniChart$$serializer implements aeu2<WidgetMiniCharts.IndexMiniChart> {
    private static char[] IAuthTabCallback;
    public static final WidgetMiniCharts$IndexMiniChart$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback;
    private static int onNavigationEvent;
    private static final byte[] $$a = {113, 46, 90, -12};
    private static final int $$b = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = s * 3;
        int i7 = (i2 * 2) + 97;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i5 += i7;
            i4 = i9;
            i3 = i10;
            int i11 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
                return new String(bArr2, 0);
            }
            int i12 = i3 + 1;
            i9 = i11;
            i7 = bArr[i11];
            i10 = i12;
            i5 += i7;
            i4 = i9;
            i3 = i10;
            int i112 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            i5 = i7;
            int i1122 = i4 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i8) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return serialDescriptor;
    }

    static {
        onNavigationEvent = 0;
        IAuthTabCallback();
        WidgetMiniCharts$IndexMiniChart$$serializer widgetMiniCharts$IndexMiniChart$$serializer = new WidgetMiniCharts$IndexMiniChart$$serializer();
        INSTANCE = widgetMiniCharts$IndexMiniChart$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.widget.data.model.watchlists.WidgetMiniCharts.IndexMiniChart", widgetMiniCharts$IndexMiniChart$$serializer, 5);
        setanimationsloop.onWarmupCompleted("base", false);
        setanimationsloop.onWarmupCompleted("close", false);
        setanimationsloop.onWarmupCompleted("code", false);
        setanimationsloop.onWarmupCompleted("miniChart", true);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getTapTimeout() >> 16, ExpandableListView.getPackedPositionChild(0L) + 5, (char) (TextUtils.indexOf((CharSequence) "", '0') + 10947), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 105;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private WidgetMiniCharts$IndexMiniChart$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE);
            setVideoListener setvideolistener = setVideoListener.onWarmupCompleted;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{setvideolistener, setvideolistener, getwrigglelayout, kSerializerIAuthTabCallback, getwrigglelayout};
        }
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE);
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        setVideoListener setvideolistener2 = setVideoListener.onWarmupCompleted;
        kSerializerArr[0] = setvideolistener2;
        kSerializerArr[1] = setvideolistener2;
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[4] = kSerializerIAuthTabCallback2;
        kSerializerArr[4] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WidgetMiniCharts.IndexMiniChart deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        WidgetMiniCharts.IndexMiniChart.MiniChart miniChart;
        String strAsInterface;
        int i;
        double d;
        double d2;
        String strAsInterface2;
        char c;
        char c2;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        char c3 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            double dIAuthTabCallback = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
            double dIAuthTabCallback2 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            miniChart = (WidgetMiniCharts.IndexMiniChart.MiniChart) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE, (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            d2 = dIAuthTabCallback2;
            d = dIAuthTabCallback;
            i = 31;
        } else {
            String strAsInterface3 = null;
            int i4 = 0;
            boolean z = true;
            double dIAuthTabCallback3 = 0.0d;
            double dIAuthTabCallback4 = 0.0d;
            WidgetMiniCharts.IndexMiniChart.MiniChart miniChart2 = null;
            String strAsInterface4 = null;
            while (z) {
                int i5 = asInterface + 5;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i7 = onExtraCallbackWithResult;
                    int i8 = i7 + 1;
                    asInterface = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent != 1) {
                            int i9 = i7 + 41;
                            int i10 = i9 % 128;
                            asInterface = i10;
                            if (i9 % 2 == 0) {
                                if (iOnNavigationEvent == 4) {
                                    c = 4;
                                    c2 = 3;
                                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                    i4 |= 4;
                                }
                                if (iOnNavigationEvent == 3) {
                                    int i11 = i10 + 41;
                                    onExtraCallbackWithResult = i11 % 128;
                                    int i12 = i11 % 2;
                                    if (iOnNavigationEvent != 4) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                                    i4 |= 16;
                                    c3 = 3;
                                } else {
                                    c = 4;
                                    c2 = 3;
                                    miniChart2 = (WidgetMiniCharts.IndexMiniChart.MiniChart) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, WidgetMiniCharts$IndexMiniChart$MiniChart$$serializer.INSTANCE, miniChart2);
                                    i4 |= 8;
                                }
                            } else {
                                if (iOnNavigationEvent == 2) {
                                    c = 4;
                                    c2 = 3;
                                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                    i4 |= 4;
                                }
                                if (iOnNavigationEvent == 3) {
                                }
                            }
                        } else {
                            c = 4;
                            c2 = 3;
                            dIAuthTabCallback4 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 1);
                            i4 |= 2;
                        }
                        c3 = c2;
                    } else {
                        dIAuthTabCallback3 = ywVarOnWarmupCompleted.IAuthTabCallback(serialDescriptor, 0);
                        i4 |= 1;
                        c3 = 3;
                    }
                } else {
                    z = false;
                }
            }
            miniChart = miniChart2;
            strAsInterface = strAsInterface4;
            i = i4;
            d = dIAuthTabCallback3;
            d2 = dIAuthTabCallback4;
            strAsInterface2 = strAsInterface3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WidgetMiniCharts.IndexMiniChart(i, d, d2, strAsInterface2, miniChart, strAsInterface, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m56deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        WidgetMiniCharts.IndexMiniChart indexMiniChartDeserialize = deserialize(decoder);
        int i4 = asInterface + 33;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return indexMiniChartDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WidgetMiniCharts.IndexMiniChart indexMiniChart) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(indexMiniChart, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        WidgetMiniCharts.IndexMiniChart.onWarmupCompleted(indexMiniChart, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WidgetMiniCharts.IndexMiniChart) obj);
        int i4 = asInterface + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 25 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = asInterface + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $11 + 15;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTapTimeout() >> 16)), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.rgb(0, 0, 0) + 16788189, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 46134), View.getDefaultSize(0, 0) + 31, 20221 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), View.MeasureSpec.makeMeasureSpec(0, 0) + 44, 1494 - ExpandableListView.getPackedPositionGroup(0L), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 43, ((Process.getThreadPriority(0) + 20) >> 6) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i8 = 45 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, TextUtils.getOffsetBefore("", 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{51064, 36259, 21203, 9999};
        onExtraCallback = -4054453746937059584L;
    }
}
