package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReactPackageHelpergetNativeModuleIterator11 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReactPackageHelpergetNativeModuleIterator11[] $VALUES;

    @SerializedName("ACTIVATED")
    public static final ReactPackageHelpergetNativeModuleIterator11 ACTIVATED;

    @SerializedName("CANCELED")
    public static final ReactPackageHelpergetNativeModuleIterator11 CANCELED;

    @SerializedName("CLOSED")
    public static final ReactPackageHelpergetNativeModuleIterator11 CLOSED;

    @SerializedName("CREATED")
    public static final ReactPackageHelpergetNativeModuleIterator11 CREATED;

    @SerializedName("DEACTIVATED")
    public static final ReactPackageHelpergetNativeModuleIterator11 DEACTIVATED;
    private static int IAuthTabCallbackStub;

    @SerializedName("LOST")
    public static final ReactPackageHelpergetNativeModuleIterator11 LOST;

    @SerializedName("MAKING")
    public static final ReactPackageHelpergetNativeModuleIterator11 MAKING;

    @SerializedName("PENDING")
    public static final ReactPackageHelpergetNativeModuleIterator11 PENDING;

    @SerializedName("SHIPPED")
    public static final ReactPackageHelpergetNativeModuleIterator11 SHIPPED;

    @SerializedName("SHIPPING")
    public static final ReactPackageHelpergetNativeModuleIterator11 SHIPPING;

    @SerializedName("SHIPPING_FAILED")
    public static final ReactPackageHelpergetNativeModuleIterator11 SHIPPING_FAILED;
    private static char[] onExtraCallback;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {80, -19, -87, -22};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 97 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = o.ReactPackageHelpergetNativeModuleIterator11.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ReactPackageHelpergetNativeModuleIterator11.$$c(byte, byte, short):java.lang.String");
    }

    private static final /* synthetic */ ReactPackageHelpergetNativeModuleIterator11[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ReactPackageHelpergetNativeModuleIterator11[] reactPackageHelpergetNativeModuleIterator11Arr = {CREATED, CANCELED, PENDING, MAKING, SHIPPING, SHIPPED, SHIPPING_FAILED, ACTIVATED, DEACTIVATED, LOST, CLOSED};
        int i5 = i2 + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return reactPackageHelpergetNativeModuleIterator11Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ReactPackageHelpergetNativeModuleIterator11> getEntries() {
        EnumEntries<ReactPackageHelpergetNativeModuleIterator11> enumEntries;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 42 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReactPackageHelpergetNativeModuleIterator11 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageHelpergetNativeModuleIterator11 reactPackageHelpergetNativeModuleIterator11 = (ReactPackageHelpergetNativeModuleIterator11) Enum.valueOf(ReactPackageHelpergetNativeModuleIterator11.class, str);
        if (i3 == 0) {
            return reactPackageHelpergetNativeModuleIterator11;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReactPackageHelpergetNativeModuleIterator11[] values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ReactPackageHelpergetNativeModuleIterator11[] reactPackageHelpergetNativeModuleIterator11Arr = (ReactPackageHelpergetNativeModuleIterator11[]) $VALUES.clone();
        int i4 = onNavigationEvent + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return reactPackageHelpergetNativeModuleIterator11Arr;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i4])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), 10973 - (ViewConfiguration.getFadingEdgeLength() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 46135), Color.blue(0) + 31, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49122), 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 1495, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $10 + 17;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private ReactPackageHelpergetNativeModuleIterator11(String str, int i) {
    }

    static {
        IAuthTabCallbackStub = 1;
        onNavigationEvent();
        CREATED = new ReactPackageHelpergetNativeModuleIterator11("CREATED", 0);
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0), 8 - KeyEvent.keyCodeFromString(""), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        CANCELED = new ReactPackageHelpergetNativeModuleIterator11(((String) objArr[0]).intern(), 1);
        PENDING = new ReactPackageHelpergetNativeModuleIterator11("PENDING", 2);
        MAKING = new ReactPackageHelpergetNativeModuleIterator11("MAKING", 3);
        SHIPPING = new ReactPackageHelpergetNativeModuleIterator11("SHIPPING", 4);
        SHIPPED = new ReactPackageHelpergetNativeModuleIterator11("SHIPPED", 5);
        SHIPPING_FAILED = new ReactPackageHelpergetNativeModuleIterator11("SHIPPING_FAILED", 6);
        ACTIVATED = new ReactPackageHelpergetNativeModuleIterator11("ACTIVATED", 7);
        DEACTIVATED = new ReactPackageHelpergetNativeModuleIterator11("DEACTIVATED", 8);
        LOST = new ReactPackageHelpergetNativeModuleIterator11("LOST", 9);
        CLOSED = new ReactPackageHelpergetNativeModuleIterator11("CLOSED", 10);
        ReactPackageHelpergetNativeModuleIterator11[] reactPackageHelpergetNativeModuleIterator11Arr$values = $values();
        $VALUES = reactPackageHelpergetNativeModuleIterator11Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(reactPackageHelpergetNativeModuleIterator11Arr$values);
        int i = onExtraCallbackWithResult + 37;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final boolean isCompleteIssue() {
        int i = 2 % 2;
        if (this != PENDING && this != MAKING && this != SHIPPING) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 33;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this != SHIPPED) {
                int i5 = i2 + 91;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                if (this != SHIPPING_FAILED) {
                    return false;
                }
            }
        }
        int i7 = onNavigationEvent + 117;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 10 / 0;
        }
        return true;
    }

    public final boolean haveUssCard() {
        int i = 2 % 2;
        if (this != ACTIVATED && this != DEACTIVATED) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 79;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this != LOST) {
                int i5 = i2 + 3;
                IAuthTabCallback = i5 % 128;
                z = i5 % 2 != 0;
                int i6 = i2 + 81;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return z;
    }

    public final boolean isAvailableRegister() {
        int i = 2 % 2;
        if (this == SHIPPING || this == SHIPPED || this == SHIPPING_FAILED) {
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    static void onNavigationEvent() {
        onExtraCallback = new char[]{60823, 41946, 28932, 1914, 54445, 27155, 14411, 51641};
        onWarmupCompleted = 3206370047273378715L;
    }
}
