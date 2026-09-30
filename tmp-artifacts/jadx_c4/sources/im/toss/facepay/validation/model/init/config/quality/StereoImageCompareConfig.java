package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.setVideoListener;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class StereoImageCompareConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final double areaRadiusRatio;
    private final Double ssimScoreThreshold;

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    public StereoImageCompareConfig() {
        this((Double) null, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 13;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof StereoImageCompareConfig)) {
            return false;
        }
        StereoImageCompareConfig stereoImageCompareConfig = (StereoImageCompareConfig) obj;
        if (!Intrinsics.areEqual(this.ssimScoreThreshold, stereoImageCompareConfig.ssimScoreThreshold)) {
            int i3 = onNavigationEvent + 73;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.areaRadiusRatio, stereoImageCompareConfig.areaRadiusRatio) == 0) {
            return true;
        }
        int i5 = onNavigationEvent + 13;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r2
      0x0023: PHI (r2v4 java.lang.Double) = (r2v2 java.lang.Double), (r2v5 java.lang.Double) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        Double d;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int iHashCode = 0;
        if (i3 % 2 != 0) {
            d = this.ssimScoreThreshold;
            int i4 = 94 / 0;
            if (d == null) {
                int i5 = i2 + 79;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                iHashCode = d.hashCode();
            }
        } else {
            d = this.ssimScoreThreshold;
            if (d == null) {
            }
        }
        return (iHashCode * 31) + Double.hashCode(this.areaRadiusRatio);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        Double d = this.ssimScoreThreshold;
        double d2 = this.areaRadiusRatio;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{0, 24, '!', 7, ' ', 30, '\r', 5, 25, 6, ' ', 1, 31, 5, 30, 27, 7, '!', 5, ' ', 11, 2, '\r', '\n', 20, ' ', 28, 14, 0, 31, 29, '!', 7, '!', 2, '\"', 7, '!', ' ', 2, '\"', 29, 1, 21}, (byte) (47 - Color.green(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 44, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a(new char[]{16, 21, 27, 6, 30, 25, 24, 25, 4, 15, 20, 29, 24, 25, 22, '\f', 31, 23}, (byte) (58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 18 - Color.green(0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a(new char[]{13819}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72), 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = asInterface + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StereoImageCompareConfig> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                StereoImageCompareConfig$$serializer stereoImageCompareConfig$$serializer = StereoImageCompareConfig$$serializer.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            StereoImageCompareConfig$$serializer stereoImageCompareConfig$$serializer2 = StereoImageCompareConfig$$serializer.INSTANCE;
            int i3 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return stereoImageCompareConfig$$serializer2;
        }
    }

    public /* synthetic */ StereoImageCompareConfig(int i, Double d, double d2, okycx okycxVar) {
        Object obj = null;
        this.ssimScoreThreshold = (i & 1) == 0 ? null : d;
        if ((i & 2) != 0) {
            this.areaRadiusRatio = d2;
            int i2 = asInterface + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = asInterface + 43;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.areaRadiusRatio = 0.35d;
        int i7 = i5 + 69;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(StereoImageCompareConfig stereoImageCompareConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : !(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, setVideoListener.onWarmupCompleted, stereoImageCompareConfig.ssimScoreThreshold);
            int i3 = onNavigationEvent + 107;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else if (stereoImageCompareConfig.ssimScoreThreshold != null) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onNavigationEvent + 45;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                Double.compare(stereoImageCompareConfig.areaRadiusRatio, 0.35d);
                throw null;
            }
            if (Double.compare(stereoImageCompareConfig.areaRadiusRatio, 0.35d) == 0) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, stereoImageCompareConfig.areaRadiusRatio);
    }

    public StereoImageCompareConfig(@Nullable Double d, double d2) {
        this.ssimScoreThreshold = d;
        this.areaRadiusRatio = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StereoImageCompareConfig(Double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asInterface;
            int i3 = i2 + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            d = null;
        }
        this(d, (i & 2) != 0 ? 0.35d : d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        char c = '0';
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0) + 1), 26 - Drawable.resolveOpacity(0, 0), 23140 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    j = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23139 - ExpandableListView.getPackedPositionGroup(0L), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i5 = $10 + 55;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i7 = $11 + 115;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24824), 74 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getEdgeSlop() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                try {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 30, TextUtils.lastIndexOf("", '0', 0) + 19489, 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i9];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                            } else {
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                            }
                        } else {
                            int i13 = $10 + 11;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent / 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback + b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i14 = 0; i14 < i; i14++) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new char[]{51244, 64990, 65008, 64983, 64999, 64981, 51240, 64980, 64989, 64961, 51232, 51247, 51243, 64922, 64923, 64927, 64986, 65018, 64967, 64910, 51233, 51245, 64915, 64966, 64978, 51242, 64960, 64976, 64991, 64993, 64992, 64982, 64987, 64963, 51246, 64988};
        onExtraCallback = (char) 51247;
    }
}
