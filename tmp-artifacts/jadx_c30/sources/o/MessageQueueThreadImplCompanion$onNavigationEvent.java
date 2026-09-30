package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class MessageQueueThreadImplCompanion$onNavigationEvent extends MessageQueueThreadImplCompanion {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static char[] onExtraCallbackWithResult = {27239, 27166, 27145, 27143, 27143, 27142, 27161, 27167, 27144, 27140, 27144, 27141, 27164, 27141, 27191, 27466, 27477, 27482, 27457, 27485, 27457, 27469, 27471, 27484, 27484, 27486, 27479, 27320, 27320, 27482, 27458, 27485, 27476, 27481, 27312, 27226};
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageQueueThreadImplCompanion$onNavigationEvent)) {
            int i4 = i3 + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, ((MessageQueueThreadImplCompanion$onNavigationEvent) obj).onWarmupCompleted)) {
            return true;
        }
        int i6 = onExtraCallback + 75;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onWarmupCompleted.hashCode();
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.onWarmupCompleted;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{14, 21, 169, 0}, false, new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{35, 1, 0, 1}, false, new byte[]{1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageQueueThreadImplCompanion$onNavigationEvent(@NotNull String str) throws Throwable {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Object[] objArr = new Object[1];
        a(new int[]{0, 14, 0, 0}, true, new byte[]{1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}, objArr);
        super(((String) objArr[0]).intern(), str, (DefaultConstructorMarker) null);
        this.onWarmupCompleted = str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int i7 = $10 + 3;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - ((Process.getThreadPriority(0) + 20) >> 6)), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.red(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 10935), 65 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0), ExpandableListView.getPackedPositionChild(0L) + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.blue(0) + 29, TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 49467), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 69, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            int i11 = $11 + 29;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i13 = $10 + 47;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i15 = $10 + 19;
                $11 = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
