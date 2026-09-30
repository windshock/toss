package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import org.apache.commons.validator.routines.RegexValidator;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TopLayoutDislike24 implements Serializable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static final TopLayoutDislike24 onWarmupCompleted;
    private static final long serialVersionUID = -919201640201914789L;
    private final RegexValidator ipv4Validator = new RegexValidator("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");

    static {
        onWarmupCompleted();
        onWarmupCompleted = new TopLayoutDislike24();
        int i = onExtraCallbackWithResult + 67;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 87;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 84, TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 18 - ExpandableListView.getPackedPositionChild(0L), 8807 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static TopLayoutDislike24 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 43;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        TopLayoutDislike24 topLayoutDislike24 = onWarmupCompleted;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return topLayoutDislike24;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean IAuthTabCallback(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (onWarmupCompleted(str)) {
            return true;
        }
        int i4 = asInterface + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(str);
        }
        onExtraCallbackWithResult(str);
        throw null;
    }

    public boolean onWarmupCompleted(String str) throws Throwable {
        int i = 2 % 2;
        String[] strArrOnExtraCallbackWithResult = this.ipv4Validator.onExtraCallbackWithResult(str);
        if (strArrOnExtraCallbackWithResult == null) {
            int i2 = asInterface + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int length = strArrOnExtraCallbackWithResult.length;
        int i4 = 0;
        while (i4 < length) {
            String str2 = strArrOnExtraCallbackWithResult[i4];
            if (str2 != null) {
                int i5 = asInterface + 47;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                if (str2.length() != 0) {
                    try {
                        if (Integer.parseInt(str2) > 255) {
                            int i7 = onExtraCallback + 49;
                            asInterface = i7 % 128;
                            int i8 = i7 % 2;
                            return false;
                        }
                        if (str2.length() > 1) {
                            Object[] objArr = new Object[1];
                            a(new char[]{63619, 56005, 21103, 27881, 63667}, 1 - KeyEvent.normalizeMetaState(0), objArr);
                            if (str2.startsWith(((String) objArr[0]).intern())) {
                                int i9 = asInterface + 49;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return false;
                            }
                        }
                        i4++;
                        int i11 = onExtraCallback + 5;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r1 <= 128) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r12.endsWith("::") == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult(String str) throws Throwable {
        int i;
        int i2 = 2 % 2;
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length > 2) {
            int i3 = asInterface + 7;
            onExtraCallback = i3 % 128;
            return i3 % 2 != 0;
        }
        if (strArrSplit.length == 2) {
            if (strArrSplit[1].matches("\\d{1,3}")) {
                int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = Integer.parseInt(strArrSplit[1]);
                if (i6 >= 0) {
                }
            }
            return false;
        }
        String[] strArrSplit2 = strArrSplit[0].split("%", -1);
        if (strArrSplit2.length > 2) {
            return false;
        }
        if (strArrSplit2.length == 2 && !strArrSplit2[1].matches("[^\\s/%]+")) {
            return false;
        }
        String str2 = strArrSplit2[0];
        boolean zContains = str2.contains("::");
        if (zContains && str2.indexOf("::") != str2.lastIndexOf("::")) {
            return false;
        }
        if (str2.startsWith(":")) {
            int i7 = onExtraCallback + 75;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (str2.startsWith("::")) {
                if (str2.endsWith(":")) {
                    int i9 = onExtraCallback + 19;
                    asInterface = i9 % 128;
                    int i10 = i9 % 2;
                }
                String[] strArrSplit3 = str2.split(":");
                if (zContains) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit3));
                    if (str2.endsWith("::")) {
                        arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else if (str2.startsWith("::") && !arrayList.isEmpty()) {
                        arrayList.remove(0);
                    }
                    strArrSplit3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArrSplit3.length > 8) {
                    return false;
                }
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < strArrSplit3.length; i13++) {
                    String str3 = strArrSplit3[i13];
                    if (str3.length() == 0) {
                        int i14 = asInterface;
                        int i15 = i14 + 45;
                        onExtraCallback = i15 % 128;
                        if (i15 % 2 != 0) {
                            i12 += 126;
                            if (i12 > 0) {
                                int i16 = i14 + 81;
                                onExtraCallback = i16 % 128;
                                int i17 = i16 % 2;
                                return false;
                            }
                        } else {
                            i12++;
                            if (i12 > 1) {
                                int i162 = i14 + 81;
                                onExtraCallback = i162 % 128;
                                int i172 = i162 % 2;
                                return false;
                            }
                        }
                    } else {
                        if (i13 == strArrSplit3.length - 1) {
                            int i18 = onExtraCallback + 9;
                            asInterface = i18 % 128;
                            int i19 = i18 % 2;
                            if (!(!str3.contains("."))) {
                                int i20 = onExtraCallback + 37;
                                asInterface = i20 % 128;
                                if (i20 % 2 == 0) {
                                    boolean zOnWarmupCompleted = onWarmupCompleted(str3);
                                    int i21 = 71 / 0;
                                    if (!zOnWarmupCompleted) {
                                        return false;
                                    }
                                    i11 += 2;
                                    i12 = 0;
                                } else {
                                    if (!onWarmupCompleted(str3)) {
                                        return false;
                                    }
                                    i11 += 2;
                                    i12 = 0;
                                }
                            }
                        }
                        if (str3.length() > 4) {
                            return false;
                        }
                        try {
                            i = Integer.parseInt(str3, 16);
                        } catch (NumberFormatException unused) {
                        }
                        if (i < 0 || i > 65535) {
                            return false;
                        }
                        i12 = 0;
                    }
                    i11++;
                }
                if (i11 > 8 || (i11 < 8 && !zContains)) {
                    return false;
                }
                int i22 = asInterface + 5;
                onExtraCallback = i22 % 128;
                int i23 = i22 % 2;
                return true;
            }
        }
        int i24 = asInterface + 53;
        onExtraCallback = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 25 / 0;
        }
        return false;
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = -4246659692184729437L;
    }
}
