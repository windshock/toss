package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setOpenFds {
    private static int IAuthTabCallback = 0;
    private static short[] IAuthTabCallbackDefault = null;
    private static int IAuthTabCallbackStub = 0;
    private static byte[] asBinder = null;
    private static final ThreadLocal<DecimalFormat>[] onExtraCallback;
    private static int onExtraCallbackWithResult = 0;
    private static final boolean onNavigationEvent = false;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {115, 30, 119, 102};
    private static final int $$b = Imgproc.COLOR_YUV2RGB_YVYU;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int access100 = 1;
    private static int asInterface = 0;

    private static String $$c(byte b, int i, short s) {
        int i2 = (b * 4) + 115;
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = s * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i3 + (-i5);
            i3 = i3;
            i2 = i7;
        }
        while (true) {
            i6++;
            int i8 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 = i8;
            i2 += -bArr[i8];
        }
    }

    public static final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallbackStub = 1;
        onWarmupCompleted();
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        int i = asInterface + 49;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 % 2;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            threadLocalArr[i3] = new ThreadLocal<>();
        }
        onExtraCallback = threadLocalArr;
        int i4 = asInterface + 3;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final DecimalFormat onExtraCallback(int i) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        a((short) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0')), (byte) TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET), View.combineMeasuredStates(0, 0) + 1431162982, View.combineMeasuredStates(0, 0) + 832773689, (-39) - Color.green(0), objArr);
        DecimalFormat decimalFormat = new DecimalFormat(((String) objArr[0]).intern());
        if (i > 0) {
            int i3 = access100 + Imgproc.COLOR_YUV2RGBA_YVYU;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            decimalFormat.setMinimumFractionDigits(i);
            int i5 = access100 + 99;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String IAuthTabCallback(double d, int i) throws Throwable {
        DecimalFormat decimalFormatOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        ThreadLocal<DecimalFormat>[] threadLocalArr = onExtraCallback;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormatOnExtraCallback2 = threadLocal.get();
            if (decimalFormatOnExtraCallback2 == null) {
                decimalFormatOnExtraCallback2 = onExtraCallback(i);
                threadLocal.set(decimalFormatOnExtraCallback2);
                int i5 = onTransact + 67;
                access100 = i5 % 128;
                int i6 = i5 % 2;
            }
            decimalFormatOnExtraCallback = decimalFormatOnExtraCallback2;
        } else {
            decimalFormatOnExtraCallback = onExtraCallback(i);
        }
        String str = decimalFormatOnExtraCallback.format(d);
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5;
        int length2;
        byte[] bArr2;
        int i6;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43424), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i8 = iIntValue == -1 ? 1 : 0;
            if (i8 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr3 = asBinder;
                if (bArr3 != null) {
                    int i9 = $11 + 93;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 1;
                    } else {
                        length2 = bArr3.length;
                        bArr2 = new byte[length2];
                        i6 = 0;
                    }
                    while (i6 < length2) {
                        Object[] objArr3 = {Integer.valueOf(bArr3[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 12843), View.MeasureSpec.getMode(0) + 55, (ViewConfiguration.getTouchSlop() >> 8) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        int i10 = $10 + 67;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    bArr3 = bArr2;
                }
                if (bArr3 != null) {
                    int i12 = $11 + 53;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        byte[] bArr4 = asBinder;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43423), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, 22438 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] & (-4629411779493505016L))) << ((int) (onWarmupCompleted * (-4629411779493505016L)));
                    } else {
                        byte[] bArr5 = asBinder;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), 42 - Color.blue(0), 22439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr5[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + i8;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), 86 - KeyEvent.getDeadChar(0, 0), 9567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr6 = asBinder;
                if (bArr6 != null) {
                    int i13 = $10 + 83;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        bArr[i4] = (byte) (bArr6[i4] ^ (-4629411779493505016L));
                        i4++;
                    }
                    bArr6 = bArr;
                }
                boolean z = bArr6 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        byte[] bArr7 = asBinder;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackDefault;
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

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 251000722;
        onWarmupCompleted = -1538795474;
        IAuthTabCallback = 1780169215;
        asBinder = new byte[]{-45};
    }
}
