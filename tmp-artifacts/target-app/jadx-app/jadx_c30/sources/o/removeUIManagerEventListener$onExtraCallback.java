package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISO7816;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class removeUIManagerEventListener$onExtraCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] onExtraCallbackWithResult = {27141, 27365, 27380, 27378, 27273, 27272, 27274, 27278, 27376, 27278, 27388, 27363, 27376, 27272, 27276, 27276, 27374, 27350, 27381, 27380, 27378, 27273, 27272, 27274, 27376, 27384, 27362, 27364, 27377, 27274, 27377, 27380, 27386, 27372, 27216, 27158, 27196, 27173, 27178, 27180, 27181, 27176, 27146, 27240, 27157};
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> IAuthTabCallback;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeUIManagerEventListener$onExtraCallback)) {
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        removeUIManagerEventListener$onExtraCallback removeuimanagereventlistener_onextracallback = (removeUIManagerEventListener$onExtraCallback) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, removeuimanagereventlistener_onextracallback.onExtraCallback)) {
            int i4 = onWarmupCompleted + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallback, removeuimanagereventlistener_onextracallback.IAuthTabCallback)) {
            return true;
        }
        int i6 = onNavigationEvent + 89;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        Map<String, String> map;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.onExtraCallback.hashCode() % 61;
            map = this.IAuthTabCallback;
        } else {
            iHashCode = this.onExtraCallback.hashCode() * 31;
            map = this.IAuthTabCallback;
        }
        int iHashCode2 = iHashCode + map.hashCode();
        int i3 = onNavigationEvent + 19;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.onExtraCallback;
        Map<String, String> map = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 34, 82, 0}, false, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{34, 10, 0, 0}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 1, 0, 0}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(map);
        Object[] objArr3 = new Object[1];
        a(new int[]{44, 1, ISO7816.TAG_SM_CRYPTOGRAPHIC_CHECKSUM, 0}, false, new byte[]{1}, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public removeUIManagerEventListener$onExtraCallback(@NotNull String str, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.onExtraCallback = str;
        this.IAuthTabCallback = map;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int i8 = $10 + 77;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 35283), (ViewConfiguration.getTapTimeout() >> 16) + 35, 14239 - (ViewConfiguration.getPressedStateDuration() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Gravity.getAbsoluteGravity(0, 0)), ImageFormat.getBitsPerPixel(0) + 66, 16718 - View.resolveSize(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 29 - Color.argb(0, 0, 0, 0), 17657 - View.getDefaultSize(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0)), 70 - ExpandableListView.getPackedPositionGroup(0L), 12486 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1993337549, false, "w", new Class[]{Object.class, Object.class});
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
            int i14 = $11 + 123;
            $10 = i14 % 128;
            i = 2;
            int i15 = i14 % 2;
        } else {
            i = 2;
        }
        if (z) {
            int i16 = $10 + 75;
            $11 = i16 % 128;
            int i17 = i16 % i;
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
                int i18 = $11 + 43;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] / iArr[5]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent - 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
