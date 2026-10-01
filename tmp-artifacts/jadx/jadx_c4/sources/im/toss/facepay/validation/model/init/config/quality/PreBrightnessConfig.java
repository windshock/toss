package im.toss.facepay.validation.model.init.config.quality;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PreBrightnessConfig {
    public static final Companion Companion;
    private static byte[] IAuthTabCallback;
    private static int asInterface;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static short[] onNavigationEvent;
    private static int onWarmupCompleted;
    private final double areaRadiusRatio;
    private final boolean isEnabled;
    private final double tooBrightThreshold;
    private final double tooDarkThreshold;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackStub = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = (s * 2) + 115;
        int i4 = i * 3;
        int i5 = (b * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            int i9 = i5;
            int i10 = i9 + 1;
            int i11 = (-i5) + i7;
            i2 = i8;
            i3 = i11;
            i5 = i10;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i3;
            i9 = i5;
            i5 = bArr[i5];
            i8 = i2 + 1;
            i7 = i12;
            int i102 = i9 + 1;
            int i112 = (-i5) + i7;
            i2 = i8;
            i3 = i112;
            i5 = i102;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    static {
        asInterface = 1;
        onNavigationEvent();
        Companion = new Companion(null);
        int i = IAuthTabCallbackStub + 35;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public PreBrightnessConfig() {
        this(0.0d, 0.0d, 0.0d, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 47;
        im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r8 = (im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (java.lang.Double.compare(r7.tooDarkThreshold, r8.tooDarkThreshold) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (java.lang.Double.compare(r7.tooBrightThreshold, r8.tooBrightThreshold) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r8 = im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig.onTransact + 109;
        im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig.asBinder = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (java.lang.Double.compare(r7.areaRadiusRatio, r8.areaRadiusRatio) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r8 = im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig.asBinder + 75;
        im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig.onTransact = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if ((r8 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r7.isEnabled == r8.isEnabled) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((((Double.hashCode(this.tooDarkThreshold) >> 35) % Double.hashCode(this.tooBrightThreshold)) << 94) << Double.hashCode(this.areaRadiusRatio)) >>> 11) * Boolean.hashCode(this.isEnabled) : (((((Double.hashCode(this.tooDarkThreshold) * 31) + Double.hashCode(this.tooBrightThreshold)) * 31) + Double.hashCode(this.areaRadiusRatio)) * 31) + Boolean.hashCode(this.isEnabled);
        int i3 = onTransact + 1;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        double d = this.tooDarkThreshold;
        double d2 = this.tooBrightThreshold;
        double d3 = this.areaRadiusRatio;
        boolean z = this.isEnabled;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) (Process.myPid() >> 22), 1762945456 - KeyEvent.normalizeMetaState(0), 294201752 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-8) - Drawable.resolveOpacity(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a((short) Color.red(0), (byte) Color.blue(0), 1762945493 - View.combineMeasuredStates(0, 0), 294201715 - Color.alpha(0), (-9) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a((short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (byte) (Process.myPid() >> 22), Color.rgb(0, 0, 0) + 1779722730, 294201714 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-8) - (ViewConfiguration.getTouchSlop() >> 8), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(d3);
        Object[] objArr4 = new Object[1];
        a((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (Process.myTid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 1762945532, KeyEvent.keyCodeFromString("") + 294201715, (-9) - TextUtils.lastIndexOf("", '0', 0), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(z);
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) Color.argb(0, 0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1762945544, 294201712 + (ViewConfiguration.getScrollDefaultDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) - 8, objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 47;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return string;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PreBrightnessConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            PreBrightnessConfig$$serializer preBrightnessConfig$$serializer = PreBrightnessConfig$$serializer.INSTANCE;
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return preBrightnessConfig$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ PreBrightnessConfig(int i, double d, double d2, double d3, boolean z, okycx okycxVar) {
        this.tooDarkThreshold = (i & 1) == 0 ? 0.1d : d;
        if ((i & 2) == 0) {
            int i2 = asBinder + 37;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.tooBrightThreshold = 0.75d;
        } else {
            this.tooBrightThreshold = d2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.areaRadiusRatio = 0.35d;
            int i5 = asBinder + 73;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            this.areaRadiusRatio = d3;
        }
        if ((i & 8) != 0) {
            this.isEnabled = z;
            return;
        }
        int i8 = onTransact + 55;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        this.isEnabled = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(PreBrightnessConfig preBrightnessConfig, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asBinder = i2 % 128;
        if (i2 % 2 == 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, preBrightnessConfig.tooDarkThreshold);
        } else if (Double.compare(preBrightnessConfig.tooDarkThreshold, 0.1d) != 0) {
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i3 = onTransact + 51;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 48 / 0;
                if (Double.compare(preBrightnessConfig.tooBrightThreshold, 0.75d) != 0) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, preBrightnessConfig.tooBrightThreshold);
                    int i5 = onTransact + 101;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                }
            } else if (Double.compare(preBrightnessConfig.tooBrightThreshold, 0.75d) != 0) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || Double.compare(preBrightnessConfig.areaRadiusRatio, 0.35d) != 0) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, preBrightnessConfig.areaRadiusRatio);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i7 = asBinder + 7;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            if (preBrightnessConfig.isEnabled) {
                return;
            }
        }
        vylVar.onNavigationEvent(serialDescriptor, 3, preBrightnessConfig.isEnabled);
    }

    public PreBrightnessConfig(double d, double d2, double d3, boolean z) {
        this.tooDarkThreshold = d;
        this.tooBrightThreshold = d2;
        this.areaRadiusRatio = d3;
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreBrightnessConfig(double d, double d2, double d3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        double d4;
        double d5;
        boolean z2;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            d4 = 0.1d;
        } else {
            d4 = d;
        }
        if ((i & 2) != 0) {
            int i3 = 2 % 2;
            d5 = 0.75d;
        } else {
            d5 = d2;
        }
        double d6 = (i & 4) != 0 ? 0.35d : d3;
        if ((i & 8) != 0) {
            int i4 = asBinder;
            int i5 = i4 + 19;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 39;
            onTransact = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            z2 = true;
        } else {
            z2 = z;
        }
        this(d4, d5, d6, z2);
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tooDarkThreshold;
        }
        throw null;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        double d = this.tooBrightThreshold;
        int i4 = i2 + 39;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final double IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 97;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        double d = this.areaRadiusRatio;
        int i5 = i2 + 107;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return d;
        }
        throw null;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isEnabled;
        }
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 107;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr2 = IAuthTabCallback;
                if (bArr2 != null) {
                    int i9 = $10 + 13;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.keyCodeFromString("")), 55 - Color.blue(0), 2168 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i5] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i5++;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getPressedStateDuration() >> 16)), 42 - View.resolveSize(0, 0), 22439 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onWarmupCompleted), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 86 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallback;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        int i11 = $11 + 45;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        bArr5[i10] = (byte) (bArr4[i10] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 91;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    int i15 = $10 + 63;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 850153048;
        onExtraCallback = -1538795505;
        onWarmupCompleted = 1244729009;
        IAuthTabCallback = new byte[]{22, -47, -16, -11, 15, -3, 6, -5, 2, 28, -31, -15, 25, 21, -35, 8, -13, 68, -55, -10, 11, -16, -9, 36, -40, 8, 6, -1, -14, 4, 9, -10, -1, 56, -43, -5, 42, 6, -47, -16, -11, 15, -3, 6, -5, 2, 28, -24, 4, 9, -10, -1, 56, -37, 8, -13, 92, -4, 3, -58, 14, -3, 27, 7, -41, -10, 4, 13, 11, 7, -7, -12, -5, 25, 73, -4, 13, -47, -9, -15, 2, 9, -5, 33, -38, 2, 65, -4, -14};
    }
}
