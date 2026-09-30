package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WarmUpConfig {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final int count;
    private final int intervalMinute;
    private final long timeoutMs;

    static {
        IAuthTabCallback();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public WarmUpConfig() {
        this(0, 0L, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 37;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof WarmUpConfig)) {
            return false;
        }
        WarmUpConfig warmUpConfig = (WarmUpConfig) obj;
        if (this.count != warmUpConfig.count || this.timeoutMs != warmUpConfig.timeoutMs || this.intervalMinute != warmUpConfig.intervalMinute) {
            return false;
        }
        int i4 = onExtraCallback + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Integer.hashCode(this.count) * 31) + Long.hashCode(this.timeoutMs)) * 31) + Integer.hashCode(this.intervalMinute);
        int i4 = onExtraCallback + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.count;
        long j = this.timeoutMs;
        int i3 = this.intervalMinute;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{23, 17, 21, 14, 1, 23, 3, 7, 17, 16, 3, 21, 24, '\n', '\t', 7, 19, 1, 13837}, (byte) (102 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(new char[]{18, '\f', 0, 2, '\f', 11, '\t', 7, 2, '\t', 2, '\n'}, (byte) (101 - View.MeasureSpec.getMode(0)), (Process.myTid() >> 22) + 12, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(j);
        Object[] objArr3 = new Object[1];
        a(new char[]{18, '\f', 6, 21, 0, 14, 4, 24, 19, '\b', 6, 2, 21, 11, 0, 14, 13808}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 73), Color.argb(0, 0, 0, 0) + 17, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i3);
        Object[] objArr4 = new Object[1];
        a(new char[]{13848}, (byte) (100 - TextUtils.lastIndexOf("", '0')), 1 - Color.green(0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i4 = onExtraCallback + 63;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WarmUpConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            WarmUpConfig$$serializer warmUpConfig$$serializer = WarmUpConfig$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 99;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return warmUpConfig$$serializer;
            }
            throw null;
        }
    }

    public /* synthetic */ WarmUpConfig(int i, int i2, long j, int i3, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i4 = IAuthTabCallbackDefault + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 4;
            } else {
                int i6 = 2 % 2;
            }
            i2 = 10;
        }
        this.count = i2;
        if ((i & 2) == 0) {
            this.timeoutMs = 15000L;
            int i7 = onExtraCallback + 67;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.timeoutMs = j;
        }
        if ((i & 4) != 0) {
            this.intervalMinute = i3;
            return;
        }
        int i9 = onExtraCallback + 31;
        IAuthTabCallbackDefault = i9 % 128;
        this.intervalMinute = i9 % 2 == 0 ? 50 : 60;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(WarmUpConfig warmUpConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || warmUpConfig.count != 10) {
            vylVar.onExtraCallback(serialDescriptor, 0, warmUpConfig.count);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = IAuthTabCallbackDefault + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (warmUpConfig.timeoutMs != 15000) {
                vylVar.onExtraCallback(serialDescriptor, 1, warmUpConfig.timeoutMs);
                int i6 = onExtraCallback + 103;
                IAuthTabCallbackDefault = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || warmUpConfig.intervalMinute != 60) {
            vylVar.onExtraCallback(serialDescriptor, 2, warmUpConfig.intervalMinute);
            int i8 = onExtraCallback + 65;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public WarmUpConfig(int i, long j, int i2) {
        this.count = i;
        this.timeoutMs = j;
        this.intervalMinute = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WarmUpConfig(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = IAuthTabCallbackDefault + 53;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 39;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 10;
        }
        if ((i3 & 2) != 0) {
            int i9 = IAuthTabCallbackDefault + 109;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            j = 15000;
        }
        if ((i3 & 4) != 0) {
            int i12 = 2 % 2;
            i2 = 60;
        }
        this(i, j, i2);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        float f = 0.0f;
        if (cArr2 != null) {
            int i4 = $11 + 29;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 26 - (ViewConfiguration.getTapTimeout() >> 16), 23138 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 83;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23139 - (KeyEvent.getMaxKeyCode() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 81;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 24825), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74, 8088 - KeyEvent.getDeadChar(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 83;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, 19488 - (Process.myPid() >> 22), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } else {
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            int i18 = $10 + 89;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{64960, 64986, 65008, 64998, 64967, 64922, 64966, 65022, 64988, 64991, 64982, 64990, 64910, 64915, 64976, 64981, 64989, 64927, 64978, 64965, 64923, 64963, 64996, 64980, 64961};
        onExtraCallbackWithResult = (char) 51244;
    }
}
