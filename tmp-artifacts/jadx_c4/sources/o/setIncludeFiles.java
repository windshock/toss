package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class setIncludeFiles<T> implements ReadOnlyProperty<Object, T> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private static char[] onWarmupCompleted = {27257, 27168, 27168, 27139, 27139, 27175, 27176, 27178, 27172, 27168, 27169, 27171, 27175, 27173, 27172, 27170, 27172, 27168, 27143, 27144, 27199, 27194, 27197, 27140, 27151, 27181, 27148};
    private T IAuthTabCallback;
    private final long onExtraCallback;
    private long onExtraCallbackWithResult;
    private final Function0<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public setIncludeFiles(long j, @NotNull Function0<? extends T> function0) throws Throwable {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallback = j;
        this.onNavigationEvent = function0;
        if (j < 0) {
            Object[] objArr = new Object[1];
            a(new int[]{0, 27, 0, 12}, false, new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1}, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern());
        }
        int i = onTransact + 81;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public T getValue(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        T t;
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            t = this.IAuthTabCallback;
            if (t == null || jElapsedRealtime - this.onExtraCallbackWithResult >= this.onExtraCallback) {
                t = (T) this.onNavigationEvent.invoke();
                this.IAuthTabCallback = t;
                this.onExtraCallbackWithResult = jElapsedRealtime;
            }
        }
        return t;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        long j = 0;
        if (cArr2 != null) {
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                    j = 0;
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
            int i9 = $10 + 81;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 10935), 65 - Color.red(0), View.combineMeasuredStates(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, 17657 - View.resolveSizeAndState(0, 0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - View.getDefaultSize(0, 0)), 70 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i13 = $10 + 111;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
            int i16 = $11 + 121;
            $10 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (z) {
            int i18 = $10 + 17;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i20 = $11 + 11;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 << trackGroupExternalSyntheticLambda0.onNavigationEvent) >>> 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
