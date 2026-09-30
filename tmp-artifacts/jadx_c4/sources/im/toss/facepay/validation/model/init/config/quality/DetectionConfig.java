package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DetectionConfig {
    public static final Companion Companion;
    private static int IAuthTabCallback;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private final float iouThreshold;
    private final int maxOutputs;
    private final float scoreThreshold;
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, byte b) {
        int i2;
        int i3 = (b * 3) + 97;
        int i4 = i + 4;
        int i5 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i3 = (-i3) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i4++;
            i7 = i3;
            i3 = bArr[i4];
            i3 = (-i3) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 109;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public DetectionConfig() {
        this(0, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 49;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof DetectionConfig)) {
            return false;
        }
        DetectionConfig detectionConfig = (DetectionConfig) obj;
        if (this.maxOutputs != detectionConfig.maxOutputs || Float.compare(this.iouThreshold, detectionConfig.iouThreshold) != 0) {
            return false;
        }
        if (Float.compare(this.scoreThreshold, detectionConfig.scoreThreshold) != 0) {
            int i7 = onTransact + 109;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = onNavigationEvent + 53;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.maxOutputs) % 32) << Float.hashCode(this.iouThreshold)) >> 32) - Float.hashCode(this.scoreThreshold) : (((Integer.hashCode(this.maxOutputs) * 31) + Float.hashCode(this.iouThreshold)) * 31) + Float.hashCode(this.scoreThreshold);
        int i3 = onTransact + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.maxOutputs;
        float f = this.iouThreshold;
        float f2 = this.scoreThreshold;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, (char) (TextUtils.indexOf((CharSequence) "", '0') + 42906), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(f);
        Object[] objArr3 = new Object[1];
        a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, TextUtils.lastIndexOf("", '0', 0) + 18, (char) View.resolveSizeAndState(0, 0, 0), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(f2);
        Object[] objArr4 = new Object[1];
        a('k' - AndroidCharacter.getMirror('0'), (ViewConfiguration.getEdgeSlop() >> 16) + 1, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1301), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i3 = onNavigationEvent + 93;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DetectionConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DetectionConfig$$serializer detectionConfig$$serializer = DetectionConfig$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return detectionConfig$$serializer;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DetectionConfig(int i, int i2, float f, float f2, okycx okycxVar) {
        this.maxOutputs = (i & 1) == 0 ? 3 : i2;
        if ((i & 2) == 0) {
            int i3 = onTransact + 75;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            this.iouThreshold = 0.4f;
            int i6 = i4 + 31;
            onTransact = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        } else {
            this.iouThreshold = f;
            int i8 = onNavigationEvent + 85;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
            }
        }
        if ((i & 4) != 0) {
            this.scoreThreshold = f2;
            return;
        }
        this.scoreThreshold = 0.7f;
        int i9 = onNavigationEvent + 49;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(DetectionConfig detectionConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onTransact + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (detectionConfig.maxOutputs != 3) {
                vylVar.onExtraCallback(serialDescriptor, 0, detectionConfig.maxOutputs);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 63;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                Float.compare(detectionConfig.iouThreshold, 0.4f);
                throw null;
            }
            if (Float.compare(detectionConfig.iouThreshold, 0.4f) != 0) {
                vylVar.onExtraCallback(serialDescriptor, 1, detectionConfig.iouThreshold);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || Float.compare(detectionConfig.scoreThreshold, 0.7f) != 0) {
            vylVar.onExtraCallback(serialDescriptor, 2, detectionConfig.scoreThreshold);
        }
    }

    public DetectionConfig(int i, float f, float f2) {
        this.maxOutputs = i;
        this.iouThreshold = f;
        this.scoreThreshold = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DetectionConfig(int i, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i2 & 1) != 0 ? 3 : i;
        if ((i2 & 2) != 0) {
            int i3 = onTransact + 105;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            f = 0.4f;
        }
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 95;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            f2 = 0.7f;
        }
        this(i, f, f2);
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.maxOutputs;
        if (i3 == 0) {
            int i5 = 27 / 0;
        }
        return i4;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        float f = this.iouThreshold;
        int i5 = i2 + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        float f = this.scoreThreshold;
        int i4 = i3 + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = $10 + 101;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - Color.green(0)), 31 - (ViewConfiguration.getLongPressTimeout() >> 16), 20220 - (ViewConfiguration.getJumpTapTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "")), 44 - (ViewConfiguration.getTouchSlop() >> 8), 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i8 = $11 + 99;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1493 - MotionEvent.axisFromString(""), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i9 = $11 + 115;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{18953, 21409, 31019, 1715, 11274, 13716, 54034, 63645, 34411, 45023, 46456, 21184, 30791, 465, 12116, 13666, 53936, 63541, 33175, 44841, 46220, 20996, 31739, 375, 12001, 13407, 56730, 60920, 62589, 57007, 41248, 35717, 37421, 29834, 24345, 8697, 2166, 4838, 62808, 57300, 42565, 34967, 60920, 62589, 57013, 41260, 35743, 37387, 29831, 24383, 8692, 2167, 4843, 62788, 57296, 42574, 35014, 37559, 30073, 59627};
        onExtraCallbackWithResult = 3218815353679508573L;
    }
}
