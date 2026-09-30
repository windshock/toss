package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getUnhandledOverridden {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ getUnhandledOverridden[] $VALUES;
    public static final getUnhandledOverridden CLIENT;
    public static final getUnhandledOverridden CONSUMER;
    private static int IAuthTabCallback = 1;
    public static final getUnhandledOverridden INTERNAL;
    public static final getUnhandledOverridden PRODUCER;
    public static final getUnhandledOverridden SERVER;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private static /* synthetic */ getUnhandledOverridden[] $values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getUnhandledOverridden[] getunhandledoverriddenArr = {INTERNAL, SERVER, CLIENT, PRODUCER, CONSUMER};
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getunhandledoverriddenArr;
    }

    private getUnhandledOverridden(String str, int i) {
    }

    public static getUnhandledOverridden valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getUnhandledOverridden getunhandledoverridden = (getUnhandledOverridden) Enum.valueOf(getUnhandledOverridden.class, str);
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return getunhandledoverridden;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getUnhandledOverridden[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getUnhandledOverridden[] getunhandledoverriddenArr = $VALUES;
        if (i3 != 0) {
            return (getUnhandledOverridden[]) getunhandledoverriddenArr.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 8, 0, 0}, false, new byte[]{1, 1, 0, 1, 1, 0, 1, 1}, objArr);
        INTERNAL = new getUnhandledOverridden(((String) objArr[0]).intern(), 0);
        SERVER = new getUnhandledOverridden("SERVER", 1);
        CLIENT = new getUnhandledOverridden("CLIENT", 2);
        PRODUCER = new getUnhandledOverridden("PRODUCER", 3);
        CONSUMER = new getUnhandledOverridden("CONSUMER", 4);
        $VALUES = $values();
        int i = onNavigationEvent + 85;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        char c = '0';
        if (cArr2 != null) {
            int i8 = $10 + 97;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $10 + 123;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0)), 35 - TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0), 14239 - View.combineMeasuredStates(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    i2 = 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.combineMeasuredStates(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 65, 16718 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 30, TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 49467), 70 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i14 = $10 + 91;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[3]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent /= 0;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{27242, 27141, 27167, 27138, 27141, 27166, 27145, 27144};
    }
}
