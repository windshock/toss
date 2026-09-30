package im.toss.securities.libs.performance.tracker.data.model;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import o.oty1;
import o.setAnimationsLoop;
import o.setVideoListener;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class MetricRequestBody$$serializer implements aeu2<MetricRequestBody> {
    public static final int $stable;
    public static final MetricRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {113, 66, 51, 67};
    private static final int $$b = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3 = (s * 4) + 4;
        int i4 = i * 3;
        int i5 = 97 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i5 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 9;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted = 0;
        onExtraCallbackWithResult();
        MetricRequestBody$$serializer metricRequestBody$$serializer = new MetricRequestBody$$serializer();
        INSTANCE = metricRequestBody$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.securities.libs.performance.tracker.data.model.MetricRequestBody", metricRequestBody$$serializer, 4);
        setanimationsloop.onWarmupCompleted("step", false);
        setanimationsloop.onWarmupCompleted("start", true);
        setanimationsloop.onWarmupCompleted("end", true);
        Object[] objArr = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        $stable = 8;
        int i = IAuthTabCallback + 15;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private MetricRequestBody$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(oty1Var), sp.IAuthTabCallback(setVideoListener.onWarmupCompleted)};
        int i4 = asBinder + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MetricRequestBody deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Long l;
        Long l2;
        String str;
        Double d;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Long l3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asBinder + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            oty1 oty1Var = oty1.onExtraCallback;
            Long l4 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1Var, (Object) null);
            Long l5 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1Var, (Object) null);
            Double d2 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, (Object) null);
            int i5 = onNavigationEvent + 71;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 2;
            }
            i = 15;
            str = strAsInterface;
            d = d2;
            l = l5;
            l2 = l4;
        } else {
            int i7 = 0;
            boolean z = true;
            Long l6 = null;
            String strAsInterface2 = null;
            Double d3 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = asBinder + 39;
                    int i9 = i8 % 128;
                    onNavigationEvent = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent != 1) {
                        int i11 = i9 + 117;
                        asBinder = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (iOnNavigationEvent == 3) {
                                l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l3);
                                i7 |= 4;
                            } else {
                                if (iOnNavigationEvent == 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                d3 = (Double) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setVideoListener.onWarmupCompleted, d3);
                                i7 |= 8;
                            }
                        } else if (iOnNavigationEvent == 2) {
                            l3 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, oty1.onExtraCallback, l3);
                            i7 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        l6 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, oty1.onExtraCallback, l6);
                        i7 |= 2;
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                    int i12 = onNavigationEvent + 59;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
            i = i7;
            l = l3;
            l2 = l6;
            str = strAsInterface2;
            d = d3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MetricRequestBody(i, str, l2, l, d, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m27deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        MetricRequestBody metricRequestBodyDeserialize = deserialize(decoder);
        int i4 = asBinder + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return metricRequestBodyDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MetricRequestBody metricRequestBody) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(metricRequestBody, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MetricRequestBody.IAuthTabCallback(metricRequestBody, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 20 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(metricRequestBody, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            MetricRequestBody.IAuthTabCallback(metricRequestBody, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onNavigationEvent + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MetricRequestBody) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        int i3 = 2 / 0;
        return super.typeParametersSerializers();
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i - i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59697), 17 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionType(0L) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 32, 20220 - ExpandableListView.getPackedPositionType(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49122), TextUtils.getOffsetAfter("", 0) + 44, 1494 - Gravity.getAbsoluteGravity(0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.combineMeasuredStates(0, 0) + 17, 10973 - KeyEvent.getDeadChar(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20220 - ExpandableListView.getPackedPositionType(0L), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 49123), 44 - ExpandableListView.getPackedPositionType(0L), 1494 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 29;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 44 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i9 = $10 + 125;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{60834, 57229, 35272, 31497, 9553};
        onExtraCallbackWithResult = 4269966414916280300L;
    }
}
