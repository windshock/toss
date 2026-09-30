package viva.republica.toss.network.model.common;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CheckVersionResponse$$serializer implements aeu2<CheckVersionResponse> {
    public static final CheckVersionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {81, 99, 107, 124};
    private static final int $$b = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;

    private static String $$c(int i, short s, short s2) {
        int i2 = s * 4;
        int i3 = 4 - (i * 2);
        int i4 = (s2 * 3) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            i4 += bArr[i3];
            i3++;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted = 0;
        onNavigationEvent();
        CheckVersionResponse$$serializer checkVersionResponse$$serializer = new CheckVersionResponse$$serializer();
        INSTANCE = checkVersionResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.common.CheckVersionResponse", checkVersionResponse$$serializer, 8);
        Object[] objArr = new Object[1];
        a((-16777216) - Color.rgb(0, 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5, (char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("update", true);
        setanimationsloop.onWarmupCompleted("link", true);
        setanimationsloop.onWarmupCompleted("latestAppVersion", true);
        Object[] objArr2 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 6, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4, (char) (7020 - (Process.myTid() >> 22)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 8, (char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a(18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 8 - (ViewConfiguration.getTapTimeout() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("periodHour", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 101;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private CheckVersionResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getdynamicheight);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getdynamicheight);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(oty1.onExtraCallback)};
        int i4 = IAuthTabCallback + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CheckVersionResponse checkVersionResponseM45deserialize = m45deserialize(decoder);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        return checkVersionResponseM45deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final CheckVersionResponse m45deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Long l;
        Integer num2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        IAuthTabCallbackStub = i3 % 128;
        String str6 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 7;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Long l2 = null;
            num = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            Integer num3 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = IAuthTabCallbackStub + 21;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i5 |= 1;
                        num3 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num3);
                        i4 = 7;
                        break;
                    case 1:
                        num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, num);
                        i5 |= 2;
                        int i8 = IAuthTabCallbackStub + 55;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        break;
                    case 2:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 4;
                        break;
                    case 3:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                        i5 |= 8;
                        break;
                    case 4:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 16;
                        break;
                    case 5:
                        str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str3);
                        i5 |= 32;
                        break;
                    case 6:
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str4);
                        i5 |= 64;
                        break;
                    case 7:
                        l2 = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, oty1.onExtraCallback, l2);
                        i5 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            int i10 = IAuthTabCallbackStub + 119;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            l = l2;
            str5 = str6;
            i = i5;
            num2 = num3;
        } else {
            getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
            Integer num4 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getdynamicheight, (Object) null);
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getdynamicheight, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str5 = str7;
            i = 255;
            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, oty1.onExtraCallback, (Object) null);
            num2 = num4;
        }
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CheckVersionResponse(i, num2, num, str5, str10, str9, str8, str4, l, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CheckVersionResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CheckVersionResponse checkVersionResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(checkVersionResponse, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CheckVersionResponse.onWarmupCompleted(checkVersionResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(checkVersionResponse, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CheckVersionResponse.onWarmupCompleted(checkVersionResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 55;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = $11 + 41;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i / i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.red(0)), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getTapTimeout() >> 16)), View.resolveSizeAndState(0, 0, 0) + 31, 20220 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getEdgeSlop() >> 16)), 44 - Color.blue(0), 1494 - ((Process.getThreadPriority(0) + 20) >> 6), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i8])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.makeMeasureSpec(0, 0)), 17 - ((Process.getThreadPriority(0) + 20) >> 6), (KeyEvent.getMaxKeyCode() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - Process.getGidForName(BuildConfig.FLAVOR)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getScrollBarSize() >> 8), 1494 - (ViewConfiguration.getTapTimeout() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
            int i9 = $10 + 91;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), 44 - Color.blue(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback8 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49123), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 1494, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{60838, 5515, 7635, 1295, 3408, 13442, 63180, 3819, 1720, 7802, 5685, 60857, 5515, 7635, 1289, 3421, 13457, 15597, 60861, 5507, 7617, 1309, 3417, 13475, 15610, 9262};
        onNavigationEvent = -2821431385727756818L;
    }
}
