package im.toss.facepay.validation.model.init.config.service;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SystemConfig {
    public static final Companion Companion;
    private static short[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static byte[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String scheduledRestartTime;
    private static final byte[] $$a = {51, -39, 98, -44};
    private static final int $$b = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallbackStub = 0;

    private static String $$c(byte b, byte b2, short s) {
        byte[] bArr = $$a;
        int i = 3 - (b * 4);
        int i2 = s * 2;
        int i3 = 115 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i++;
            i3 += bArr[i];
        }
    }

    static {
        IAuthTabCallbackDefault = 1;
        onNavigationEvent();
        Companion = new Companion(null);
        int i = IAuthTabCallbackStub + 31;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SystemConfig() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.facepay.validation.model.init.config.service.SystemConfig) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 101;
        im.toss.facepay.validation.model.init.config.service.SystemConfig.asBinder = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.scheduledRestartTime, ((im.toss.facepay.validation.model.init.config.service.SystemConfig) r6).scheduledRestartTime) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = im.toss.facepay.validation.model.init.config.service.SystemConfig.asBinder + 49;
        r1 = r6 % 128;
        im.toss.facepay.validation.model.init.config.service.SystemConfig.onTransact = r1;
        r6 = r6 % 2;
        r1 = r1 + 109;
        im.toss.facepay.validation.model.init.config.service.SystemConfig.asBinder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r6 = im.toss.facepay.validation.model.init.config.service.SystemConfig.onTransact + 81;
        im.toss.facepay.validation.model.init.config.service.SystemConfig.asBinder = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if ((r6 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            int i4 = 11 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.scheduledRestartTime.hashCode();
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.scheduledRestartTime;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (byte) KeyEvent.normalizeMetaState(0), 1568758628 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') - 173374817, (-58) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getTrimmedLength(""), (byte) Color.green(0), 1568758661 - TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 173374861, (-57) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SystemConfig> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            SystemConfig$$serializer systemConfig$$serializer = SystemConfig$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 29;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return systemConfig$$serializer;
        }
    }

    public /* synthetic */ SystemConfig(int i, String str, okycx okycxVar) throws Throwable {
        if ((i & 1) != 0) {
            this.scheduledRestartTime = str;
            int i2 = onTransact + 27;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1568758621 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-173374854) + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) - 57, objArr);
        this.scheduledRestartTime = ((String) objArr[0]).intern();
        int i4 = onTransact + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(SystemConfig systemConfig, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallback(serialDescriptor, 0, systemConfig.scheduledRestartTime);
        } else {
            int i2 = onTransact + 93;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            String str = systemConfig.scheduledRestartTime;
            Object[] objArr = new Object[1];
            a((short) View.MeasureSpec.getSize(0), (byte) ((Process.getThreadPriority(0) + 20) >> 6), 1568758620 - (ViewConfiguration.getTouchSlop() >> 8), (-173374852) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-57) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            if (!Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
            }
        }
        int i4 = onTransact + 49;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public SystemConfig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.scheduledRestartTime = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SystemConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i & 1) != 0) {
            int i2 = asBinder + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) KeyEvent.keyCodeFromString(""), (byte) View.resolveSize(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1568758620, (ViewConfiguration.getScrollDefaultDelay() >> 16) - 173374853, TextUtils.indexOf("", "", 0) - 57, objArr);
            str = ((String) objArr[0]).intern();
            int i4 = asBinder + 61;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[PHI: r4
      0x008c: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v21 byte[]) binds: [B:19:0x008a, B:16:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetBefore("", 0) + 42, KeyEvent.keyCodeFromString("") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $10 + 35;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i9 = $11 + 43;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    bArr2 = onExtraCallback;
                    int i10 = 3 / 0;
                    if (bArr2 != null) {
                        int length2 = bArr2.length;
                        byte[] bArr3 = new byte[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i11])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), 55 - (ViewConfiguration.getTouchSlop() >> 8), 2166 - TextUtils.indexOf((CharSequence) "", '0', 0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr3[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 == null) {
                        byte[] bArr4 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 43425), TextUtils.indexOf("", "", 0) + 42, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onWarmupCompleted ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    }
                } else {
                    bArr2 = onExtraCallback;
                    if (bArr2 != null) {
                    }
                    if (bArr2 == null) {
                    }
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onWarmupCompleted ^ j)) + i4;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85, (-16767649) - Color.rgb(0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int i12 = $11 + 119;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                        i5++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i13 = $10 + 119;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i15 = $11 + 97;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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
        onWarmupCompleted = 104430764;
        onExtraCallbackWithResult = -1538795472;
        onNavigationEvent = -1374509635;
        onExtraCallback = new byte[]{-40, 8, -2, 2, 8, -2, 14, 12, -30, -48, -16, 12, 29, -24, 10, 25, -27, 9, 6, 27, -26, -9, -15, -1, 25, -9, -11, 13, -8, 67, -55, -10, 11, -16, -9, 36, -34, 0, -7, 9, -14, 46, -63};
    }
}
