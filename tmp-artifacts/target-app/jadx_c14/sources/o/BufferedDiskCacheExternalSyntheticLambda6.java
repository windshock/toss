package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BufferedDiskCacheExternalSyntheticLambda6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BufferedDiskCacheExternalSyntheticLambda6[] $VALUES;
    public static final BufferedDiskCacheExternalSyntheticLambda6 FAILED;
    private static long IAuthTabCallback;
    public static final BufferedDiskCacheExternalSyntheticLambda6 PENDING;
    public static final BufferedDiskCacheExternalSyntheticLambda6 SUCCESS;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {60, -123, -116, -1};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            byte[] r0 = o.BufferedDiskCacheExternalSyntheticLambda6.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = r6 + 97
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BufferedDiskCacheExternalSyntheticLambda6.$$c(byte, short, int):java.lang.String");
    }

    private static final /* synthetic */ BufferedDiskCacheExternalSyntheticLambda6[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BufferedDiskCacheExternalSyntheticLambda6 bufferedDiskCacheExternalSyntheticLambda6 = PENDING;
        if (i3 == 0) {
            return new BufferedDiskCacheExternalSyntheticLambda6[]{bufferedDiskCacheExternalSyntheticLambda6, SUCCESS, FAILED};
        }
        BufferedDiskCacheExternalSyntheticLambda6[] bufferedDiskCacheExternalSyntheticLambda6Arr = {bufferedDiskCacheExternalSyntheticLambda6, SUCCESS};
        bufferedDiskCacheExternalSyntheticLambda6Arr[5] = FAILED;
        return bufferedDiskCacheExternalSyntheticLambda6Arr;
    }

    public static EnumEntries<BufferedDiskCacheExternalSyntheticLambda6> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<BufferedDiskCacheExternalSyntheticLambda6> enumEntries = $ENTRIES;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    public static BufferedDiskCacheExternalSyntheticLambda6 valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        BufferedDiskCacheExternalSyntheticLambda6 bufferedDiskCacheExternalSyntheticLambda6 = (BufferedDiskCacheExternalSyntheticLambda6) Enum.valueOf(BufferedDiskCacheExternalSyntheticLambda6.class, str);
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return bufferedDiskCacheExternalSyntheticLambda6;
    }

    public static BufferedDiskCacheExternalSyntheticLambda6[] values() {
        BufferedDiskCacheExternalSyntheticLambda6[] bufferedDiskCacheExternalSyntheticLambda6Arr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            bufferedDiskCacheExternalSyntheticLambda6Arr = (BufferedDiskCacheExternalSyntheticLambda6[]) $VALUES.clone();
            int i3 = 31 / 0;
        } else {
            bufferedDiskCacheExternalSyntheticLambda6Arr = (BufferedDiskCacheExternalSyntheticLambda6[]) $VALUES.clone();
        }
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return bufferedDiskCacheExternalSyntheticLambda6Arr;
    }

    private BufferedDiskCacheExternalSyntheticLambda6(String str, int i) {
    }

    static {
        onExtraCallbackWithResult = 0;
        IAuthTabCallback();
        PENDING = new BufferedDiskCacheExternalSyntheticLambda6("PENDING", 0);
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getFadingEdgeLength() >> 16, View.getDefaultSize(0, 0) + 7, (char) ExpandableListView.getPackedPositionGroup(0L), objArr);
        SUCCESS = new BufferedDiskCacheExternalSyntheticLambda6(((String) objArr[0]).intern(), 1);
        FAILED = new BufferedDiskCacheExternalSyntheticLambda6("FAILED", 2);
        BufferedDiskCacheExternalSyntheticLambda6[] bufferedDiskCacheExternalSyntheticLambda6Arr$values = $values();
        $VALUES = bufferedDiskCacheExternalSyntheticLambda6Arr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(bufferedDiskCacheExternalSyntheticLambda6Arr$values);
        int i = onTransact + 13;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 115;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - TextUtils.indexOf("", "")), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 46134), 30 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getScrollBarSize() >> 8) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int i7 = 45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int i8 = 1495 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b = (byte) ($$a[3] + 1);
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i7, i8, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 57;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                try {
                    Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback4 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123);
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44;
                        int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1493;
                        byte b3 = (byte) ($$a[3] + 1);
                        byte b4 = b3;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(pressedStateDuration, i10, i11, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback5 == null) {
                char cRed = (char) (49123 - Color.red(0));
                int i12 = 45 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1495;
                byte b5 = (byte) ($$a[3] + 1);
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cRed, i12, i13, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{60807, 6265, 1639, 3199, 14961, 8287, 11863};
        IAuthTabCallback = 9153600645055846444L;
    }
}
