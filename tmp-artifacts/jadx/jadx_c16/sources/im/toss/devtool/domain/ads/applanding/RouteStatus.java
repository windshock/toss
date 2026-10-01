package im.toss.devtool.domain.ads.applanding;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RouteStatus {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RouteStatus[] $VALUES;
    public static final RouteStatus FAIL;
    public static final RouteStatus FALLBACK;
    private static char[] IAuthTabCallback = null;
    public static final RouteStatus PASS;
    public static final RouteStatus RUNNING;
    public static final RouteStatus SUCCESS;
    public static final RouteStatus WAITING;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final /* synthetic */ RouteStatus[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        RouteStatus[] routeStatusArr = {WAITING, RUNNING, SUCCESS, FAIL, PASS, FALLBACK};
        int i5 = i3 + 117;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return routeStatusArr;
    }

    public static EnumEntries<RouteStatus> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        EnumEntries<RouteStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }

    public static RouteStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RouteStatus routeStatus = (RouteStatus) Enum.valueOf(RouteStatus.class, str);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = onExtraCallbackWithResult + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return routeStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RouteStatus[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RouteStatus[] routeStatusArr = (RouteStatus[]) $VALUES.clone();
        int i4 = onExtraCallback + 25;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return routeStatusArr;
    }

    private RouteStatus(String str, int i) {
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new int[]{0, 7, 0, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 0}, objArr);
        WAITING = new RouteStatus(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a(new int[]{7, 7, 78, 1}, true, null, objArr2);
        RUNNING = new RouteStatus(((String) objArr2[0]).intern(), 1);
        Object[] objArr3 = new Object[1];
        a(new int[]{14, 7, 0, 2}, true, new byte[]{1, 0, 0, 0, 0, 0, 0}, objArr3);
        SUCCESS = new RouteStatus(((String) objArr3[0]).intern(), 2);
        Object[] objArr4 = new Object[1];
        a(new int[]{21, 4, 157, 4}, false, new byte[]{1, 1, 0, 1}, objArr4);
        FAIL = new RouteStatus(((String) objArr4[0]).intern(), 3);
        Object[] objArr5 = new Object[1];
        a(new int[]{25, 4, 0, 1}, false, new byte[]{1, 1, 1, 0}, objArr5);
        PASS = new RouteStatus(((String) objArr5[0]).intern(), 4);
        Object[] objArr6 = new Object[1];
        a(new int[]{29, 8, 22, 6}, true, new byte[]{1, 1, 0, 0, 1, 1, 1, 0}, objArr6);
        FALLBACK = new RouteStatus(((String) objArr6[0]).intern(), 5);
        RouteStatus[] routeStatusArr$values = $values();
        $VALUES = routeStatusArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(routeStatusArr$values);
        int i = onNavigationEvent + 73;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallback;
        if (cArr != null) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 35283), ExpandableListView.getPackedPositionGroup(0L) + 35, 14239 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 105;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - TextUtils.indexOf("", "", 0, 0)), 65 - (ViewConfiguration.getScrollBarSize() >> 8), 16717 - TextUtils.indexOf((CharSequence) "", '0', 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, 17657 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49467), 70 - (ViewConfiguration.getLongPressTimeout() >> 16), 12486 - KeyEvent.normalizeMetaState(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i13 = $11 + 123;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{27245, 27140, 27141, 27136, 27136, 27147, 27138, 27374, 27355, 27346, 27353, 27346, 27346, 27373, 27236, 27162, 27165, 27165, 27138, 27146, 27149, 27199, 27310, 27308, 27305, 27239, 27167, 27142, 27140, 27237, 27161, 27155, 27180, 27154, 27159, 27152, 27155};
    }
}
