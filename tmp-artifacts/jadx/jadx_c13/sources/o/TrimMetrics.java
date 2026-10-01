package o;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TrimMetrics {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallbackDefault = {27351, 27490, 27490, 27488};
    private static int asInterface = 1;
    private static int onTransact;

    @Nullable
    private String IAuthTabCallback;

    @Nullable
    private String IAuthTabCallbackStub;

    @Nullable
    private getDataTrimmed onExtraCallback;

    @Nullable
    private String onExtraCallbackWithResult;

    @Nullable
    private String onNavigationEvent;

    @Nullable
    private String onWarmupCompleted;

    TrimMetrics() {
    }

    public TrimMetrics IAuthTabCallback(getDataTrimmed getdatatrimmed) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(getdatatrimmed, "instrumentType");
        this.onExtraCallback = getdatatrimmed;
        int i4 = onTransact + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public TrimMetrics onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 197, 0}, false, new byte[]{1, 1, 0, 0}, objArr);
        Objects.requireNonNull(str, ((String) objArr[0]).intern());
        this.onNavigationEvent = str;
        int i4 = asInterface + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public TrimMetrics IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Objects.requireNonNull(str, "unit");
            this.onExtraCallbackWithResult = str;
            int i3 = asInterface + 87;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }
        Objects.requireNonNull(str, "unit");
        this.onExtraCallbackWithResult = str;
        obj.hashCode();
        throw null;
    }

    public TrimMetrics onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(str, "meterName");
        this.onWarmupCompleted = str;
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return this;
    }

    public TrimMetrics onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(str, "meterVersion");
            this.IAuthTabCallbackStub = str;
            int i3 = 9 / 0;
        } else {
            Objects.requireNonNull(str, "meterVersion");
            this.IAuthTabCallbackStub = str;
        }
        int i4 = onTransact + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public TrimMetrics onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Objects.requireNonNull(str, "meterSchemaUrl");
        this.IAuthTabCallback = str;
        int i4 = asInterface + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public TaskType onExtraCallbackWithResult() {
        int i = 2 % 2;
        boolean z = true;
        if (this.onExtraCallback == null) {
            int i2 = asInterface + 79;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.onNavigationEvent == null && this.onExtraCallbackWithResult == null) {
                int i4 = i3 + 1;
                int i5 = i4 % 128;
                asInterface = i5;
                int i6 = i4 % 2;
                if (this.onWarmupCompleted == null) {
                    int i7 = i5 + Imgproc.COLOR_YUV2RGBA_YVYU;
                    int i8 = i7 % 128;
                    onTransact = i8;
                    int i9 = i7 % 2;
                    if (this.IAuthTabCallbackStub == null) {
                        int i10 = i8 + 49;
                        asInterface = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (this.IAuthTabCallback == null) {
                            z = false;
                        }
                    }
                }
            }
        }
        getUnhandledExceptions.onExtraCallbackWithResult(z, "Instrument selector must contain selection criteria");
        return TaskType.onExtraCallbackWithResult(this.onExtraCallback, this.onNavigationEvent, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.IAuthTabCallbackStub, this.IAuthTabCallback);
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IAuthTabCallbackDefault;
        char c = '0';
        if (cArr != null) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 35283), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c) + 36, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 9;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10934), View.MeasureSpec.makeMeasureSpec(0, 0) + 65, ((Process.getThreadPriority(0) + 20) >> 6) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i13 = $10 + 101;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 29 - View.resolveSizeAndState(0, 0, 0), 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i16 = $10 + 79;
                        $11 = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 2 / 3;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i18 = $11 + 67;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 * i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i19 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i19, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i19);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i20 = $10 + 3;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i22 = $11 + 67;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] >> iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent >>> 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
