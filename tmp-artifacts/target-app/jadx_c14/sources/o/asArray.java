package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class asArray {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ asArray[] $VALUES;
    public static final onNavigationEvent Companion;
    public static final asArray PW_4_DIGIT_1_ALPHA;
    public static final asArray PW_6_DIGIT;
    private static long onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {61, -49, -70, 93};
    private static final int $$b = 135;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            byte[] r0 = o.asArray.$$a
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r6 = r6 * 3
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.asArray.$$c(short, byte, short):java.lang.String");
    }

    private static final /* synthetic */ asArray[] $values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        asArray[] asarrayArr = {PW_4_DIGIT_1_ALPHA, PW_6_DIGIT};
        int i5 = i2 + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return asarrayArr;
    }

    public static EnumEntries<asArray> getEntries() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<asArray> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return enumEntries;
    }

    public static asArray valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        asArray asarray = (asArray) Enum.valueOf(asArray.class, str);
        if (i3 == 0) {
            return asarray;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static asArray[] values() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        asArray[] asarrayArr = (asArray[]) $VALUES.clone();
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return asarrayArr;
    }

    private asArray(String str, int i) {
    }

    static {
        onNavigationEvent = 0;
        onExtraCallbackWithResult();
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getFadingEdgeLength() >> 16, TextUtils.getOffsetBefore("", 0) + 18, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr);
        PW_4_DIGIT_1_ALPHA = new asArray(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), objArr2);
        PW_6_DIGIT = new asArray(((String) objArr2[0]).intern(), 1);
        asArray[] asarrayArr$values = $values();
        $VALUES = asarrayArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(asarrayArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onNavigationEvent(defaultConstructorMarker);
        int i = onTransact + 39;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final asArray not() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback.onWarmupCompleted[ordinal()];
        if (i4 == 1) {
            return PW_6_DIGIT;
        }
        int i5 = IAuthTabCallback;
        int i6 = i5 + 37;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0 ? i4 != 2 : i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        asArray asarray = PW_4_DIGIT_1_ALPHA;
        int i7 = i5 + 109;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return asarray;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setPluginVersion toSpec() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback.onWarmupCompleted[ordinal()];
        if (i4 != 1) {
            int i5 = onExtraCallback + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 2 : i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return setPluginVersion.PW_6_DIGIT;
        }
        setPluginVersion setpluginversion = setPluginVersion.PW_4_DIGIT_1_ALPHA;
        int i6 = IAuthTabCallback + 47;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return setpluginversion;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 39;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i >>> i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 59697), 17 - View.resolveSize(0, 0), 10973 - TextUtils.indexOf("", ""), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 20221 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 43 - TextUtils.indexOf((CharSequence) "", '0'), (-16775722) - Color.rgb(0, 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTouchSlop() >> 8)), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 10973 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, TextUtils.getTrimmedLength("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, 1495 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49123), 44 - ExpandableListView.getPackedPositionType(0L), View.resolveSizeAndState(0, 0, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i7 = $11 + 81;
        $10 = i7 % 128;
        if (i7 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i8 = 51 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{60804, 13318, 24193, 24943, 35743, 53769, 62595, 7984, 8629, 18477, 37561, 46418, 57271, 58964, 2270, 21327, 30156, 40000, 60804, 13318, 24193, 24941, 35743, 53769, 62595, 7984, 8629, 18477};
        onExtraCallbackWithResult = -8261832456064453551L;
    }
}
