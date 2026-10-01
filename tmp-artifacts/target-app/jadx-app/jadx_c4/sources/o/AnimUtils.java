package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class AnimUtils {
    private static short[] onTransact;
    private final double IAuthTabCallback;
    private final double onExtraCallbackWithResult;
    private final double onWarmupCompleted;
    private static final byte[] $$a = {15, -57, -42, 5};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = -557557928;
    private static int onNavigationEvent = -1538795484;
    private static int asBinder = -468258918;
    private static byte[] asInterface = {96, -80, 90, -66, 76, -3, 118, 71, -79, -86, 103, -73, 73, -8, 85, 63, -18, 19, 19, -68, 26, 8, 8, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = (s2 * 3) + 1;
        int i6 = 3 - (s * 3);
        byte[] bArr = $$a;
        int i7 = (i * 2) + 115;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i6 += -i7;
            i3 = i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i3 + 1;
            i8 = i9;
            i7 = bArr[i9];
            i6 += -i7;
            i3 = i8;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i6;
            i6 = i7;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimUtils)) {
            return false;
        }
        AnimUtils animUtils = (AnimUtils) obj;
        if (Double.compare(this.IAuthTabCallback, animUtils.IAuthTabCallback) != 0) {
            int i3 = IAuthTabCallbackStub + 15;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.onWarmupCompleted, animUtils.onWarmupCompleted) != 0) {
            return false;
        }
        if (Double.compare(this.onExtraCallbackWithResult, animUtils.onExtraCallbackWithResult) == 0) {
            return true;
        }
        int i5 = IAuthTabCallbackStub + 113;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? ((Double.hashCode(this.IAuthTabCallback) >>> 71) + Double.hashCode(this.onWarmupCompleted)) / 13 : ((Double.hashCode(this.IAuthTabCallback) * 31) + Double.hashCode(this.onWarmupCompleted)) * 31) + Double.hashCode(this.onExtraCallbackWithResult);
        int i3 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        double d = this.IAuthTabCallback;
        double d2 = this.onWarmupCompleted;
        double d3 = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 67), (-2055442256) - TextUtils.indexOf("", "", 0, 0), (-1079064387) - ((byte) KeyEvent.getModifierMetaStateMask()), (-33) - ExpandableListView.getPackedPositionGroup(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(d);
        Object[] objArr2 = new Object[1];
        a((short) View.MeasureSpec.getMode(0), (byte) ((-88) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 2055442246, (-1095841638) - Color.rgb(0, 0, 0), (-38) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(d2);
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((-25) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) - 2055442241, View.resolveSize(0, 0) - 1079064422, (-37) - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(d3);
        Object[] objArr4 = new Object[1];
        a((short) TextUtils.getOffsetAfter("", 0), (byte) ((-73) - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 2055442235, TextUtils.indexOf((CharSequence) "", '0', 0) - 1079064424, (-42) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public AnimUtils(double d, double d2, double d3) {
        this.IAuthTabCallback = d;
        this.onWarmupCompleted = d2;
        this.onExtraCallbackWithResult = d3;
    }

    public final double IAuthTabCallback() {
        double d;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 55;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            d = this.IAuthTabCallback;
            int i4 = 20 / 0;
        } else {
            d = this.IAuthTabCallback;
        }
        int i5 = i2 + 115;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return d;
    }

    public final double onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        double d = this.onWarmupCompleted;
        int i5 = i3 + 51;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return d;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        double d = this.onExtraCallbackWithResult;
        int i5 = i3 + 11;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22439 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if ((i5 ^ 1) != 1) {
                byte[] bArr = asInterface;
                if (bArr != null) {
                    int i6 = $10 + 37;
                    int i7 = i6 % 128;
                    $11 = i7;
                    int i8 = i6 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = i7 + 67;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    for (int i11 = 0; i11 < length; i11++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - KeyEvent.getDeadChar(0, 0)), 55 - View.getDefaultSize(0, 0), Process.getGidForName("") + 2168, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $10 + 35;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = asInterface;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 43425), 42 - TextUtils.getOffsetAfter("", 0), 22439 - ExpandableListView.getPackedPositionGroup(0L), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (onTransact[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onNavigationEvent ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asBinder), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 85, ExpandableListView.getPackedPositionGroup(0L) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = asInterface;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i14 = $10 + 79;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i17 = $11 + 49;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                } else {
                    int i19 = $11 + 61;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onTransact;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = asInterface;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
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
}
