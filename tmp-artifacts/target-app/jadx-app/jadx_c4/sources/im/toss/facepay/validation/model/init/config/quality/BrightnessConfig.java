package im.toss.facepay.validation.model.init.config.quality;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BrightnessConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final double tooBrightThreshold;
    private final double tooDarkThreshold;

    static {
        onWarmupCompleted();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 1;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public BrightnessConfig() {
        this(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrightnessConfig)) {
            int i4 = i3 + 19;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        BrightnessConfig brightnessConfig = (BrightnessConfig) obj;
        if (Double.compare(this.tooDarkThreshold, brightnessConfig.tooDarkThreshold) != 0) {
            return false;
        }
        if (Double.compare(this.tooBrightThreshold, brightnessConfig.tooBrightThreshold) == 0) {
            return true;
        }
        int i5 = onWarmupCompleted + 123;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? (Double.hashCode(this.tooDarkThreshold) / 102) << Double.hashCode(this.tooBrightThreshold) : (Double.hashCode(this.tooDarkThreshold) * 31) + Double.hashCode(this.tooBrightThreshold);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        double d = this.tooDarkThreshold;
        double d2 = this.tooBrightThreshold;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 34, 0, 0}, false, new byte[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a(new int[]{34, 21, 0, 2}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a(new int[]{55, 1, 192, 1}, false, new byte[]{1}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BrightnessConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            BrightnessConfig$$serializer brightnessConfig$$serializer = BrightnessConfig$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return brightnessConfig$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ BrightnessConfig(int i, double d, double d2, okycx okycxVar) {
        this.tooDarkThreshold = (i & 1) == 0 ? 0.2d : d;
        if ((i & 2) == 0) {
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.tooBrightThreshold = 0.7d;
            if (i3 != 0) {
                int i4 = 55 / 0;
                return;
            }
            return;
        }
        this.tooBrightThreshold = d2;
        int i5 = onWarmupCompleted + 119;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onWarmupCompleted(BrightnessConfig brightnessConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, brightnessConfig.tooDarkThreshold);
        } else {
            int i4 = onWarmupCompleted + 109;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                Double.compare(brightnessConfig.tooDarkThreshold, 0.2d);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (Double.compare(brightnessConfig.tooDarkThreshold, 0.2d) != 0) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || Double.compare(brightnessConfig.tooBrightThreshold, 0.7d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, brightnessConfig.tooBrightThreshold);
            int i5 = onWarmupCompleted + 83;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public BrightnessConfig(double d, double d2) {
        this.tooDarkThreshold = d;
        this.tooBrightThreshold = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrightnessConfig(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            d = 0.2d;
        }
        if ((i & 2) != 0) {
            int i5 = onWarmupCompleted + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            d2 = 0.7d;
        }
        this(d, d2);
    }

    public final double onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        double d = this.tooDarkThreshold;
        if (i4 != 0) {
            int i5 = 47 / 0;
        }
        int i6 = i3 + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        double d = this.tooBrightThreshold;
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        int i6 = i3 + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return d;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 35283), 35 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 51;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            char[] cArr5 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 53;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 10936), (ViewConfiguration.getTapTimeout() >> 16) + 65, 16719 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(obj, objArr3)).charValue();
                        int i11 = 23 / 0;
                    } else {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 10935), KeyEvent.keyCodeFromString("") + 65, 16717 - TextUtils.lastIndexOf("", '0', 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(obj, objArr4)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 29, View.MeasureSpec.makeMeasureSpec(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(obj, objArr5)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 49467), (Process.myPid() >> 22) + 70, 12486 - (ViewConfiguration.getTapTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr4, i14, i5);
            System.arraycopy(cArr6, i5, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 33;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{27247, 27156, 27171, 27174, 27177, 27168, 27199, 27175, 27170, 27197, 27157, 27159, 27168, 27172, 27177, 27174, 27145, 27136, 27199, 27169, 27159, 27164, 27175, 27168, 27153, 27152, 27171, 27173, 27170, 27171, 27173, 27171, 27174, 27166, 27260, 27166, 27258, 27240, 27140, 27199, 27169, 27158, 27156, 27171, 27174, 27177, 27168, 27178, 27152, 27171, 27173, 27170, 27171, 27173, 27171, 27194};
    }
}
