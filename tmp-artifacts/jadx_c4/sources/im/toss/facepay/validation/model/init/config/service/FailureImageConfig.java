package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skt.usp.UCPApiConstants;
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
public final class FailureImageConfig {
    public static final Companion Companion;
    private static long onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private final int compressionRatio;
    private final boolean isEnabled;
    private final int maxCount;
    private final double resizeRatio;
    private static final byte[] $$a = {51, -113, 92, 4};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3;
        int i4 = 1 - (s * 2);
        byte[] bArr = $$a;
        int i5 = 97 - (b * 3);
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i5 = (-i5) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = i5;
            i5 = bArr[i6];
            i6++;
            i5 = (-i5) + i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 1;
        onWarmupCompleted();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public FailureImageConfig() {
        this(false, 0.0d, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailureImageConfig)) {
            int i2 = IAuthTabCallback + 55;
            IAuthTabCallbackStub = i2 % 128;
            return i2 % 2 == 0;
        }
        FailureImageConfig failureImageConfig = (FailureImageConfig) obj;
        if (this.isEnabled != failureImageConfig.isEnabled) {
            int i3 = IAuthTabCallbackStub + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.resizeRatio, failureImageConfig.resizeRatio) == 0) {
            return this.compressionRatio == failureImageConfig.compressionRatio && this.maxCount == failureImageConfig.maxCount;
        }
        int i5 = IAuthTabCallback + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 != 0 ? (((((r0 << UCPApiConstants.ARAM_TIME_OUT) % Double.hashCode(this.resizeRatio)) * 112) / Integer.hashCode(this.compressionRatio)) - 55) >>> Integer.hashCode(this.maxCount) : (((((Boolean.hashCode(this.isEnabled) * 31) + Double.hashCode(this.resizeRatio)) * 31) + Integer.hashCode(this.compressionRatio)) * 31) + Integer.hashCode(this.maxCount);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        boolean z = this.isEnabled;
        double d = this.resizeRatio;
        int i2 = this.compressionRatio;
        int i3 = this.maxCount;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getWindowTouchSlop() >> 8, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, (char) (TextUtils.lastIndexOf("", '0', 0) + 63707), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(z);
        Object[] objArr2 = new Object[1];
        a(29 - Gravity.getAbsoluteGravity(0, 0), 14 - KeyEvent.keyCodeFromString(""), (char) (Color.blue(0) + 14349), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d);
        Object[] objArr3 = new Object[1];
        a(43 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i2);
        Object[] objArr4 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63, 11 - View.resolveSize(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(i3);
        Object[] objArr5 = new Object[1];
        a(73 - Color.argb(0, 0, 0, 0), -((byte) KeyEvent.getModifierMetaStateMask()), (char) (Process.myPid() >> 22), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FailureImageConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            FailureImageConfig$$serializer failureImageConfig$$serializer = FailureImageConfig$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return failureImageConfig$$serializer;
        }
    }

    public /* synthetic */ FailureImageConfig(int i, boolean z, double d, int i2, int i3, okycx okycxVar) {
        this.isEnabled = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            int i4 = IAuthTabCallback + 15;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            this.resizeRatio = 0.25d;
            int i6 = 2 % 2;
        } else {
            this.resizeRatio = d;
        }
        if ((i & 4) == 0) {
            this.compressionRatio = 80;
        } else {
            this.compressionRatio = i2;
        }
        if ((i & 8) == 0) {
            int i7 = IAuthTabCallbackStub + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.maxCount = 10;
            return;
        }
        this.maxCount = i3;
        int i9 = IAuthTabCallback + 75;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 91 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(FailureImageConfig failureImageConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !failureImageConfig.isEnabled) {
            vylVar.onNavigationEvent(serialDescriptor, 0, failureImageConfig.isEnabled);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Double.compare(failureImageConfig.resizeRatio, 0.25d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, failureImageConfig.resizeRatio);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i2 = IAuthTabCallback + 59;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (failureImageConfig.compressionRatio != 80) {
                vylVar.onExtraCallback(serialDescriptor, 2, failureImageConfig.compressionRatio);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i4 = IAuthTabCallbackStub + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = failureImageConfig.maxCount;
            if (i5 != 0) {
                if (i6 == 3) {
                    return;
                }
            } else if (i6 == 10) {
                return;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 3, failureImageConfig.maxCount);
    }

    public FailureImageConfig(boolean z, double d, int i, int i2) {
        this.isEnabled = z;
        this.resizeRatio = d;
        this.compressionRatio = i;
        this.maxCount = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FailureImageConfig(boolean z, double d, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = IAuthTabCallbackStub + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        if ((i3 & 2) != 0) {
            int i6 = IAuthTabCallbackStub + 19;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            d = 0.25d;
        }
        double d2 = d;
        if ((i3 & 4) != 0) {
            int i7 = 2 % 2;
            i = 80;
        }
        int i8 = i;
        if ((i3 & 8) != 0) {
            int i9 = 2 % 2;
            i2 = 10;
        }
        this(z, d2, i8, i2);
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 91;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 2;
        }
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 125;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.blue(0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 10973 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, 20220 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), 44 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1494 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 49123), TextUtils.indexOf("", "", 0) + 44, 1494 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{5448, 41977, 30795, 13984, 53027, 34194, 21231, 60253, 41427, 32297, 13493, 52505, 39493, 20735, 59732, 42914, 31751, 2719, 50090, 38981, 22213, 61189, 42372, 29205, 2940, 49604, 40535, 21688, 60763, 54773, 25455, 47239, 63102, 4082, 17758, 37415, 11174, 24891, 48894, 62577, 3522, 23230, 36986, 60920, 23394, 32923, 52857, 14305, 32074, 43554, 5035, 22807, 34529, 52321, 13769, 25266, 43032, 4481, 24426, 34013, 62029, 15205, 60920, 23394, 32917, 52855, 14324, 32121, 43583, 5051, 22794, 34534, 52277, 60925};
        onExtraCallback = 3877746709953338178L;
    }
}
