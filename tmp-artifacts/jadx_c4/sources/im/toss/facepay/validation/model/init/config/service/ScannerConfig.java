package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
public final class ScannerConfig {
    public static final Companion Companion;
    private static long IAuthTabCallback;
    private static char[] onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final int connectionCacheMinute;
    private final int deviceRetryDurationMinute;
    private final boolean isEnabled;
    private final int localCacheMinute;
    private final int reconnectionIntervalMs;
    private final int runnerCount;
    private final int signalStrength;
    private static final byte[] $$a = {29, -26, 91, 68};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, short s2) {
        int i;
        int i2;
        ?? r7 = 97 - (s * 3);
        int i3 = s2 * 3;
        byte[] bArr = $$a;
        int i4 = 3 - (b * 4);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            byte b2 = r7;
            int i5 = 0;
            int i6 = i4;
            int i7 = i4 + (-b2);
            i = i5;
            int i8 = i6;
            i2 = i7;
            i4 = i8;
            int i9 = i4 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            b2 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i4 = i10;
            int i72 = i4 + (-b2);
            i = i5;
            int i82 = i6;
            i2 = i72;
            i4 = i82;
            int i92 = i4 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = r7;
            int i922 = i4 + 1;
            bArr2[i] = (byte) i2;
            i5 = i + 1;
            if (i == i3) {
            }
        }
    }

    static {
        onNavigationEvent = 0;
        onExtraCallback();
        Companion = new Companion(null);
        int i = onWarmupCompleted + 5;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public ScannerConfig() {
        this(0, 0, 0, false, 0, 0, 0, 127, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStub + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ScannerConfig)) {
            int i4 = onExtraCallback + 93;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ScannerConfig scannerConfig = (ScannerConfig) obj;
        if (this.signalStrength != scannerConfig.signalStrength) {
            int i6 = onExtraCallback + 77;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.reconnectionIntervalMs != scannerConfig.reconnectionIntervalMs) {
            int i8 = IAuthTabCallbackStub + 101;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.connectionCacheMinute != scannerConfig.connectionCacheMinute) {
            int i10 = IAuthTabCallbackStub + 11;
            onExtraCallback = i10 % 128;
            return i10 % 2 != 0;
        }
        if (this.isEnabled == scannerConfig.isEnabled) {
            return this.runnerCount == scannerConfig.runnerCount && this.deviceRetryDurationMinute == scannerConfig.deviceRetryDurationMinute && this.localCacheMinute == scannerConfig.localCacheMinute;
        }
        int i11 = IAuthTabCallbackStub + 13;
        onExtraCallback = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Integer.hashCode(this.signalStrength) * 31) + Integer.hashCode(this.reconnectionIntervalMs)) * 31) + Integer.hashCode(this.connectionCacheMinute)) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Integer.hashCode(this.runnerCount)) * 31) + Integer.hashCode(this.deviceRetryDurationMinute)) * 31) + Integer.hashCode(this.localCacheMinute);
        int i4 = onExtraCallback + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        int i2 = this.signalStrength;
        int i3 = this.reconnectionIntervalMs;
        int i4 = this.connectionCacheMinute;
        boolean z = this.isEnabled;
        int i5 = this.runnerCount;
        int i6 = this.deviceRetryDurationMinute;
        int i7 = this.localCacheMinute;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((-1) - ExpandableListView.getPackedPositionChild(0L), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, (char) View.combineMeasuredStates(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(i2);
        Object[] objArr2 = new Object[1];
        a(28 - ExpandableListView.getPackedPositionChild(0L), 24 - Process.getGidForName(""), (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(i3);
        Object[] objArr3 = new Object[1];
        a(54 - ExpandableListView.getPackedPositionType(0L), 24 - Color.blue(0), (char) (ExpandableListView.getPackedPositionType(0L) + 32031), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i4);
        Object[] objArr4 = new Object[1];
        a(78 - ((Process.getThreadPriority(0) + 20) >> 6), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(z);
        Object[] objArr5 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0) + 91, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(i5);
        Object[] objArr6 = new Object[1];
        a(104 - (ViewConfiguration.getJumpTapTimeout() >> 16), 27 - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(i6);
        Object[] objArr7 = new Object[1];
        a(132 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 57832), objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(i7);
        Object[] objArr8 = new Object[1];
        a(150 - ((byte) KeyEvent.getModifierMetaStateMask()), 1 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ExpandableListView.getPackedPositionGroup(0L) + 16492), objArr8);
        sb.append(((String) objArr8[0]).intern());
        String string = sb.toString();
        int i8 = IAuthTabCallbackStub + 83;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ScannerConfig> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ScannerConfig$$serializer scannerConfig$$serializer = ScannerConfig$$serializer.INSTANCE;
            int i4 = onExtraCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return scannerConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ScannerConfig(int i, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, okycx okycxVar) {
        this.signalStrength = (i & 1) == 0 ? -83 : i2;
        if ((i & 2) == 0) {
            int i8 = IAuthTabCallbackStub;
            int i9 = i8 + 91;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            this.reconnectionIntervalMs = 1000;
            int i11 = i8 + 7;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
            }
            if ((i & 4) != 0) {
                int i12 = IAuthTabCallbackStub + 77;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                this.connectionCacheMinute = 30;
            } else {
                this.connectionCacheMinute = i4;
            }
            if ((i & 8) != 0) {
                int i14 = IAuthTabCallbackStub + 83;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                this.isEnabled = true;
            } else {
                this.isEnabled = z;
            }
            if ((i & 16) != 0) {
                this.runnerCount = 4;
            } else {
                this.runnerCount = i5;
                int i16 = 2 % 2;
            }
            if ((i & 32) != 0) {
                this.deviceRetryDurationMinute = 5;
                int i17 = 2 % 2;
            } else {
                this.deviceRetryDurationMinute = i6;
            }
            if ((i & 64) == 0) {
                this.localCacheMinute = i7;
                return;
            }
            int i18 = onExtraCallback + 5;
            int i19 = i18 % 128;
            IAuthTabCallbackStub = i19;
            if (i18 % 2 == 0) {
                this.localCacheMinute = 49;
            } else {
                this.localCacheMinute = 30;
            }
            int i20 = i19 + 99;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        this.reconnectionIntervalMs = i3;
        int i22 = 2 % 2;
        if ((i & 4) != 0) {
        }
        if ((i & 8) != 0) {
        }
        if ((i & 16) != 0) {
        }
        if ((i & 32) != 0) {
        }
        if ((i & 64) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(ScannerConfig scannerConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallback(serialDescriptor, 0, scannerConfig.signalStrength);
        } else if (scannerConfig.signalStrength != -83) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = IAuthTabCallbackStub + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (scannerConfig.reconnectionIntervalMs != 1000) {
                vylVar.onExtraCallback(serialDescriptor, 1, scannerConfig.reconnectionIntervalMs);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || scannerConfig.connectionCacheMinute != 30) {
            vylVar.onExtraCallback(serialDescriptor, 2, scannerConfig.connectionCacheMinute);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !scannerConfig.isEnabled) {
            vylVar.onNavigationEvent(serialDescriptor, 3, scannerConfig.isEnabled);
            int i5 = onExtraCallback + 61;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 4)) || scannerConfig.runnerCount != 4) {
            vylVar.onExtraCallback(serialDescriptor, 4, scannerConfig.runnerCount);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 5) || scannerConfig.deviceRetryDurationMinute != 5) {
            vylVar.onExtraCallback(serialDescriptor, 5, scannerConfig.deviceRetryDurationMinute);
            int i7 = IAuthTabCallbackStub + 65;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 5;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || scannerConfig.localCacheMinute != 30) {
            vylVar.onExtraCallback(serialDescriptor, 6, scannerConfig.localCacheMinute);
        }
    }

    public ScannerConfig(int i, int i2, int i3, boolean z, int i4, int i5, int i6) {
        this.signalStrength = i;
        this.reconnectionIntervalMs = i2;
        this.connectionCacheMinute = i3;
        this.isEnabled = z;
        this.runnerCount = i4;
        this.deviceRetryDurationMinute = i5;
        this.localCacheMinute = i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScannerConfig(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i7 & 1) != 0 ? -83 : i;
        if ((i7 & 2) != 0) {
            int i8 = IAuthTabCallbackStub + 125;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i2 = 1000;
        }
        int i11 = i2;
        int i12 = 30;
        if ((i7 & 4) != 0) {
            int i13 = IAuthTabCallbackStub + 81;
            onExtraCallback = i13 % 128;
            i3 = i13 % 2 != 0 ? 51 : 30;
            int i14 = 2 % 2;
        }
        int i15 = i3;
        boolean z2 = (i7 & 8) != 0 ? true : z;
        if ((i7 & 16) != 0) {
            int i16 = onExtraCallback;
            int i17 = i16 + 125;
            IAuthTabCallbackStub = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i16 + 65;
            IAuthTabCallbackStub = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            i4 = 4;
        }
        int i22 = i4;
        if ((i7 & 32) != 0) {
            int i23 = 2 % 2;
            i5 = 5;
        }
        int i24 = i5;
        if ((i7 & 64) != 0) {
            int i25 = onExtraCallback + 123;
            IAuthTabCallbackStub = i25 % 128;
            int i26 = i25 % 2;
        } else {
            i12 = i6;
        }
        this(i, i11, i15, z2, i22, i24, i12);
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 31;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallbackWithResult[i >>> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.getMode(0) + 17, 10973 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myPid() >> 22)), 31 - TextUtils.indexOf("", ""), 20220 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                    Object[] objArr5 = {Integer.valueOf(onExtraCallbackWithResult[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 59696), 17 - (Process.myTid() >> 22), 11021 - AndroidCharacter.getMirror('0'), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 46134), 31 - KeyEvent.keyCodeFromString(""), 20220 - (ViewConfiguration.getPressedStateDuration() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        try {
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49122), Drawable.resolveOpacity(0, 0) + 44, Color.blue(0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 44, 1542 - AndroidCharacter.getMirror('0'), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i7 = $10 + 25;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = new char[]{60807, 28713, 54921, 13664, 39874, 63911, 23570, 41669, 331, 26420, 50590, 10359, 36571, 60666, 29443, 53759, 13395, 39620, 63657, 24322, 48607, 'V', 26162, 50307, 11114, 35293, 61356, 29206, 53409, 60920, 28778, 54938, 13675, 39887, 63917, 23566, 41704, 321, 26425, 50572, 10359, 36563, 60604, 29497, 53752, 13376, 39631, 63674, 24344, 48621, 'N', 26125, 50325, 11065, 37095, 3445, 43924, 18558, 59101, 33971, 8474, 57338, 31823, 6700, 47240, 21871, 62432, 37292, 3596, 44257, 18766, 59384, 34238, 8735, 49382, 32073, 6970, 47556, 60920, 28778, 54913, 13693, 39913, 63916, 23553, 41700, 328, 26431, 50588, 10275, 60920, 28778, 54938, 13691, 39874, 63916, 23557, 41716, 359, 26421, 50573, 10352, 36552, 60655, 60920, 28778, 54924, 13675, 39898, 63915, 23555, 41699, 374, 26431, 50572, 10348, 36549, 60566, 29445, 53732, 13397, 39646, 63649, 24321, 48610, 'o', 26153, 50312, 11121, 35278, 61373, 29251, 3088, 37250, 14188, 54409, 31271, 6219, 48612, 17197, 57517, 34513, 9336, 51603, 28441, 3411, 37622, 12299, 54696, 31527, 6429, 44433};
        IAuthTabCallback = -1620222833053896630L;
    }
}
