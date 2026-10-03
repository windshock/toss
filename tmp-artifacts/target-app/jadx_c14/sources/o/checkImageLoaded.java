package o;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class checkImageLoaded {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ checkImageLoaded[] $VALUES;
    public static final checkImageLoaded CROSS_REGION_SIGN_UP;
    public static final checkImageLoaded CROSS_REGION_SIGN_UP_WITH_RESET_PASSWORD;
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback;
    public static final checkImageLoaded SIGN_IN;
    public static final checkImageLoaded SIGN_IN_WITH_RESET_PASSWORD;
    public static final checkImageLoaded SIGN_UP;
    private static long onExtraCallback;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {93, 49, 76, -114};
    private static final int $$b = 129;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 97 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = o.checkImageLoaded.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.checkImageLoaded.$$c(short, byte, int):java.lang.String");
    }

    private static final /* synthetic */ checkImageLoaded[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        checkImageLoaded[] checkimageloadedArr = {SIGN_IN, SIGN_IN_WITH_RESET_PASSWORD, SIGN_UP, CROSS_REGION_SIGN_UP, CROSS_REGION_SIGN_UP_WITH_RESET_PASSWORD};
        int i5 = i3 + 39;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return checkimageloadedArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<checkImageLoaded> getEntries() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EnumEntries<checkImageLoaded> enumEntries = $ENTRIES;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }

    public static checkImageLoaded valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        checkImageLoaded checkimageloaded = (checkImageLoaded) Enum.valueOf(checkImageLoaded.class, str);
        int i4 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return checkimageloaded;
        }
        throw null;
    }

    public static checkImageLoaded[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        checkImageLoaded[] checkimageloadedArr = $VALUES;
        if (i3 == 0) {
            return (checkImageLoaded[]) checkimageloadedArr.clone();
        }
        throw null;
    }

    private checkImageLoaded(String str, int i) {
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        SIGN_IN = new checkImageLoaded("SIGN_IN", 0);
        SIGN_IN_WITH_RESET_PASSWORD = new checkImageLoaded("SIGN_IN_WITH_RESET_PASSWORD", 1);
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, 6 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 46746), objArr);
        SIGN_UP = new checkImageLoaded(((String) objArr[0]).intern(), 2);
        CROSS_REGION_SIGN_UP = new checkImageLoaded("CROSS_REGION_SIGN_UP", 3);
        CROSS_REGION_SIGN_UP_WITH_RESET_PASSWORD = new checkImageLoaded("CROSS_REGION_SIGN_UP_WITH_RESET_PASSWORD", 4);
        checkImageLoaded[] checkimageloadedArr$values = $values();
        $VALUES = checkimageloadedArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(checkimageloadedArr$values);
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 125;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final checkImageLoaded onExtraCallbackWithResult(@Nullable String str) {
            Object next;
            Iterator it = checkImageLoaded.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((checkImageLoaded) next).name(), str)) {
                    break;
                }
            }
            return (checkImageLoaded) next;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 93;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 59697), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), TextUtils.getCapsMode("", 0, 0) + 31, 20220 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTapTimeout() >> 16)), 44 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getMode(0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ExpandableListView.getPackedPositionChild(0L)), (KeyEvent.getMaxKeyCode() >> 16) + 44, 1493 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 49123), KeyEvent.normalizeMetaState(0) + 44, 1494 - TextUtils.indexOf("", "", 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{23324, 24872, 12116, 62859, 45992, 31228, 1547};
        onExtraCallback = 283882390625376250L;
    }
}
